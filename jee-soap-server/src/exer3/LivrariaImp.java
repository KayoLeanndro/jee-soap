package exer3;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(serviceName = "LivrariaOnline", endpointInterface = "exer3.Livraria")
public class LivrariaImp implements Livraria {

	private static List<Livro> livros = new ArrayList<Livro>();
	static
	{
		livros.add(new Livro(1, "Revolucao dos bichos"));
		livros.add(new Livro(2, "1984"));
		livros.add(new Livro(3, "Mobdick"));
		livros.add(new Livro(4, "Samba terreno"));
	}
	
	@Override
	public List<Livro> getEstoque() {
		return livros;
	}

	@Override
	public Livro getLivro(Integer id) {
		for(Livro livro: livros) {
			if(livro.getId().equals(id)) {
				return livro;
			}
		}
		return null;
	}

}
