package firstProject;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[]args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String nome;
	 System.out.println("Qual seu nome? ");
	 nome = scanner.nextLine();
	 
	 System.out.println("Olá " + nome);
	//------------------------------------
	 double salario, aumento;
	 System.out.println("Informe o salário: ");
	 salario = scanner.nextDouble();
	 System.out.println("Informe o aumento: ");
	 aumento = scanner.nextDouble();
	 
	 double total = salario + aumento;
	 System.out.println("O novo salário é: " + total);
	
	 
	}
}
