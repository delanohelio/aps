package subsistema;

import model.Carrinho;

public class ServicoDeLogistica {
    public String agendarEntrega(Carrinho carrinho, String endereco) {
        System.out.println("[Subsistema] Agendando entrega para o endereço: " + endereco);
        // Lógica de agendamento com a transportadora.
        String codigoRastreio = "BR123456789SP";
        System.out.println("[Subsistema] Entrega agendada. Código de rastreio: " + codigoRastreio);
        return codigoRastreio;
    }
}