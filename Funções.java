package firstProject;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Funções {

	public static void main(String[] args) {
		mensagem();
		linha();
		linha();
		linha();
		contagem();
		saudacao("Nícolas");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade = sc.nextInt();
		classificação(idade);
	}
	public static void mensagem() {
		System.out.println("Função sem retorno");
	}
	
	public static void linha() {
		System.out.println("-----------------------");
	}

	public static void contagem() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void saudacao(String nome) {
		System.out.println("Olá " +nome);
	}
	public static void classificação(int idade) {
		if(idade >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}
	public static void compra(int quant, double valor) {
		double total = quant * valor;
	}
	}
}