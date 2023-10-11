package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueMap.put(codigo, new Produto(nome, quantidade, preco));

    }

    public void exibirProduto() {
        System.out.println(estoqueMap);
    }

    public double calcularValorEstoque() {
        double valorEstoque = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorEstoque;


    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        } return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto p : estoqueMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        } return produtoMaisBarato;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProduto();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProduto();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorEstoque());

        // Obtém e exibe o produto mais caro
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        // Obtém e exibe o produto mais barato
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

    }

}
