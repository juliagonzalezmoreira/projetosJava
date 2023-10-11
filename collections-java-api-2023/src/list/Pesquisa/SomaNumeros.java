package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> somaNumerosList;

    public SomaNumeros() {
        this.somaNumerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.somaNumerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!somaNumerosList.isEmpty()){
            for(Integer i : somaNumerosList){
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!somaNumerosList.isEmpty()) {
            for (Integer i : somaNumerosList) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!somaNumerosList.isEmpty()) {
            for (Integer i : somaNumerosList) {
                if (i <= menorNumero) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros(){
        if (!somaNumerosList.isEmpty()){
            System.out.println(this.somaNumerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(-3);

        somaNumeros.exibirNumeros();

        System.out.println("A soma é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
    }

}
