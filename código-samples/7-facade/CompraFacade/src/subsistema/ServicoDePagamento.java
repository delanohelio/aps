package subsistema;

import model.Cliente;

public class ServicoDePagamento {
    public boolean processar(Cliente cliente, double valor) {
        System.out.println("[Subsistema] Processando pagamento para " + cliente.getNome() + " no valor de R$" + valor);
        // Lógica de comunicação com gateway de pagamento aqui.
        return true; // Simula que o pagamento foi aprovado.
    }
}