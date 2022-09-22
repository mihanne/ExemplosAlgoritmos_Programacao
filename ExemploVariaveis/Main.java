import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num1;
    int num2;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite numero 1: ");
    num1 = ler.nextInt();
    System.out.println("Digite numero 2: ");
    num2 = ler.nextInt();
    System.out.println("A soma dos numeros é:" + (num1 + num2));
  }
}