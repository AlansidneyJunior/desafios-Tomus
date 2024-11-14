/*7. Remoção de Duplicados
	
	Descrição: Desenvolva uma função que remova elementos duplicados de uma lista de
	números e retorne uma lista contendo apenas os elementos únicos, preservando a ordem
	original.
	
	Exemplo:
	Entrada: [1, 2, 2, 3, 4, 4, 5]
	Saída: [1, 2, 3, 4, 5]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int num;
		
		System.out.println("Digite uma lista de numeros para remover os duplicados:");
		while(scanner.hasNextInt()) {
			num = scanner.nextInt();
			if(!lista.contains(num)) {
				lista.add(num);
			}
		}
		System.out.println("Lista sem duplicados: " + lista);
		scanner.close();
	}

}
