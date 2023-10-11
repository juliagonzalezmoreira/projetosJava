import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* int vetor[]; //declaração do vetor
       vetor = new int[5]; //alocando espaço de memória
        vetor[0] = 5;
        vetor[1] = 2;
        vetor[2] = 4;
        vetor[3] = 8;
        vetor[4] = 10;

        int soma= vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4];
        System.out.println(soma);*/


                //Acessando vetor

       /* Scanner ler = new Scanner(System.in);

        int n = 10; //tamanho do vetor
        int vetor[] = new int[n];
        int i; //indice ou posição

        for (i=0; i<n; i++){
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            vetor[i] = ler.nextInt();
        }*/

                // EXERCICIO 1
                Scanner ler = new Scanner(System.in);

                int n = 10;
                int vetor[] = new int[n];
                int i;
                int soma = 0;

                for (i = 0; i < n; i++) {
                    System.out.printf("Informe %do. valor de %d: ", (i + 1), n);
                    vetor[i] = ler.nextInt();
                    soma += i;
                }

                float media = (float) soma /n;
                System.out.println("A média é: " + media);
            }
        }