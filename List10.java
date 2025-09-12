package firstProject;

import java.util.Scanner;

public class ListaExerciciosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Contador: Mostre os números de 10 a 30 no console
        System.out.println("Exercício 1 - Contador de 10 a 30:");
        int i = 10;
        while (i <= 30) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // Exercício 2 - Soma de 3 números digitados
        System.out.println("Exercício 2 - Soma de 3 números digitados:");
        int contador2 = 0;
        int soma2 = 0;
        while (contador2 < 3) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            soma2 += num;
            contador2++;
        }
        System.out.println("Soma total: " + soma2 + "\n");

        // Exercício 3 - Soma de 5 números digitados
        System.out.println("Exercício 3 - Soma de 5 números digitados:");
        int contador3 = 0;
        int soma3 = 0;
        while (contador3 < 5) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            soma3 += num;
            contador3++;
        }
        System.out.println("Soma total: " + soma3 + "\n");

        // Exercício 4 - Contar até o número informado
        System.out.println("Exercício 4 - Contar até o número informado:");
        System.out.print("Digite um número inteiro positivo: ");
        int numeroInformado = scanner.nextInt();
        int contador4 = 1;
        while (contador4 <= numeroInformado) {
            System.out.print(contador4 + " ");
            contador4++;
        }
        System.out.println("\n");

        // Exercício 5 - Somar os números de 1 a 5
        System.out.println("Exercício 5 - Soma de 1 a 5:");
        int contador5 = 1;
        int soma5 = 0;
        while (contador5 <= 5) {
            soma5 += contador5;
            contador5++;
        }
        System.out.println("Soma de 1 a 5: " + soma5 + "\n");

        // Exercício 6 - Tabuada
        System.out.println("Exercício 6 - Tabuada:");
        System.out.print("Digite um número para ver a tabuada: ");
        int numeroTabuada = scanner.nextInt();
        int contador6 = 1;
        while (contador6 <= 10) {
            int resultado = numeroTabuada * contador6;
            System.out.println(numeroTabuada + " x " + contador6 + " = " + resultado);
            contador6++;
        }

        scanner.close();
    }
}
