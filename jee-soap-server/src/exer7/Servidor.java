package exer7;

import javax.xml.ws.Endpoint;

public class Servidor {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://127.0.0.1:9091/datahora", new DataHoraImp());
			System.out.println("Servidor está rodando" + " datahora");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
