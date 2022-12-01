package exercicio3;

import java.util.Scanner;

public class Cigarro {
    public static void main(String[] args) {
        float alturaMax;
        Scanner ler = new Scanner(System.in);
        int ano,numCigarro, totalCigarro;
        double preco, totalPreco;

        System.out.println("Digite o numero de anos: ");
        ano = ler.nextInt();

        System.out.println("numero de cigarros por dia: ");
        numCigarro = ler.nextInt();

        System.out.println("Preco medio da carteira de cigarro: ");
        preco = ler.nextDouble();

        totalCigarro = ano*365*numCigarro;
        totalPreco = (preco/20)*totalCigarro;

        System.out.println("Total de cigarros fumados: " + totalCigarro);
        System.out.println("Valor gasto com cigarros: " + totalPreco);
    }
}
