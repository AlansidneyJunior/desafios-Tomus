/* 3. Fatorial Recursivo

	Descrição: Desenvolva uma função que calcule o fatorial de um número inteiro usando
	recursão.
	
	Exemplo:
	Entrada: 5
	Saída: 120
*/

import java.util.Scanner;

public class Desafio3 {

	public static int fatorial(int n) {
		
		if(n==1) {
			return 1;
		}else {
			return n * fatorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo para calcular seu fatorial:");
		int n = scan.nextInt();
		int result = fatorial(n);
		System.out.println(result);
		
		scan.close();
	}

}
