package exer5;

import javax.xml.ws.Endpoint;

public class Servidor {
	public static void main(String[] args) {
		try {
			//http://127.0.0.1:9090/livraria?wsdl
			Endpoint.publish("http://127.0.0.1:9091/visa", new CartaoVisaImp());
			System.out.println("Servidor está rodando" + "CartaoVisa");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
