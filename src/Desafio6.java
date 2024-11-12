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
