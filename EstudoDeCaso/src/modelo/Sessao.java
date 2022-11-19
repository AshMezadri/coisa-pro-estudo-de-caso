package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sessao {

	private Integer numeroSala;
	private char fileira;
	private Integer cadeira;
	private LocalDate dia;
	private LocalDateTime horario;
	private String filmeEscolhido;
	
	
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	
	public char getFileira() {
		return fileira;
	}
	public void setFileira(char fileira) {
		this.fileira = fileira;
	}
	
	
	public Integer getCadeira() {
		return cadeira;
	}
	public void setCadeira(Integer cadeira) {
		this.cadeira = cadeira;
	}
	
	
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	
	
	public String getFilmeEscolhido() {
		return filmeEscolhido;
	}
	public void setFilmeEscolhido(String filmeEscolhido) {
		this.filmeEscolhido = filmeEscolhido;
	}
	
	
	
}
