package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeComprasList;

    public CarrinhoDeCompras() {
        this.carrinhoDeComprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoDeComprasList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinhoDeComprasList.isEmpty()){
        for (Item i : carrinhoDeComprasList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
            carrinhoDeComprasList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista etá vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinhoDeComprasList.isEmpty()) {
            for (Item item : carrinhoDeComprasList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }

    }

    public void exibirItens() {
        if (!carrinhoDeComprasList.isEmpty()) {
            System.out.println(this.carrinhoDeComprasList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Milho", 3d, 2);
        carrinhoDeCompras.adicionarItem("Arroz", 8d, 1);
        carrinhoDeCompras.adicionarItem("Iogurte", 2d, 5);

        carrinhoDeCompras.removerItem("Milho");

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());


    }
}
