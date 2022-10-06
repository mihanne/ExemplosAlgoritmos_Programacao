package exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float salario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário do Funcionario: ");
        salario = ler.nextFloat();
        System.out.println("Salário com aumento de 25%: "+(salario*1.25));
    }
}
