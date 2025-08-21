package firstProject;
public class List2 {
  public static void main(String[] args) {
   java.util.Scanner scanner = new java.util.Scanner(System.in);

  // 1 - Resultado de dois números
   System.out.println("Exercício 1 - Operações entre dois números");
   System.out.print("Digite o primeiro número: ");
   double num1 = scanner.nextDouble();

   System.out.print("Digite o segundo número (≠ 0): ");
   double num2 = scanner.nextDouble();

    if (num2 != 0) {
     System.out.println("Soma: " + (num1 + num2));
     System.out.println("Subtração: " + (num1 - num2));
     System.out.println("Multiplicação: " + (num1 * num2));
     System.out.println("Divisão: " + (num1 / num2));
   } else {
            System.out.println("Erro: O segundo número não pode ser zero!");
   }

  // 2 - Cálculo de temperatura
     System.out.println("\nExercício 2 - Celsius para Fahrenheit");
     System.out.print("Informe a temperatura em Celsius: ");
     double celsius = scanner.nextDouble();
     double fahrenheit = (celsius * 1.8) + 32;
     System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

  // 3 - Conversão de valor
     System.out.println("\nExercício 3 - Conversão de real para dólar");
     System.out.print("Informe o valor em reais: ");
     double real = scanner.nextDouble();
     double dolar = real / 5.70;
     System.out.println("Valor convertido em dólar: $" + dolar);

  // 4 - Área do retângulo
      System.out.println("\nExercício 4 - Área do retângulo");
      System.out.print("Informe a base do retângulo: ");
      double base = scanner.nextDouble();
      System.out.print("Informe a altura do retângulo: ");
      double altura = scanner.nextDouble();
      double area = base * altura;
      System.out.println("Área do retângulo: " + area);

   // 5 - Conversor de idade
      System.out.println("\nExercício 5 - Idade em meses");
      System.out.print("Informe sua idade em anos: ");
      int idadeAnos = scanner.nextInt();
      int idadeMeses = idadeAnos * 12;
      System.out.println("Você viveu aproximadamente " + idadeMeses + " meses.");

   // 6 - Conversor de minutos para segundos
      System.out.println("\nExercício 6 - Minutos para segundos");
      System.out.print("Informe o tempo em minutos: ");
      int minutos = scanner.nextInt();
      int segundos = minutos * 60;
      System.out.println("Tempo em segundos: " + segundos);

   // 7 - Custo da compra
      System.out.println("\nExercício 7 - Custo total da compra");
      System.out.print("Informe o preço do produto: ");
      double preco = scanner.nextDouble();
      System.out.print("Informe a quantidade comprada: ");
      int quantidade = scanner.nextInt();
      double totalCompra = preco * quantidade;
      System.out.println("Custo total: R$" + totalCompra);

   // 8 - Divisão de conta de restaurante
      System.out.println("\nExercício 8 - Divisão da conta");
      System.out.print("Informe o valor total da conta: ");
      double totalConta = scanner.nextDouble();
      System.out.print("Informe o número de pessoas: ");
      int pessoas = scanner.nextInt();
      double valorPorPessoa = totalConta / pessoas;
      System.out.println("Cada pessoa deve pagar R$" + valorPorPessoa);

    // 9 - Cálculo de troco
      System.out.println("\nExercício 9 - Cálculo de troco");
      System.out.print("Informe o valor da compra: ");
      double valorCompra = scanner.nextDouble();
      System.out.print("Informe o valor pago pelo cliente: ");
      double valorPago = scanner.nextDouble();
      double troco = valorPago - valorCompra;

     if (troco < 0) {
            System.out.println("Valor insuficiente! Faltam R$" + Math.abs(troco));
     } else {
            System.out.println("Troco: R$" + troco);
  }

        scanner.close();
    }
}
