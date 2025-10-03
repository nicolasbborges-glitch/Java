package firstProject;

import java.util.Scanner;

public class operadoresLogicos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Qual a sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Tem titulo de eleitor?");
		String resposta = scanner.next();
		
		if(idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}

		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		
		if(numero >= 10 || numero <= 20) {
			System.out.println("O número está entre 10 e 20");
		} else {
			System.out.println("O número está fora");
		}
		
		System.out.println("Qual o valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("é cliente VIP?");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true ) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		} else {
			System.out.println("Não tem desconto");
		}
		  
        System.out.println("Informe sua idade: ");
        int idade2 = scanner.nextInt();
       
        System.out.println("Você possui experiência? (sim/não): ");
        scanner.nextLine();
        String experiencia = scanner.nextLine();
        
        if (idade2 >= 20 && idade2 <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição rejeitada");
        }
     
	}

}
