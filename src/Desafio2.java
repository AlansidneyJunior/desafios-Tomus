import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();
		String inversa = "";
		int tamanho = palavra.length();
		
		for(int i = tamanho-1; i>=0; i--) {
			inversa += palavra.charAt(i);
		}
		
		if(palavra.equals(inversa)) {
			System.out.println(palavra + " é palíndromo!");
		}else {
			System.out.println(palavra + " não é palíndromo!");
		}
		
		scan.close();
	}
	
}
