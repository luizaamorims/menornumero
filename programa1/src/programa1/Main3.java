package programa1;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para calcular Fibonacci");
		int numero = sc.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;

		for (int i = 0; i <= numero; i++) {
			if (i == 0) {
				System.out.print(primeiro + " ");
			} else if (i == 1) {
				System.out.print(segundo + " ");
			} else {
				proximo = (primeiro + segundo);
				System.out.print(proximo + " ");
				primeiro = segundo;
				segundo = proximo;
			}
		}

		sc.close();

	}

}
