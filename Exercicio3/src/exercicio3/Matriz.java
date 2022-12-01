package exercicio3;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int escalar;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                int numero = ler.nextInt();
                matriz[i][j] = numero;
            }
        }

        System.out.print("Digite um escalar: ");
        escalar = ler.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
