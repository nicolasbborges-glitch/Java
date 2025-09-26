package firstProject;

import java.util.Scanner;

public class List16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Criando um vetor de cores
		System.out.println("1 - Criando um vetor de cores");
		String[] cores = new String[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("Digite a cor " + (i + 1) + ": ");
			cores[i] = scanner.next();
		}
		System.out.println("Cores digitadas:");
		for (int i = 0; i < 6; i++) {
			System.out.println("Cor " + (i + 1) + ": " + cores[i]);
		}

		System.out.println("======");

		// 2 - Vetor de números decimais
		System.out.println("2 - Vetor de números decimais");
		double[] numeros = new double[8];
		for (int i = 0; i < 8; i++) {
			System.out.print("Digite o número decimal " + (i + 1) + ": ");
			numeros[i] = scanner.nextDouble();
		}
		System.out.println("Números digitados:");
		for (int i = 0; i < 8; i++) {
			System.out.println("Número " + (i + 1) + ": " + numeros[i]);
		}

		System.out.println("======");

		// 3 - Mostrando apenas os pares
		System.out.println("3 - Mostrando apenas os pares");
		int[] inteiros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número inteiro " + (i + 1) + ": ");
			inteiros[i] = scanner.nextInt();
		}
		System.out.println("Números pares digitados:");
		for (int i = 0; i < 10; i++) {
			if (inteiros[i] % 2 == 0) {
				System.out.println(inteiros[i]);
			}
		}

		System.out.println("======");

		// 4 - Menores que 50
		System.out.println("4 - Menores que 50");
		int[] valores = new int[12];
		for (int i = 0; i < 12; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			valores[i] = scanner.nextInt();
		}
		for (int i = 0; i < 12; i++) {
			if (valores[i] < 50) {
				System.out.println(valores[i] + " é menor que 50");
			}
		}

		System.out.println("======");

		// 5 - Procurando um nome no vetor
		System.out.println("5 - Procurando um nome no vetor");
		String[] nomes = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome " + (i + 1) + ": ");
			nomes[i] = scanner.next();
		}

		System.out.print("Digite um nome para procurar: ");
		String busca = scanner.next();

		int qtd = 0;
		for (int i = 0; i < 5; i++) {
			if (nomes[i].equalsIgnoreCase(busca)) {
				qtd++;
			}
		}
		if (qtd > 0) {
			System.out.println("O nome existe.");
		} else {
			System.out.println("O nome não foi encontrado.");
		}

		System.out.println("======");

		// 6 - Produto e preço
		System.out.println("6 - Produto e preço");
		String[] produtos = new String[4];
		double[] precos = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o nome do produto " + (i + 1) + ": ");
			produtos[i] = scanner.next();
			System.out.print("Digite o preço do produto " + (i + 1) + ": ");
			precos[i] = scanner.nextDouble();
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
		}

		System.out.println("======");

		// 7 - Verificação de notas
		System.out.println("7 - Verificação de notas");
		double[] notas = new double[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}
		for (int i = 0; i < 6; i++) {
			if (notas[i] < 6) {
				System.out.println("Aluno reprovado");
			} else if (notas[i] >= 6 && notas[i] <= 7) {
				System.out.println("Aluno em recuperação");
			} else {
				System.out.println("Aluno aprovado");
			}
		}

		System.out.println("======");

		// 8 - Promoção de ingressos
		System.out.println("8 - Promoção de ingressos");
		double[] ingressos = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o preço do ingresso " + (i + 1) + ": ");
			ingressos[i] = scanner.nextDouble();
		}
		for (int i = 0; i < 5; i++) {
			if (ingressos[i] > 100) {
				System.out.println("Ingresso " + (i + 1) + " com promoção disponível!");
			}
		}

	}
}
