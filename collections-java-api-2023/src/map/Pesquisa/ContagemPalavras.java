package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }
     public void removerPalavra(String palavra){
        if (!contagemMap.isEmpty()){
            contagemMap.remove(palavra);
        }

     }

     public void exibirContagemPalavras(){
         System.out.println(contagemMap);
     }

    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C++", 10);
        contagemPalavras.adicionarPalavra("Python", 5);
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("JavaScript");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: "+ contagemPalavras.encontrarPalavrasMaisFrequente());
    }
}

