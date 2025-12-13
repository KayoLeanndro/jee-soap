package exer3;

public class Livro {
	private Integer id;
	private String nomeLivro;
	
	public Livro() {
		
	}
	
	public Livro(Integer id, String nomeLivro) {
		super();
		this.id = id;
		this.nomeLivro = nomeLivro;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
}
