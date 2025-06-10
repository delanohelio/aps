//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido.Builder()
                .sanduiche("Cheeseburger")
                .acompanhamento("Batata")
                .bebida("Refrigerante")
                .build();

        Pedido pedido2 = new Pedido.Builder()
                .sanduiche("Veggie")
                .acompanhamento("Salada")
                .bebida("Suco")
                .brinquedo("Boneco")
                .build();

        Pedido pedido3 = new Pedido.Builder()
                .sanduiche("Veggie")
                .acompanhamento("Salada")
                .bebida("Suco")
                .brinquedo("Boneco")
                .desconto(0.3f)
                .build();

        pedido1.exibir();
        pedido2.exibir();
        pedido3.exibir();
    }
}