package exer1;

import javax.jws.WebService;

@WebService(endpointInterface = "exer1.Calculadora")
public class CalculadoraImp implements Calculadora {

	@Override
	public long soma(int v1, int v2) {
		System.out.println("Executou o WS");
		return v1 + v2;
	}

}
