package Pratica4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 4;
        int[] vetor = new int[n];
        int i;
        int [] ordemReversa = new int[vetor.length];

        System.out.println("Digite a quantidade de números a serem digitados: " + n);

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i + 1), n);
            vetor[i] = ler.nextInt();
        }

        for (i = 0; i < n; i++) {
            ordemReversa[i] = vetor[n - 1 - i];
        }
        System.out.println("Ordem reversa: " + Arrays.toString(ordemReversa));
    }
}
