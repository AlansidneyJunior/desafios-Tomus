/*6. Fibonacci até um Limite
	
	Descrição: Escreva uma função que receba um número limite n e retorne uma lista com
	todos os números da sequência de Fibonacci até que o próximo número ultrapasse n .
	
	Exemplo:
	Entrada: 20
	Saída: [0, 1, 1, 2, 3, 5, 8, 13]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> listaFib = new ArrayList<>();
		listaFib.add(0);
		listaFib.add(1);
		int fibAtual = 0;
		int i=0;
		
		System.out.println("Digite um número limite para a série Fibonacci");
		int limite = scanner.nextInt();
		
		while(fibAtual < limite) {
			fibAtual = listaFib.get(i) + listaFib.get(i+1);
			
			if(fibAtual <= limite) {
				listaFib.add(fibAtual);
			}
			
			i++;
		}
		
		System.out.println(listaFib);
		
		scanner.close();
	}

}
