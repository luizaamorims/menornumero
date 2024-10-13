package programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int menor;

		System.out.println("Digite um numero: ");
		menor = sc.nextInt();

		do {

			System.out.println("Digite outro numero ou 0 pra sair: ");
			numero = sc.nextInt();

			if (numero != 0 && numero < menor) {
				menor = numero;
			}

		} while (numero != 0);

		System.out.println(menor);

		sc.close();

	}
}