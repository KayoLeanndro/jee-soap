package exer1;

import javax.xml.ws.Endpoint;

public class Servidor {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://127.0.0.1:9090/calculadora", new CalculadoraImp());
			System.out.println("Servidor está rodando");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
