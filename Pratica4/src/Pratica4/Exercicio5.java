package Pratica4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n = 8;
        int[] vetor = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = ler.nextInt();
        }
            for (i = 0; i < 4; i++) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 4]; //elemento na posição i dos primeiros 4 elementos é substituído pelo valor do elemento na posição i + 4 dos últimos 4 elementos. Isso efetua a troca desses dois valores.
                vetor[i + 4] = temp;
            }
        System.out.println(Arrays.toString(vetor));
    }
}


