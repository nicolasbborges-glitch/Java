package firstProject;

import java.util.Scanner;

public class List17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int[][] matriz1 = new int[2][3];
        System.out.println("Preencha a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor para [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz completa:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }


        String[][] nomes = new String[3][2];
        System.out.println("Preencha a matriz 3x2 com nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite nome para [" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine();
            }
        }

        System.out.println("Tabela de nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nomes[i][j] + "\t");
            }
            System.out.println();
        }

  
        int[][] matriz2 = new int[3][3];
        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor para [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz2[i][i] + " ");
        }
        System.out.println();

   
        int[][] matriz3 = new int[3][3];
        System.out.println("Preencha outra matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor para [" + i + "][" + j + "]: ");
                matriz3[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um número para procurar: ");
        int numero = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz3[i][j] == numero) {
                    System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado na matriz.");
        }

    
        int[][] matriz4 = new int[4][3];
        System.out.println("Preencha a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite valor para [" + i + "][" + j + "]: ");
                matriz4[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores maiores que 10:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz4[i][j] > 10) {
                    System.out.println("[" + i + "][" + j + "] = " + matriz4[i][j]);
                }
            }
        }


    }
}
