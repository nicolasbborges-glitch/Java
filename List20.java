package primeiroProjeto;

public class Lista20 {

	public static void main(String[] args) {
		repetirSaudacao();
		System.out.println();

		desenharRetangulo();
		System.out.println();

		imprimirMultiplosDe5();
		System.out.println();

		contagemCrescente();
		System.out.println();

		mesesDoAno();
		System.out.println("\n---------------------------\n");

		System.out.println("Funções com parâmetro:");
		verificarDivisibilidade(15);
		verificarDivisibilidade(7);

		mensagemDespedida("Fernanda");

		unirNomes("Fernanda", "Cristyne");

		verificarMaiorQue100(80);
		verificarMaiorQue100(150);

		classificarVelocidade(30);
		classificarVelocidade(60);
		classificarVelocidade(100);

		saudacaoDia("terça");

		verificarEstoque(3);
		verificarEstoque(7);
		verificarEstoque(12);
	}
	// -------- Funções sem parâmetro --------

	public static void repetirSaudacao() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Bom dia!");
		}
	}

	public static void desenharRetangulo() {
		for (int i = 0; i < 3; i++) {
			System.out.println("*****");
		}
	}

	public static void imprimirMultiplosDe5() {
		for (int i = 5; i <= 25; i += 5) {
			System.out.println(i);
		}
	}

	public static void contagemCrescente() {
		for (int i = 1; i <= 8; i++) {
			System.out.println(i);
		}
		System.out.println("Pronto!");
	}

	public static void mesesDoAno() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
	}

	// -------- Funções com parâmetro --------

	public static void verificarDivisibilidade(int numero) {
		if (numero % 5 == 0) {
			System.out.println(numero + " é divisível por 5.");
		} else {
			System.out.println(numero + " não é divisível por 5.");
		}
	}

	public static void mensagemDespedida(String nome) {
		System.out.println("Até logo, " + nome + "!");
	}

	public static void unirNomes(String primeiro, String sobrenome) {
		System.out.println("Nome completo: " + primeiro + " " + sobrenome);
	}

	public static void verificarMaiorQue100(int numero) {
		if (numero > 100) {
			System.out.println(numero + " é maior que 100.");
		} else {
			System.out.println(numero + " não é maior que 100.");
		}
	}

	public static void classificarVelocidade(int velocidade) {
		if (velocidade < 40) {
			System.out.println("Velocidade: Lenta");
		} else if (velocidade <= 80) {
			System.out.println("Velocidade: Normal");
		} else {
			System.out.println("Velocidade: Rápida");
		}
	}

	public static void saudacaoDia(String dia) {
		System.out.println("Tenha uma ótima " + dia + "!");
	}

	public static void verificarEstoque(int quantidade) {
		if (quantidade >= 10) {
			System.out.println("Estoque suficiente");
		} else if (quantidade >= 5) {
			System.out.println("Estoque baixo");
		} else {
			System.out.println("Estoque crítico");
		}
	}
}