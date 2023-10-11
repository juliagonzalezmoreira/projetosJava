package Pratica4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            int n = 10;
            int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int i;

            System.out.println("Digite um número para encontrar o vetor: ");
            int numero = ler.nextInt();


            for (i = 0; i < n; i++) {
                if (numero == vetor[i]){
                    System.out.printf("O número foi encontrado na posição [%d] do vetor." , i);
                }}
    }
}
