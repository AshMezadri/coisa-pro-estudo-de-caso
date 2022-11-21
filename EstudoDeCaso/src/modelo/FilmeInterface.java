package modelo;

import java.util.ArrayList;

public interface FilmeInterface {
	
	public boolean inserir(Filme filme) ;
	
	public boolean atualizar(Filme filme);
	
	public boolean excluir(Filme filme) ;
	
	public ArrayList<Filme> listaFilmes();

}
