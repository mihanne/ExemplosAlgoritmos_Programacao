import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao, votoA = 0, votoB = 0;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("1 - Voto no candidato A");
            System.out.println("2 - Voto no candidato B");
            System.out.println("3 - Apurar");
            System.out.println("4 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    votoA++;
                    System.out.println("Voto contabilizado");
                    break;
                case 2:
                    votoB++;
                    System.out.println("Voto contabilizado");
                    break;
                case 3:
                    if (votoA > votoB)
                        System.out.println("Vencedor: candidato A");
                    else if (votoB > votoA)
                        System.out.println("Vencedor: candidato B");
                    else
                        System.out.println("Empate");
                    break;
                case 4:
                    System.out.println("Votos candidato A : " + votoA);
                    System.out.println("Votos candidato B : " + votoB);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while(opcao != 4);
    }
}