package exer14;

import javax.jws.WebService;

@WebService
public interface Venda {
	void vender(Produto produto) throws Exception;
}
