package exer5;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "VisaEletron",
		targetNamespace = "http://visa.eletron.consulta")
public interface CartaoCredito {
	
	@WebMethod(operationName = "operacaoDebitarSaldo")
	@WebResult(name ="resultadoConsulta")
	Consulta debitarSaldo(BigDecimal valor);
	
	void creditarSaldo(BigDecimal valor);
	@WebMethod(exclude = true)
	BigDecimal processarTaxa();
}
