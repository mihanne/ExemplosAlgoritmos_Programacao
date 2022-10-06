package exercicios;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        float nota1,nota2,nota3;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite nota 1: ");
        nota1=ler.nextFloat();
        System.out.println("Digite nota 2: ");
        nota2=ler.nextFloat();
        System.out.println("Digite nota 3: ");
        nota3=ler.nextFloat();
        System.out.println("A média das notas é : " + (nota1+nota2+nota3)/3);

    }
}
