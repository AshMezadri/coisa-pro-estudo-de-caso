package controle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import modelo.Sessao;

public class SessaoDAO {
	
	private ArrayList<Sessao> tabelaSessao;
	
	public SessaoDAO() {
		this.tabelaSessao = new ArrayList<>();
	}
	
	//inserir
	
	public boolean incluir(Sessao s) {
		if (s != null) {
			tabelaSessao.add(s);
			return true;
		}
		return false;
	}  
	
	//update
	
	public boolean atualizar(Sessao s, Integer sala, Integer cadeira, char fileira, LocalDate dia, LocalDateTime horario, String filme ) {
		
		 for (Sessao sessao : tabelaSessao) {
			 
			 if (sessao.getFilmeEscolhido() == filme && sessao.getDia() == dia && sessao.getHorario() == horario) {
				 
				 sessao.setFilmeEscolhido(s.getFilmeEscolhido());
				 sessao.setDia(s.getDia());
				 sessao.setHorario(s.getHorario());
				 sessao.setCadeira(s.getCadeira());
				 sessao.setFileira(s.getFileira());
				 sessao.setNumeroSala(s.getNumeroSala());
				 
				 return true;
			 }
		 }
		
		 return false;
	}
	
	// delete
	
	public boolean excluir(Sessao s,Integer sala, Integer cadeira, char fileira, LocalDate dia, LocalDateTime horario, String filme ) {
		
		for (Sessao sessao : tabelaSessao) {
			
			if (sessao.getFilmeEscolhido() == filme && sessao.getDia() == dia && sessao.getHorario() == horario && sessao.getNumeroSala() == sala && sessao.getFileira() == fileira && sessao.getCadeira() == cadeira) {
				
				tabelaSessao.remove(sessao);
				return true;
			}
		}
		
		return false;
	}
	
	// select all 
	
	public ArrayList<Sessao> listaSessao(){
		
		return this.tabelaSessao;
	}
}
