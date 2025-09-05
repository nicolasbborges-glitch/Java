package firstProject;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		while(numero <= 5) {
			System.out.println(numero);
			numero++;
		}
		
		int numero2 = 5;
		while(numero2 <= 1) {
			System.out.println(numero2);
			numero2--;
		}
	
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("Digite 3 números: ");
		while(contador <= 3) {
			valor = sc.nextInt();
			soma += valor;
			contador+=1;
		}
		System.out.println("A soma dos números é: "+ soma);
		System.out.println("Digite sair para sair do sistema");
		String resposta = sc.next();

		while(!resposta.equalsIgnoreCase("sair")){
		System.out.println("Tente novamente");
		resposta = sc.next();
		
		}
		System.out.println("Você conseguiu sair");

		System.out.println("Digite um valor");
		int valor2 = sc.nextInt();
		int aux = 1;
		while(aux <= valor2) {
		System.out.println(aux);
		aux++;

		}
	

	}

}
