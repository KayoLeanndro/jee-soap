package exer11;

public class Main {
	public static void main(String[] args) {
		ContatoImpService service = new ContatoImpService();
		Telefone client = service.getContatoImpPort();
		
		service.setHandlerResolver(new Configurador());
		
		Contato contato = new Contato();
		contato.setNome("Kayo Leanndro");
		contato.setTelefone("81986228400");
		client.adicionar(contato);
		
		contato.setNome("Kayo");
		contato.setTelefone("81986228499");
		client.adicionar(contato);
		
		contato.setNome("Leanndro");
		contato.setTelefone("81986228455");
		client.adicionar(contato);
		
		
		for(Contato contatoFor : client.getContatos()) {
			System.out.println(contatoFor.getNome() + " " + contatoFor.getTelefone());
		}
		
	}
}
