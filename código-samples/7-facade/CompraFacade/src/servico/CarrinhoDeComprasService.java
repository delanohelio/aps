package servico;

import facade.CompraFacade;
import model.Carrinho;
import model.Cliente;

// O cliente agora é muito mais simples!
public class CarrinhoDeComprasService {
    // A única dependência é a fachada.
    private CompraFacade compraFacade = new CompraFacade();

    public boolean finalizarCompra(Carrinho carrinho, Cliente cliente) {
        try {
            compraFacade.finalizarCompra(carrinho, cliente);
            return true;
        } catch (RuntimeException e) {
            System.err.println("\nFalha ao finalizar a compra: " + e.getMessage());
            return false;
        }
    }
}