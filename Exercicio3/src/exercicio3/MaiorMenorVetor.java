package exercicio3;

import java.util.Random;

public class MaiorMenorVetor {
        public static void main(String[] args) {
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int[] vet= new int[10];
    //preenchendo um vetor com numeros randomicos
    Random rd = new Random();
    for(int i=0;i<10;i++) {
        vet[i] = rd.nextInt(99);
        System.out.println(vet[i]);
        //armazenar o maior
        if (vet[i]>maior)
            maior=vet[i];
        //armazenar o menor
        if (vet[i]<menor)
            menor=vet[i];
    }
    //resultado de maior e menor
            System.out.println("Maior valor: "+maior);
            System.out.println("Menor valor: "+menor);
}
}
