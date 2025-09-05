package firstProject;

import java.util.Scanner;
public class Aula08{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  // 1 - Classificação de Dia da Semana
  System.out.print("Exercício 1 - Digite um número de 1 a 7 para o dia da semana: ");
  int dia = sc.nextInt();
  switch (dia) {
   case 1:
   case 7:
    System.out.println("Fim de semana");
    break;
   case 2:
   case 3:
   case 4:
   case 5:
   case 6:
    System.out.println("Dia útil");
    break;
   default:
    System.out.println("Dia inválido");
  }
  System.out.println();

  // 2 - Menu de Bebidas
  System.out.print("Exercício 2 - Código da bebida (1=Café,2=Chá,3=Suco,4=Refrigerante): ");
  int bebida = sc.nextInt();
  switch (bebida) {
   case 1:
    System.out.println("Café = R$5,00");
    break;
   case 2:
    System.out.println("Chá = R$3,50");
    break;
   case 3:
    System.out.println("Suco = R$4,00");
    break;
   case 4:
    System.out.println("Refrigerante = R$4,50");
    break;
   default:
    System.out.println("Código inválido");
  }
  System.out.println();

  // 3 - Tipo de Veículo
  System.out.print("Exercício 3 - Código do veículo (1=Carro,2=Moto,3=Caminhão): ");
  int veiculo = sc.nextInt();
  switch (veiculo) {
   case 1:
    System.out.println("Leve");
    break;
   case 2:
    System.out.println("Motocicleta");
    break;
   case 3:
    System.out.println("Pesado");
    break;
   default:
    System.out.println("Veículo inválido");
  }
  System.out.println();

  // 4 - Plano de Assinatura
  System.out.print("Exercício 4 - Código do plano (1=Básico,2=Intermediário,3=Premium): ");
  int plano = sc.nextInt();
  switch (plano) {
   case 1:
    System.out.println("Acesso limitado");
    break;
   case 2:
    System.out.println("Acesso padrão + suporte");
    break;
   case 3:
    System.out.println("Acesso total + suporte prioritário");
    break;
   default:
    System.out.println("Plano inválido");
  }
  System.out.println();

  // 5 - Seleção de Mês
  System.out.print("Exercício 5 - Número do mês (1 a 12): ");
  int mes = sc.nextInt();
  switch (mes) {
   case 12:
   case 1:
   case 2:
    System.out.println("Verão");
    break;
   case 3:
   case 4:
   case 5:
    System.out.println("Outono");
    break;
   case 6:
   case 7:
   case 8:
    System.out.println("Inverno");
    break;
   case 9:
   case 10:
   case 11:
    System.out.println("Primavera");
    break;
   default:
    System.out.println("Mês inválido");
  }
  System.out.println();

  // 6 - Tipo de Ingresso
  System.out.print("Exercício 6 - Código do ingresso (1=Inteira,2=Meia-entrada,3=VIP): ");
  int ingresso = sc.nextInt();
  switch (ingresso) {
   case 1:
    System.out.println("R$50,00");
    break;
   case 2:
    System.out.println("R$25,00");
    break;
   case 3:
    System.out.println("R$100,00");
    break;
   default:
    System.out.println("Ingresso inválido");
  }
  System.out.println();

  // 7 - Escolha de Idioma
  System.out.print("Exercício 7 - Código do idioma (1=Português,2=Inglês,3=Espanhol): ");
  int idioma = sc.nextInt();
  switch (idioma) {
   case 1:
    System.out.println("Olá!");
    break;
   case 2:
    System.out.println("Hello!");
    break;
   case 3:
    System.out.println("Hola!");
    break;
   default:
    System.out.println("Idioma inválido");
  }
  System.out.println();

  // 8 - Nível de Acesso
  System.out.print("Exercício 8 - Código do nível (1=Usuário,2=Moderador,3=Administrador): ");
  int nivel = sc.nextInt();
  switch (nivel) {
   case 1:
    System.out.println("Acesso básico");
    break;
   case 2:
    System.out.println("Acesso básico + edição");
    break;
   case 3:
    System.out.println("Acesso total");
    break;
   default:
    System.out.println("Nível inválido");
  }
  System.out.println();

  // 9 - Tipo de Pagamento
  System.out.print("Exercício 9 - Código do pagamento (1=Dinheiro,2=Cartão de Crédito,3=Pix): ");
  int pagamento = sc.nextInt();
  switch (pagamento) {
   case 1:
    System.out.println("Pagamento em dinheiro confirmado");
    break;
   case 2:
    System.out.println("Pagamento com cartão processado");
    break;
   case 3:
    System.out.println("Pagamento via Pix realizado");
    break;
   default:
    System.out.println("Método inválido");
  }
  
 }
}