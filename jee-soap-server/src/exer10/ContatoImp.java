package exer10;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "exer10.Telefone")
public class ContatoImp implements Telefone {

	public static List<Contato> contatos = new ArrayList<Contato>();
	
	@Override
	public void adicionar(Contato contato) {
		if(contato.getNome() == null) {
			throw new IllegalArgumentException("Nome do contato não pode ser nulo!");
		}
		if(contato.getTelefone() == null) {
			throw new IllegalArgumentException("Telefone do contato não pode ser nulo!");
		}
		contatos.add(contato);
	}

	@Override
	public List<Contato> getContatos() {
		return contatos;
	}

	@Override
	public void deletar(Contato contato) {
		contatos.remove(contato);
	}

}
