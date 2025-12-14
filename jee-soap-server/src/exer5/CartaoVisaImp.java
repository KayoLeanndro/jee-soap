package exer5;

import java.math.BigDecimal;

import javax.jws.WebService;

@WebService(serviceName = "VisaEletron", endpointInterface = "exer5.CartaoVisa",
targetNamespace = "http://visa.eletron.consulta")
public class CartaoVisaImp implements CartaoVisa{

	public static BigDecimal saldo = new BigDecimal("10000");
	
	@Override
	public Consulta debitarSaldo(BigDecimal valor) {
		Consulta consulta = new Consulta();
		if(valor.compareTo(saldo) <= 0) {
			saldo = saldo.subtract(valor);
			consulta.setMensagem("Saldo Disponivel - " + saldo.toString());
			consulta.setDebito(true);
		}else {
			consulta.setMensagem("Saldo Insuficiente - " + saldo.toString());
			consulta.setDebito(false);
		}
		return consulta;
	}

	@Override
	public void creditarSaldo(BigDecimal valor) {
		saldo = saldo.add(valor);
	}

	@Override
	public BigDecimal processarTaxa() {
		return null;
	}

}
