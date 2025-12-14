package exer6;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		VisaEletron visaEletron = new VisaEletron();
		CartaoVisa proxy = visaEletron.getCartaoVisaImpPort();
		
		Consulta consulta = proxy.operacaoDebitarSaldo(BigDecimal.ONE);
		System.out.println(consulta.getMensagem());
		
		proxy.operacaoCreditarSaldo(BigDecimal.valueOf(233));
		
		consulta = proxy.operacaoDebitarSaldo(BigDecimal.valueOf(2000));
		System.out.println(consulta.getMensagem());
		
		
	}
}
