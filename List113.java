package projeto;
import java.util.Scanner;
public class List113 {

	public static void main(String[] args) {

	
		Scanner scanner = new Scanner(System.in);

		// Ex 1
		System.out.println("Exercício 1: Contador");
		for (int i = 10; i <= 30; i++) {
			System.out.println(i);
		}

		// Ex 2
		System.out.println("\nExercício 2: Classificação de Idades");
		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
		}

		// Ex 3
		System.out.println("\nExercício 3: Eleição");
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe seu voto (1-4 para candidatos, 5 para nulo, 6 para branco): ");
			int voto = scanner.nextInt();
			switch (voto) {
			case 1 -> System.out.println("Voto para o Candidato 1");
			case 2 -> System.out.println("Voto para o Candidato 2");
			case 3 -> System.out.println("Voto para o Candidato 3");
			case 4 -> System.out.println("Voto para o Candidato 4");
			case 5 -> System.out.println("Voto Nulo");
			case 6 -> System.out.println("Voto em Branco");
			default -> System.out.println("Voto inválido");
			}
		}

		// Ex 4
		System.out.println("\nExercício 4: Repetição de Frase");
		scanner.nextLine();
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();
		System.out.print("Digite o número de repetições: ");
		int numero = scanner.nextInt();
		for (int i = 0; i < numero; i++) {
			System.out.println(frase);
		}

		// Ex 5
		System.out.println("\nExercício 5: Sequência");
		for (int i = 50; i >= 30; i--) {
			System.out.println(i);
		}

		// Ex 6
		System.out.println("\nExercício 6: Números Alternados");
		for (int i = 1; i <= 50; i += 2) {
			System.out.println(i);
		}

		// Ex 7
		System.out.println("\nExercício 7: Aprovado ou Reprovado");
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite a nota do aluno " + i + ": ");
			double nota = scanner.nextDouble();
			System.out.println(nota >= 6 ? "Aprovado" : "Reprovado");
		}

		// Ex 8
		System.out.println("\nExercício 8: Categoria de Idade");
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = scanner.nextInt();
			if (idade <= 12) {
				System.out.println("Criança");
			} else if (idade <= 17) {
				System.out.println("Adolescente");
			} else if (idade <= 59) {
				System.out.println("Adulto");
			} else {
				System.out.println("Idoso");
			}
		}

		// Ex 9
		System.out.println("\nExercício 9: Número Positivo ou Negativo");
		for (int i = 1; i <= 7; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int numero1 = scanner.nextInt();
			if (numero1 > 0) {
				System.out.println("Número Positivo");
			} else if (numero1 < 0) {
				System.out.println("Número Negativo");
			} else {
				System.out.println("Zero");
			}
		}

	}
}

