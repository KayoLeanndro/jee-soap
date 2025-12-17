package exer8;

public class Main {
	public static void main(String[] args) {
		DataHoraImpService service = new DataHoraImpService();
		DataHora client = service.getDataHoraImpPort();
		
		System.out.println(client.get());
		System.out.println(client.get());
		System.out.println(client.get());
			
	}
}
