package modelo;

import java.time.LocalDateTime;

public class Filme {
	
	private String nomeFilme;
	private LocalDateTime horarioFilme;

	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
	
	public LocalDateTime getHorarioFilme() {
		return horarioFilme;
	}
	public void setHorarioFilme(LocalDateTime horarioFilme) {
		this.horarioFilme = horarioFilme;
	}
}
