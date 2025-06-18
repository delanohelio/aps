import model.Carrinho;
import model.Cliente;
import servico.CarrinhoDeComprasService;

public class Main {
    public static void main(String[] args) {
        // --- Preparando os dados ---
        Cliente cliente = new Cliente("Ana Paula", "ana.paula@email.com", "Rua das Flores, 123");
        Carrinho carrinho = new Carrinho(299.90);

        System.out.println("Tentando finalizar a compra para: " + cliente.getNome());
        System.out.println("=====================================================");

        // --- Usando o serviço que consome a Facade ---
        CarrinhoDeComprasService servico = new CarrinhoDeComprasService();
        boolean sucesso = servico.finalizarCompra(carrinho, cliente);

        System.out.println("=====================================================");
        System.out.println("Status da operação: " + (sucesso ? "SUCESSO" : "FALHA"));
    }
}