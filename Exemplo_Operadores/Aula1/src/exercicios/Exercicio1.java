package exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número 1:");
        num1 = ler.nextInt();
        System.out.println("Digite o número 2:");
        num2 = ler.nextInt();
        System.out.println("Digite o número 3:");
        num3 = ler.nextInt();
        System.out.println("Digite o número 4:");
        num4 = ler.nextInt();

        System.out.println("A soma dos números = " + (num1+num2+num3+num4));
    }
}
