package modelo;

import java.util.ArrayList;

public interface IIngressoDAO {
	
	public boolean inserir(Ingresso ingresso);
	
	public boolean atualizar(Ingresso ingresso);

	public boolean excluir(Ingresso ingresso);
	
	public ArrayList<Ingresso> listarIngressos();
}
