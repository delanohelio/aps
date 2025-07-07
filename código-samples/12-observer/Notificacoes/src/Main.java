import observers.Cliente;
import subjetcs.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Criar o Assunto (o produto que será observado)
        Produto ps5 = new Produto("PlayStation 5");

        // 2. Criar os Observadores (os clientes interessados)
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        // 3. Registrar os observadores no assunto
        ps5.anexar(cliente1);
        ps5.anexar(cliente2);

        System.out.println("Situação inicial: Estoque zerado.");
        ps5.setEstoque(0);

        System.out.println("\n...algum tempo depois...");

        // 4. Mudar o estado do Assunto. Isso deve disparar a notificação.
        ps5.setEstoque(10);
    }
}