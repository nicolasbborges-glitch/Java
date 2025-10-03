package firstProject;

import java.util.Scanner;

public class List09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1 - Contador: Mostre os números de 1 a 10 no console.
		System.out.println("1 - Contador de 1 a 10:");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println();

		// 2 - Contagem regressiva: Mostre de 10 a 1 no console.
		System.out.println("2 - Contagem regressiva de 10 a 1:");
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}

		System.out.println();

		// 3 - Sequência numérica: 0 a 100 de 5 em 5.
		System.out.println("3 - Sequência de 0 a 100, de 5 em 5:");
		int k = 0;
		while (k <= 100) {
			System.out.println(k);
			k += 5;
		}

		System.out.println();

		// 4 - Mostrando mensagem 5 vezes.
		System.out.println("4 - Mostrando mensagem 5 vezes:");
		int countMsg = 1;
		while (countMsg <= 5) {
			System.out.println("Eu gosto de Java");
			countMsg++;
		}

		System.out.println();

		// 5 - Soma de 5 números digitados.
		System.out.println("5 - Digite 5 números para somar:");
		int soma = 0;
		int contador = 1;
		while (contador <= 5) {
			System.out.print("Número " + contador + ": ");
			int num = sc.nextInt();
			soma += num;
			contador++;
		}
		System.out.println("A soma dos números digitados é: " + soma);

		System.out.println();

		// 6 - Validação de senha: pedir até o usuário digitar 1234.
		System.out.println("6 - Digite a senha (1234):");
		int senha = sc.nextInt();
		while (senha != 1234) {
			System.out.println("Senha incorreta. Tente novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta!");

		System.out.println();

		// 7 - Contagem regressiva de número inteiro positivo.
		System.out.println("7 - Digite um número inteiro positivo para contagem regressiva:");
		int numContagem = sc.nextInt();

		while (numContagem < 1) {
			System.out.println("Número inválido! Digite um número inteiro positivo:");
			numContagem = sc.nextInt();
		}

		System.out.println("Contagem regressiva:");
		while (numContagem >= 1) {
			System.out.println(numContagem);
			numContagem--;
		}

		sc.close();
	}
}
