/* 4. Maior Número em uma Lista
 * 
	Descrição: Escreva uma função que receba uma lista de números e retorne o maior valor
	presente na lista. Não use funções prontas como max() .
	
	Exemplo:
	Entrada: [5, 3, 9, 1]
	Saída: 9
*/


import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num, maior = Integer.MIN_VALUE;
		
		System.out.println("Digite uma lista de inteiros separados por espaço. "
							+ "Caso queira parar, digite um caracter não inteiro");
		
		while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if(num >= maior) {
            	maior = num;
            }
        }
		
		System.out.println("O maior valor da lista é " + maior);
		scanner.close();
	}

}
