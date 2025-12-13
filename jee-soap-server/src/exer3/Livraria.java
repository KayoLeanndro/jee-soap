package exer3;

import java.util.List;

import javax.jws.WebService;

@WebService(serviceName = "LivrariaOnline")
public interface Livraria {
	
	List<Livro> getEstoque();
	Livro getLivro(Integer id);
	
}
