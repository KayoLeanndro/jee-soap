package exer15;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args)  {
		VendaImpService service = new VendaImpService();
		Venda proxy = service.getVendaImpPort();
		
		Produto produto = new Produto();
		produto.setNome("Prod 1");
		produto.setValor(BigDecimal.TEN);
		
		try {
			proxy.vender(produto);
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}
}
