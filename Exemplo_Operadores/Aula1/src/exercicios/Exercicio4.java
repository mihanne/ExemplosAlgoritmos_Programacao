package exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        float salario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário do Funcionario: ");
        salario = ler.nextFloat();
        System.out.println("Salário com gratificação de 5% e imposto de 7%: "+((salario*1.05)-(salario*0.07)));
    }


}
