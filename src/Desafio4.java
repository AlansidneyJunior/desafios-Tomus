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
