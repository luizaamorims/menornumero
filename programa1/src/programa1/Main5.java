package programa1;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		int cont = 0;
		
		
		for (int i= 1; i <= numero; i++) {
			if (numero % i == 0) {
				cont++; 
			}
			
		}

		if (cont == 2) {
			System.out.println("o numero é primo!");
		} else {
			System.out.println("o numero não é primo!");
		}
			sc.close();
	}

}
