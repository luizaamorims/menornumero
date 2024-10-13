package programa1;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int numero = 9;
		int menor = 0;

		while (numero != 0) {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();

			if (numero == 0) {
				break;
			}
			if (cont == 0) {
				menor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
			cont++;

		}

		System.out.println("o menor numero foi " + menor);
		
		sc.close();

	}

}
