package Pratica4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 10;
        int[] vetor = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i + 1), n);
            vetor[i] = ler.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (vetor[i] >= 20) {
                System.out.println(vetor[i]);
            }
        }
    }
}
