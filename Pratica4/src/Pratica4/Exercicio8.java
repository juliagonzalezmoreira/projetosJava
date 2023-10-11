package Pratica4;

import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {

        int n = 10;
        int[] M = {1,2,3,4,5,6,7,8,9,10};
        int[] N = {1,1,1,1,1,1,1,1,1,1};
        int i;
        int multiplicacao = 0;

        for (i = 0; i < n; i++) {
            multiplicacao += M[i] * N[i];
        }

        System.out.println("O produto escalar de M por N é: " + multiplicacao);
    }
}
