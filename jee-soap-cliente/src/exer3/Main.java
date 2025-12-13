package exer3;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	LivrariaOnline servico = new LivrariaOnline();
		
		Livraria proxy = servico.getLivrariaImpPort();

		List<Livro> estoque = proxy.getEstoque();
		
		estoque.forEach(l -> System.out.println(l.getId() + " - " + l.getNomeLivro()));
		
		Livro l1 = proxy.getLivro(1);
		System.out.println(l1.getNomeLivro());
		
		Livro l2 = proxy.getLivro(2);
		System.out.println(l2.getNomeLivro());
	}
}
