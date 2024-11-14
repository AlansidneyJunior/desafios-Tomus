import java.util.ArrayList;
import java.util.Scanner;

public class Desafio10 {
	
	static String inverter(String palavra) {
		String inversa = "";
		
		for(int i = palavra.length()-1; i>=0; i--) {
			inversa += palavra.charAt(i);
		}
		
		return inversa;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String texto = scanner.nextLine();
		String [] strSplit = texto.split(" ");
		ArrayList<String> strInversa = new ArrayList<>();
		
		for(String palavra : strSplit) {
			strInversa.add(inverter(palavra));
		}
		
		String textoFinal = String.join(" ",strInversa);
		System.out.println(textoFinal);
		
		scanner.close();
	}

}
