package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> ordenacaoNumerosList;

    public OrdenacaoNumeros() {
        this.ordenacaoNumerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.ordenacaoNumerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.ordenacaoNumerosList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.ordenacaoNumerosList);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }

    public void exibirNumeros(){
        if(!ordenacaoNumerosList.isEmpty()){
            System.out.println(ordenacaoNumerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(-4);

        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordenação ascendente:" + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordenação descendente:" + ordenacaoNumeros.ordenarDescendente());

    }
}
