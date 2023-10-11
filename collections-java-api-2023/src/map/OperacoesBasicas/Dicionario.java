package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarNome = null;
        if(!dicionarioMap.isEmpty()){
            pesquisarNome = dicionarioMap.get(palavra);
        }
        return pesquisarNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Love","Amor");
        dicionario.adicionarPalavra("Play","Jogar");
        dicionario.adicionarPalavra("Friend","Amigo");
        dicionario.adicionarPalavra("Love","Amor");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Play");

        dicionario.exibirPalavras();

        System.out.println("Palavra: " + dicionario.pesquisarPorPalavra("Friend"));

    }
}
