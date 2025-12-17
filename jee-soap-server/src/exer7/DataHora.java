package exer7;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService
@HandlerChain(file = "exer7/handlers.xml")
public interface DataHora {
	String get();
}
