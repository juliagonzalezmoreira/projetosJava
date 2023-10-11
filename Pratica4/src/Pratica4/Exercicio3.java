package Pratica4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 10;
        int[] vetor = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i + 1), n);
            vetor[i] = ler.nextInt();
        }

        int quantidade = 0;
        int maior = vetor[0];
        int soma = 0;

        for (i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {

                vetor[quantidade] = i;
                quantidade++;

                soma += vetor[i];

                if (vetor[i] >= maior){
                    maior = vetor[i];
                }
            }
        }
        double media = (double) soma / quantidade;
        System.out.println("Quantidade de valores: " + quantidade);
        System.out.println("Maior valor: " + maior);
        System.out.println("Média: " + media);

    }
}
