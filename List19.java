package primeiroProjeto;

import java.util.Scanner;

public class Lista019 {

		// Função separadora (extra)
	    public static void separador() {
	        System.out.println("--------------------");
	    }
			
			// 1 – Classificando valores
		    public static void classificarValor(int numero) {
		        if (numero > 0) {
		            System.out.println("Positivo");
		        } else if (numero < 0) {
		            System.out.println("Negativo");
		        } else {
		            System.out.println("Zero");
		        }
		    }

		    // 2 – Maioridade
		    public static void verificarMaioridade(int idade) {
		        if (idade >= 18) {
		            System.out.println("Maior de idade");
		        } else {
		            System.out.println("Menor de idade");
		        }
		    }

		    // 3 – Boas Vindas
		    public static void boasVindas(String nome) {
		        System.out.println("Bem-vindo(a), " + nome + "!");
		    }

		    // 4 – Tabuada
		    public static void tabuada(int numero) {
		        System.out.println("Tabuada de " + numero + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }
		    }

		    // 5 – Juntando palavras
		    public static void juntarPalavras(String p1, String p2) {
		        System.out.println("Concatenadas: " + p1 + " " + p2);
		    }

		    // 6 – Verificando par ou ímpar
		    public static void parOuImpar(int numero) {
		        if (numero % 2 == 0) {
		            System.out.println(numero + " é Par");
		        } else {
		            System.out.println(numero + " é Ímpar");
		        }
		    }

		    // 7 – Classificando temperatura
		    public static void classificarTemperatura(int temp) {
		        if (temp < 15) {
		            System.out.println("Frio");
		        } else if (temp <= 25) {
		            System.out.println("Agradável");
		        } else {
		            System.out.println("Quente");
		        }
		    }

		    // 8 – Saudação por turno
		    public static void saudacaoTurno(String turno) {
		        switch (turno.toLowerCase()) {
		            case "manhã":
		                System.out.println("Bom dia!");
		                break;
		            case "tarde":
		                System.out.println("Boa tarde!");
		                break;
		            case "noite":
		                System.out.println("Boa noite!");
		                break;
		            default:
		                System.out.println("Turno inválido!");
		        }
		    }

		    // 9 – Calculando média
		    public static void calcularMedia(double n1, double n2, double n3) {
		        double media = (n1 + n2 + n3) / 3;
		        System.out.println("Média = " + media);
		    }

		    // 10 – Verificando aprovação
		    public static void verificarAprovacao(double nota) {
		        if (nota >= 7) {
		            System.out.println("Aprovado");
		        } else if (nota >= 5) {
		            System.out.println("Em recuperação");
		        } else {
		            System.out.println("Reprovado");
		        }
		    }

		    public static void main(String[] args) {
		        classificarValor(5);
		        separador();
		        verificarMaioridade(16);
		        separador();
		        boasVindas("Maria");
		        separador();
		        tabuada(7);
		        separador();
		        juntarPalavras("Olá", "Mundo");
		        separador();
		        parOuImpar(10);
		        separador();
		        classificarTemperatura(22);
		        separador();
		        saudacaoTurno("tarde");
		        separador();
		        calcularMedia(8.5, 7.0, 6.5);
		        separador();
		        verificarAprovacao(6.0);
		   }


		}