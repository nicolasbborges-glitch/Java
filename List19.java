package firstProject;

public class List18 {
	public static void main(String[] args) {

		Apresentacao();
		Frase();
		Contagem();
		Vogais();
		Quadrado();
		Pares();
		Regressiva();
		Triangulo();
		DiasSemana();
	}
	
	public static void Apresentacao() {
		System.out.println("Nicolas Barros Borges");
	}

	public static void Frase() {
		System.out.println("Só é possível fazer o impossível se acreditar que é possível");
	}

	public static void Contagem() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

	public static void Vogais() {
		System.out.println("A E I O U");
	}

	public static void Quadrado() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pares() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
	}

	public static void Regressiva() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

	public static void Triangulo() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void DiasSemana() {
		String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
						"Quinta-feira", "Sexta-feira", "Sábado"};
		for (String dia : dias) {
			System.out.println(dia);
		}
	}
}
