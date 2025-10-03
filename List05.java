
package firstProject;

import java.util.Scanner;

public class List05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 - Classificação de idade
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade < 12) {
			System.out.println("Criança");
		} else if (idade < 17) {
			System.out.println("Adolescente");
		} else if (idade < 59) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}

		// 2 - Avaliação de Temperatura
		System.out.println("Informe a temperatura em °C: ");
		double temp = sc.nextDouble();

		if (temp < 10) {
			System.out.println("Muito Frio");
		} else if (temp < 20) {
			System.out.println("Frio");
		} else if (temp < 30) {
			System.out.println("Agradável");
		} else {
			System.out.println("Muito Quente");
		}

		// 3 - Sistema de Notas Escolares
		System.out.println("Informe a nota: ");
		int nota = sc.nextInt();

		if (nota > 90) {
			System.out.println("A");
		} else if (nota > 80) {
			System.out.println("B");
		} else if (nota > 70) {
			System.out.println("C");
		} else if (nota > 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// 4 - Verificação de senha
		System.out.println("Digite a senha: ");
		sc.nextLine(); // limpar buffer
		String senha = sc.nextLine();

		if (senha.equals("admin")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}

		// 5 - Comparação de nomes
		System.out.println("Digite o primeiro nome: ");
		String nome1 = sc.nextLine();
		System.out.println("Digite o segundo nome: ");
		String nome2 = sc.nextLine();

		if (nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais.");
		} else {
			System.out.println("Os nomes são diferentes.");
		}

		// 6 - Jogo da cor favorita
		System.out.println("Digite sua cor favorita: ");
		String cor = sc.nextLine();

		if (cor.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha!");
		} else if (cor.equalsIgnoreCase("vermelho")) {
			System.out.println("Cor vibrante!");
		} else if (cor.equalsIgnoreCase("verde")) {
			System.out.println("Cor da natureza!");
		} else {
			System.out.println("Cor não cadastrada.");
		}

		// 7 - Verificação de vogal
		System.out.println("Digite uma letra: ");
		String letra = sc.nextLine();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("É uma vogal.");
		} else {
			System.out.println("Não é vogal.");
		}

		sc.close();
	}
}
