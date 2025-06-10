//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Cheeseburger", "Batata", "Refrigerante", null, 0f);
        Pedido pedido2 = new Pedido("Veggie", "Salada", "Suco", "Boneco", 0f);
        Pedido pedido3 = new Pedido("Veggie", null, null, null, 0f);

        pedido1.exibir();
        pedido2.exibir();
    }
}