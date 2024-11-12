import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um texto e aperte enter.");
		String texto = scanner.nextLine().toLowerCase();
		int contVogais = 0;
		
		for(int i = 0; i<texto.length();i++) {
			if( texto.charAt(i) == 'a' ||
				texto.charAt(i) == 'e' ||
				texto.charAt(i) == 'i' ||
				texto.charAt(i) == 'o' ||
				texto.charAt(i) == 'u'){
				
				contVogais++;
			}
		}
		
		System.out.println("O texto tem " + contVogais + " vogais.");
		
		
		scanner.close();
	}

}
