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
