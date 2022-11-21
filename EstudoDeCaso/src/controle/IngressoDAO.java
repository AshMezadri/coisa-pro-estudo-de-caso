package controle;

import java.util.ArrayList;

import modelo.Ingresso;
import modelo.IIngressoDAO;

public class IngressoDAO implements IIngressoDAO {

	private static ArrayList<Ingresso> tabelaIngressos = new ArrayList<>();
	private static IngressoDAO instancia;

	private IngressoDAO() {
	}

	public static IngressoDAO getInstancia() {

		if (instancia == null) {
			instancia = new IngressoDAO();
			tabelaIngressos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Ingresso i) {
		if (i != null) {
			tabelaIngressos.add(i);
			return true;
		}
		return false;
	}

	@Override
	public boolean atualizar(Ingresso f) {
		
		for (Ingresso ingresso : tabelaIngressos) {
			if (ingresso.getCodIngresso() == ingresso.getCodIngresso()) {
				ingresso.setCodIngresso(ingresso.getCodIngresso());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Ingresso ingresso) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Ingresso> listarIngressos() {
		return tabelaIngressos;
	}
}
