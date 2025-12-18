package exer10;

import java.util.List;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService
@HandlerChain(file = "exer10/handlers.xml")
public interface Telefone {
	void adicionar(Contato contato);
	List<Contato> getContatos(); 
	void deletar(Contato contato);
}
