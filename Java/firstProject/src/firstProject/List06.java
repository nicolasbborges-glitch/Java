package firstProject;

import java.util.Scanner;

public class List06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 - Intervalo numérico
		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		if (num >= 10 && num <= 20) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}

		// 2 - Acesso à festa
		System.out.println("Qual a sua idade? ");
		int idade = sc.nextInt();
		System.out.println("Possui convite? (sim/nao)");
		String convite = sc.next();

		if (idade >= 18 && convite.equalsIgnoreCase("sim")) {
			System.out.println("Entrada permitida!");
		} else {
			System.out.println("Entrada não permitida.");
		}

		// 3 - Categoria de esporte
		System.out.println("Informe a idade para categoria: ");
		int idadeCat = sc.nextInt();

		if (idadeCat < 12 || idadeCat > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}

		// 4 - Desconto no produto
		System.out.println("Informe o valor do produto: ");
		double valor = sc.nextDouble();
		System.out.println("Forma de pagamento (avista/cartao): ");
		String pagamento = sc.next();

		if (valor > 100 && pagamento.equalsIgnoreCase("avista")) {
			double desconto = valor * 0.10;
			double finalValor = valor - desconto;
			System.out.printf("Valor com desconto: %.2f\n", finalValor);
		} else {
			System.out.println("Valor sem desconto: " + valor);
		}

		// 5 - Triagem médica
		System.out.println("Informe sua temperatura: ");
		double temp = sc.nextDouble();
		System.out.println("Está com sintomas? (sim/nao)");
		String sintomas = sc.next();

		if (temp >= 38 || sintomas.equalsIgnoreCase("sim")) {
			System.out.println("Recomenda-se procurar um médico.");
		} else {
			System.out.println("Sem sinais preocupantes.");
		}

		// 6 - Votação
		System.out.println("Qual a sua idade? ");
		int idadeVoto = sc.nextInt();
		System.out.println("É brasileiro? (sim/nao)");
		String brasileiro = sc.next();

		if (idadeVoto >= 16 && brasileiro.equalsIgnoreCase("sim")) {
			System.out.println("Pode votar!");
		} else {
			System.out.println("Não pode votar.");
		}

		// 7 - Bônus de funcionário
		System.out.println("Informe horas extras: ");
		int horasExtras = sc.nextInt();
		System.out.println("Informe número de faltas: ");
		int faltas = sc.nextInt();

		if (horasExtras > 20 && faltas < 5) {
			System.out.println("Ganhou bônus!");
		} else {
			System.out.println("Não ganha bônus.");
		}

		// 8 - Autorização para dirigir
		System.out.println("Qual a sua idade? ");
		int idadeDirigir = sc.nextInt();
		System.out.println("Possui carteira de motorista? (sim/nao)");
		String carteira = sc.next();

		if (idadeDirigir >= 18 && carteira.equalsIgnoreCase("sim")) {
			System.out.println("Pode dirigir!");
		} else {
			System.out.println("Não pode dirigir.");
		}

		// 9 - Elegibilidade para Bolsa de Estudos
		System.out.println("Digite a nota média (0 a 10): ");
		double nota = sc.nextDouble();
		System.out.println("Digite a frequência (0 a 100): ");
		int freq = sc.nextInt();

		if (nota >= 8 && freq >= 80) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
		}

		// 10 - Verificação de Temperatura Ambiente
		System.out.println("Informe a temperatura ambiente (°C): ");
		double tempAmb = sc.nextDouble();
		System.out.println("Informe a umidade (%): ");
		int umidade = sc.nextInt();

		if ((tempAmb < 18 || tempAmb > 26) && umidade > 60) {
			System.out.println("Ajustar climatização");
		} else {
			System.out.println("Climatização não necessária");
		}

		sc.close();
	}
}
