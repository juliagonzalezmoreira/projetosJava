package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }

        } else {
            System.out.println("O Set está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);

    }

    public void exibirPalavras(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoCores = new ConjuntoPalavrasUnicas();

        conjuntoCores.adicionarPalavra("Azul");
        conjuntoCores.adicionarPalavra("Amarelo");
        conjuntoCores.adicionarPalavra("Verde");
        conjuntoCores.adicionarPalavra("Rosa");

        conjuntoCores.exibirPalavras();
        System.out.println("A palavra 'Rosa' está no conjunto? " + conjuntoCores.verificarPalavra("Rosa"));
        conjuntoCores.removerPalavra("Amarelo");
        conjuntoCores.exibirPalavras();
        System.out.println("A palavra 'Amarelo' está no conjunto? " + conjuntoCores.verificarPalavra("Amarelo"));

    }
}
