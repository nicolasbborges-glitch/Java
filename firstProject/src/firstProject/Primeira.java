package firstProject;

public class Primeira {


 public static void main(String[] args) {
	 System.out.println("=== Olá Mundo ===");

 // Declaração de variáveis
	 double salario = 20000;
     char letra = 'N';
     String nome = "Nícollas B.";
     boolean chuva = false;
    
 // Operações matemáticas
	 int num1 = 10;
	 int num2 = 5;
	 double soma = num1 + num2;
	 double sub = num1 - num2;
	 double div = (double) num1 / num2;
     double multi = num1 * num2;
     double resto = num1 % num2;

 // Exibição
	 System.out.println("Nome: " + nome);
     System.out.println("Salário: R$" + salario);
	 System.out.println("Letra inicial: " + letra);
	 System.out.println("Está chovendo? " + chuva);

	 System.out.println("Soma: " + soma);
	 System.out.println("Subtração: " + sub);
	 System.out.println("Divisão: " + div);
	 System.out.println("Multiplicação: " + multi);
	 System.out.println("Resto da divisão: " + resto);

  // Entrada de dados sem usar "import"
	java.util.Scanner scanner = new java.util.Scanner(System.in);

	 System.out.print("Digite sua idade: ");
     int idade = scanner.nextInt();

     System.out.print("Digite sua altura: ");
     double altura = scanner.nextDouble();

	 scanner.nextLine(); // limpa o buffer
	 System.out.print("Digite seu hobby: ");
     String hobby = scanner.nextLine();

  // Saída final
	 System.out.println("\n=== Dados Informados ===");
	 System.out.println("Idade: " + idade);
     System.out.println("Altura: " + altura + "m");
     System.out.println("Hobby: " + hobby);

	 scanner.close();
     System.out.println("Programa encerrado com sucesso.");
     
	}
}
	