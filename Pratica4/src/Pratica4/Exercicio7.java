package Pratica4;

public class Exercicio7 {
    public static void main(String[] args) {

        int[] A = {1, 2, 4, 6, 21};
        int[] B = {2, 3, 6, 7, 9, 11, 15, 20};

        for (int i = 0; i < A.length; i++) {
            int elementoA = A[i];

            for (int x = 0; x < B.length; x++) {
                int elementoB = B[x];

                if (elementoA == elementoB) {
                    System.out.println(elementoA);
                    break;
                }
            }
        }
    }
}
