package programa1;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mulher = 0;
		int casado = 0;
		int solteiro = 0;
		int media = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite seu sexo (1- mulher, 2- homem)");
			int sexo = sc.nextInt();

			if (sexo == 1) {
				mulher++;
			} else {
			}
			System.out.println("Digite sua idade");
			int idade = sc.nextInt();

			if (sexo == 1) {
				media = media + idade;
			}

			System.out.println("Digite seu estado civil (1- casado, 2- solteiro)");
			int estado = sc.nextInt();

			if (estado == 1) {
				casado++;
			} else {
				solteiro++;
			}

		}

		System.out.println("A media da idade das mulheres é de: " + (media / mulher));

		if (casado > solteiro) {
			System.out.println("tem mais casados");
		} else if (casado < solteiro) {
			System.out.println("tem mais solteiros");
		} else if (casado == solteiro) {
			System.out.println("mesma quantidade de casados e solteiros");
		}
		
		sc.close();

	}

}
