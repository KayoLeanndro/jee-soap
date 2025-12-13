package exer2;

public class Main {
	public static void main(String[] args) {
		CalculadoraImpService service = new CalculadoraImpService();
		
		Calculadora proxy = service.getCalculadoraImpPort();
		
		System.out.println(proxy.soma(10, 10));
		
		
	}
}
