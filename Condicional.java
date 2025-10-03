package firstProject;

import java.io.InputStream;
import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		
		int idade = 18;
		if(idade >= 18) { 
		 System.out.println("Você é maior de idade"); 
		} else { 
			System.out.println("Você é maior de idade");
		}
		
		Scanner scanner = Scanner(System.in);
		System.out.println("Quanto você pagou");
		double valor = scanner.nextDouble();
		if(valor >= 200) {
			System.out.println("Você ganhou desconto");
	} else {
		 System.out.println("Você não ganhou desconto");
	}
		
		
	}

	private static Scanner Scanner(InputStream in) {
		return null;
	}

}
