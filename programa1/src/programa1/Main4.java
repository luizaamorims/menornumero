package programa1;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		for (int i= 1; i <= numero; i++) {
			if (numero % i == 0) {		
				System.out.println("divisor: " + i);
			}
		}
		
		sc.close();
	}

}
