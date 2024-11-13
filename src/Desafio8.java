import java.util.Arrays;
import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String texto = scanner.nextLine();
		
		String [] strSplit = texto.split(" ");
		
		Arrays.sort(strSplit);
		
		String strFinal = String.join(" ", strSplit);
		
		System.out.println(strFinal);
		scanner.close();
	}

}
