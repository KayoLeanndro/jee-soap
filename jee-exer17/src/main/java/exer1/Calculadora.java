package exer1;

import javax.jws.WebService;

//Define o Contrato do WSDL
@WebService
public interface Calculadora {
	public long soma(int v1, int v2);
}
