// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Proj_Pedido {
    public static void main(String[] args) {
        Item it1, it2, it3;
        it1 = new Item(100, 3, 3);
        it2 = new Item(101,2,4);
        it3 = new Item(102, 1, 5);

        Pedido pedido1 = new Pedido(1001, "Ana");

        pedido1.adicionarItem(it1);
        pedido1.adicionarItem(it2);
        pedido1.adicionarItem(it3);
        pedido1.imprimir();

        pedido1.removerItem(it3);
        pedido1.imprimir();

    }
}