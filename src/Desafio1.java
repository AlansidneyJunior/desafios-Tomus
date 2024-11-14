/*1 - Números Pares em um Intervalo

	Descrição: Escreva uma função que receba dois números inteiros como limites e retorne
	uma lista com todos os números pares dentro desse intervalo (inclusive os limites, se forem
	pares).
	
	Exemplo:
	Entrada: (4, 10)
	Saída: [4, 6, 8, 10]
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> pares = new ArrayList<>();
		
		System.out.println("Digite o primeiro número limite do intervalo:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número limite do intervalo:");
		int num2 = scan.nextInt();
		
		for (int i = num1; i<= num2; i++) {
			if(i%2==0) {
				pares.add(i);
			}
		}
		
		System.out.println(pares);
		scan.close();
	}
}
