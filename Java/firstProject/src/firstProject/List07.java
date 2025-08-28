package firstProject;

import java.util.Scanner;

public class List07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1 - Classificação de Filme
		System.out.println("Digite sua idade: ");
		int idadeFilme = sc.nextInt();

		if (idadeFilme < 16 || idadeFilme > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}

		// 2 - Promoção de Produto
		System.out.println("Informe o valor do produto: ");
		double valor = sc.nextDouble();
		System.out.println("Informe a quantidade comprada: ");
		int qtd = sc.nextInt();

		double total = valor * qtd;

		if (total > 200 && qtd > 5) {
			double desconto = total * 0.15;
			double finalValor = total - desconto;
			System.out.printf("Valor com desconto: %.2f\n", finalValor);
		} else {
			System.out.printf("Valor total: %.2f\n", total);
		}

		// 3 - Alerta de Saúde
		System.out.println("Informe sua frequência cardíaca (bpm): ");
		int freq = sc.nextInt();
		System.out.println("Sente tontura? (sim/nao)");
		String tontura = sc.next();

		if (freq >= 100 || tontura.equalsIgnoreCase("sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}

		// 4 - Participação em Concurso
		System.out.println("Digite sua idade: ");
		int idadeConcurso = sc.nextInt();
		System.out.println("É residente do estado? (sim/nao)");
		String residente = sc.next();

		if ((idadeConcurso >= 18 && idadeConcurso <= 30) && residente.equalsIgnoreCase("sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}

		// 5 - Recompensa por Desempenho
		System.out.println("Projetos concluídos: ");
		int projetos = sc.nextInt();
		System.out.println("Erros reportados: ");
		int erros = sc.nextInt();

		if (projetos > 10 && erros < 3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}

		// 6 - Autorização para Viagem
		System.out.println("Idade: ");
		int idadeViagem = sc.nextInt();
		System.out.println("Possui passaporte válido? (sim/nao)");
		String passaporte = sc.next();

		if (idadeViagem >= 18 && passaporte.equalsIgnoreCase("sim")) {
			System.out.println("Viagem autorizada");
		} else {
			System.out.println("Viagem não autorizada");
		}

		// 7 - Aprovação em Curso Online
		System.out.println("Nota final (0 a 100): ");
		int nota = sc.nextInt();
		System.out.println("Número de aulas assistidas (0 a 50): ");
		int aulas = sc.nextInt();

		if (nota >= 70 && aulas >= 40) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		// 8 - Controle de Irrigação
		System.out.println("Umidade do solo (%): ");
		int umidade = sc.nextInt();
		System.out.println("Temperatura (°C): ");
		int temperatura = sc.nextInt();

		if (umidade < 30 || temperatura > 30) {
			System.out.println("Irrigação necessária");
		} else {
			System.out.println("Irrigação não necessária");
		}

		// 9 - Inscrição em Feira Profissional
		System.out.println("Idade: ");
		int idadeFeira = sc.nextInt();
		System.out.println("Possui experiência prévia? (sim/nao)");
		String experiencia = sc.next();

		if ((idadeFeira >= 20 && idadeFeira <= 40) && experiencia.equalsIgnoreCase("sim")) {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("Inscrição não permitida");
		}

		sc.close();
	}
}
