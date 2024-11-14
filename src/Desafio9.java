/* 9. Conversor de Temperatura

	Descrição: Escreva uma função que converta uma temperatura de Celsius para Fahrenheit e
	vice-versa. A função deve receber dois parâmetros: o valor da temperatura e uma string que
	indica a unidade original ( "C" para Celsius e "F" para Fahrenheit).
	
	Fórmulas:
		Fahrenheit para Celsius: C=(F − 32) / 1.8
		Celsius para Fahrenheit: F = (C x 1.8) + 32
		
	Exemplo:
	Entrada: (100, "C")
	Saída: 212
*/

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
