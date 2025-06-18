package facade;

import model.Carrinho;
import model.Cliente;
import subsistema.ServicoDeEmail;
import subsistema.ServicoDeEstoque;
import subsistema.ServicoDeLogistica;
import subsistema.ServicoDePagamento;

// A Fachada que simplifica todo o processo de compra.
public class CompraFacade {
    // 1. A fachada conhece e encapsula os subsistemas.
    private ServicoDeEstoque estoque = new ServicoDeEstoque();
    private ServicoDePagamento pagamento = new ServicoDePagamento();
    private ServicoDeLogistica logistica = new ServicoDeLogistica();
    private ServicoDeEmail email = new ServicoDeEmail();

    // 2. O método da fachada é simples e direto, escondendo toda a complexidade.
    public void finalizarCompra(Carrinho carrinho, Cliente cliente) {
        System.out.println("Iniciando processo de finalização de compra via Facade...");

        // 3. A complexidade da orquestração fica escondida aqui dentro.
        if (!estoque.verificar(carrinho)) {
            throw new RuntimeException("Erro: Produto fora de estoque.");
        }
        if (!pagamento.processar(cliente, carrinho.getTotal())) {
            throw new RuntimeException("Erro: Pagamento recusado.");
        }

        String codigoRastreio = logistica.agendarEntrega(carrinho, cliente.getEndereco());

        String corpoEmail = "Seu pedido foi processado com sucesso! Use este código para rastreá-lo: " + codigoRastreio;
        email.enviarConfirmacao(cliente.getEmail(), "Seu Pedido foi Confirmado!", corpoEmail);

        System.out.println("\nCompra finalizada com sucesso via Facade!");
    }
}