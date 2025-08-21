package firstProject;

import java.util.Scanner;

public class List04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  // 1 - Verificar maioridade
    System.out.print("Informe sua idade: ");
     int idade = sc.nextInt();
     if (idade >= 18) {
        System.out.println("Você tem " + idade + " anos e é maior de idade");
     } else {
         System.out.println("Você tem " + idade + " anos e é menor de idade");
     }

  // 2 - Comparar dois números
    System.out.print("Informe o primeiro número: ");
      int num1 = sc.nextInt();
      System.out.print("Informe o segundo número: ");
       int num2 = sc.nextInt();
       if (num1 > num2) {
          System.out.println("O primeiro número é maior");
     } else {
          System.out.println("O segundo número é maior ou eles são iguais");
     }

   // 3 - Aprovação por nota
     System.out.print("Informe a nota do aluno: ");
      double nota = sc.nextDouble();
      if (nota > 7) {
        System.out.println("Aprovado: sua nota foi " + nota);
     } else {
         System.out.println("Reprovado: sua nota foi " + nota);
   }

   // 4 - Verificar número positivo
     System.out.print("Informe um número: ");
      double numero = sc.nextDouble();
      if (numero > 0) {
         System.out.println("O número é positivo");
      } else {
      System.out.println("O número é negativo ou zero");
    }

    // 5 - Cálculo de frete
     System.out.print("Informe a distância de entrega em km: ");
     double distancia = sc.nextDouble();
     double frete;
     if (distancia <= 50) {
        frete = 10.00;
      } else {
         frete = distancia * 0.5;
    }
        System.out.printf("Valor do frete: R$ %.2f%n", frete);

     // 6 - O Número é 10?
       System.out.print("Informe um número: ");
        int num = sc.nextInt();
        if (num == 10) {
            System.out.println("O número é 10");
        } else {
            System.out.println("O número não é 10");
     }

    // 7 - Desconto para Associados
      System.out.print("Você é associado da loja? (sim/não): ");
        sc.nextLine();
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Você tem desconto");
        } else {
            System.out.println("Você não tem desconto");
    }

    // 8 - Cálculo de bônus por horas extras
       System.out.print("Informe o número de horas extras trabalhadas: ");
        int horasExtras = sc.nextInt();
        double bonus;
        if (horasExtras < 10) {
            bonus = horasExtras * 20.00;
        } else {
            bonus = horasExtras * 15.00;
     }
        System.out.printf("Bônus por hora extra: R$ %.2f%n", bonus);

        sc.close();
    }
}
