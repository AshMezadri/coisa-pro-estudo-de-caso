package controle;

import java.time.LocalDateTime;
import java.util.ArrayList;

import modelo.Filme;

public class FilmeDAO {

		private ArrayList<Filme> tabelaFilmes;
		
		public FilmeDAO() {
			this.tabelaFilmes = new ArrayList<>();
		}
		
		//inserir
		
		public boolean inserir(Filme f) {
			if (f != null) {
				tabelaFilmes.add(f);
				return true;
				
			}
			return false;
		}
		
		//update
		
		public boolean atualizar(Filme f, String nomeFilme, LocalDateTime horarioFilme) {
			
			for (Filme filme : tabelaFilmes) {
				
				if (filme.getNomeFilme() == nomeFilme) {
					
					filme.setNomeFilme(f.getNomeFilme());
					filme.setHorarioFilme(f.getHorarioFilme());
					return true;
				}
			}
			
			return false;
			
		}
		
		// delete
		
		public boolean excluir(Filme f, String nomeFilme, LocalDateTime horarioFilme) {
			
			for (Filme filme : tabelaFilmes) {
				if(filme.getNomeFilme() == nomeFilme && filme.getHorarioFilme() == horarioFilme) {
					
					tabelaFilmes.remove(filme);
					return true;
				}
			}
			
			return false;
		}
		
		//select all
		
		public ArrayList<Filme> listaFilmes(){
			
			return this.tabelaFilmes;
		}
}
