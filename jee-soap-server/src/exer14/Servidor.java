package exer14;

import javax.xml.ws.Endpoint;

public class Servidor {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://127.0.0.1:9091/venda", new VendaImp());
			System.out.println("Servidor web está rodando");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
