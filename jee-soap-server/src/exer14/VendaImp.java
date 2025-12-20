package exer14;

import java.math.BigDecimal;

import javax.jws.WebService;

@WebService(endpointInterface = "exer14.Venda")
public class VendaImp implements Venda{

	@Override
	public void vender(Produto produto) throws Exception {

		if (produto.getNome() == null || produto.getNome().equals("")) {
			throw new VendaException("Nome do produto nao pode ser vazio!");
		}

		if (produto.getValor() == null || produto.getValor().equals(BigDecimal.ZERO)) {
			throw new VendaException("Valor do produto nao pode ser vazio ou nulo!");
		}

		
		System.out.println("Venda feita com sucesso");
	}


}
