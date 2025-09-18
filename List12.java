package firstProject;

import java.util.Scanner;

public class List12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 
		System.out.println("Exercício 1 - Contador de 10 a 30:");
		int i = 10;
		do {
			System.out.println(i);
			i++;
		} while (i <= 30);


		// 2 
		System.out.println("\nExercício 2 - Adivinhação de número:");
		int numero;
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
		} while (numero != 5);
		System.out.println("Você acertou! O número era 5.");


		// 3 
		System.out.println("\nExercício 3 - Verificação de peso da mala:");
		double peso;
		do {
			System.out.print("Digite o peso da mala (kg): ");
			peso = sc.nextDouble();
			if (peso > 23) {
				System.out.println("Peso excedido! Tente novamente.");
			}
		} while (peso > 23);
		System.out.println("Mala dentro do limite permitido.");


		// 4 
		System.out.println("\nExercício 4 - Páginas lidas na semana:");
		int dias = 1;
		int totalPaginas = 0;
		do {
			System.out.print("Digite páginas lidas no dia " + dias + ": ");
			totalPaginas += sc.nextInt();
			dias++;
		} while (dias <= 7);
		System.out.println("Total de páginas lidas na semana: " + totalPaginas);


		// 5 
		System.out.println("\nExercício 5 - Código de acesso:");
		int codigo;
		do {
			System.out.print("Digite o código de acesso (3 dígitos): ");
			codigo = sc.nextInt();
			if (codigo != 789) {
				System.out.println("Código incorreto! Tente novamente.");
			}
		} while (codigo != 789);
		System.out.println("Acesso liberado!");


		// 6 -
		System.out.println("\nExercício 6 - Verificação de combustível:");
		double combustivel;
		do {
			System.out.print("Digite o nível de combustível (litros): ");
			combustivel = sc.nextDouble();
			if (combustivel <= 10) {
				System.out.println("Combustível baixo! Abasteça mais.");
			}
		} while (combustivel <= 10);
		System.out.println("Nível suficiente de combustível!");


		// 7 
		System.out.println("\nExercício 7 - Quilômetros percorridos:");
		int distancia;
		int totalDistancia = 0;
		do {
			System.out.print("Digite a distância percorrida (0 ou negativo para parar): ");
			distancia = sc.nextInt();
			if (distancia > 0) {
				totalDistancia += distancia;
			}
		} while (distancia > 0);
		System.out.println("Total percorrido na viagem: " + totalDistancia + " km");
		
	}
}


