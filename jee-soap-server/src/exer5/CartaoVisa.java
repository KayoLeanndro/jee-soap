package exer5;

import java.math.BigDecimal;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "VisaEletron",
		targetNamespace = "http://visa.eletron.consulta")
public interface CartaoVisa {
	
	@WebMethod(operationName = "operacaoDebitarSaldo")
	@WebResult(name ="resultadoConsulta")
	Consulta debitarSaldo(BigDecimal valor);
	
	@WebMethod(operationName = "operacaoCreditarSaldo")
	@Oneway
	void creditarSaldo(BigDecimal valor);
	
	@WebMethod(exclude = true)
	BigDecimal processarTaxa();
}
