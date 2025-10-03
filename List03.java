package firstProject;

import java.util.Scanner;

public class List03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Soma de dois números
		System.out.println("=== Exercício 1 - Soma de dois números ===");
		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int num2 = scanner.nextInt();
		System.out.println("Soma: " + (num1 + num2));

		// 2 - Divisão inteira e resto
		System.out.println("\n=== Exercício 2 - Divisão e Resto ===");
		System.out.print("Digite o primeiro número inteiro: ");
		int a = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int b = scanner.nextInt();
		System.out.println("Divisão inteira: " + (a / b));
		System.out.println("Resto: " + (a % b));

		// 3 - Perímetro do triângulo
		System.out.println("\n=== Exercício 3 - Perímetro do Triângulo ===");
		System.out.print("Lado 1: ");
		double lado1 = scanner.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 =scanner.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = scanner.nextDouble();
		double perimetro = lado1 + lado2 + lado3;
		System.out.printf("Perímetro: %.2f%n", perimetro);

		// 4 - Calculadora de gorjeta
		System.out.println("\n=== Exercício 4 - Calculadora de Gorjeta ===");
		System.out.print("Valor da conta: ");
		double conta = scanner.nextDouble();
		System.out.print("Porcentagem de gorjeta: ");
		double porc = scanner.nextDouble();
		double gorjeta = conta * (porc / 100);
		double totalConta = conta + gorjeta;
		System.out.printf("Gorjeta: %.2f%n", gorjeta);
		System.out.printf("Total a pagar: %.2f%n", totalConta);

		// 5 - Área de círculo
		System.out.println("\n=== Exercício 5 - Área do Círculo ===");
		System.out.print("Digite o raio: ");
		double raio = scanner.nextDouble();
		double areaCirculo = 3.14159 * raio * raio;
		System.out.printf("Área: %.2f%n", areaCirculo);

		// 6 - Idade em dias
		System.out.println("\n=== Exercício 6 - Idade em Dias ===");
		System.out.print("Anos: ");
		int anos = scanner.nextInt();
		System.out.print("Meses: ");
		int meses = scanner.nextInt();
		System.out.print("Dias: ");
		int dias = scanner.nextInt();
		int totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Total de dias vividos: " + totalDias);

		// 7 - Pagamento por hora
		System.out.println("\n=== Exercício 7 - Pagamento por Hora ===");
		System.out.print("Horas trabalhadas: ");
		double horas = scanner.nextDouble();
		System.out.print("Valor por hora: ");
		double valorHora = scanner.nextDouble();
		double salarioBruto = horas * valorHora;
		double imposto = salarioBruto * 0.10;
		double salarioLiquido = salarioBruto - imposto;
		System.out.printf("Salário bruto: %.2f%n", salarioBruto);
		System.out.printf("Imposto: %.2f%n", imposto);
		System.out.printf("Salário líquido: %.2f%n", salarioLiquido);


	}
}
