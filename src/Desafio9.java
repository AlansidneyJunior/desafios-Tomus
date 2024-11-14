import java.util.Scanner;

public class Desafio9 {
	
	public static double celsiusToFahrenheit(double temp, String escala) {
		double result;
		
		if(escala.equals("C")) {
			result = (temp * 1.8) + 32;
			return result;
			
		}else if(escala.equals("F")){
			result = (temp -32)/1.8;
			return result;
			
		}else {
			System.out.println("Escala de temperatura não aceita. Digite C=Celsius ou F=Fahrenheit.");
			return 0.0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a escala de temperatura (C=Celsius ou F=Fahrenheit).");
		String escala = scanner.next();
		System.out.println("Digite o valor da temperatura:");
		double temp = scanner.nextDouble();
		
		double result = celsiusToFahrenheit(temp, escala);
		System.out.println("A conversão resultou em: " + result + " graus.");
		
		scanner.close();
	}

}
