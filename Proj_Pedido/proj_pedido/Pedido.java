import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String cliente;
    private List<Item> lista;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        lista=new ArrayList<Item>();
    }
    public void adicionarItem (Item item){
        lista.add(item);
    }

    public void removerItem(Item item){
        lista.remove(item);
    }
    public double calcularTotal(){
        double total = 0;
        for (Item umItem : lista) {
            total = total + umItem.calcularCustoItem();
        }
        return total;
    }

    public void imprimir(){
        System.out.println("Pedido: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Itens:");
        System.out.println("------------------------");

        for (Item umItem : lista) {
            umItem.imprime();
        }
        System.out.println("Total do pedido: " + calcularTotal());
    }
}
