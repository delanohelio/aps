package strategy;

import models.Pedido;

public class FreteFixo implements EstrategiaDeFrete {
    @Override
    public double calcular(Pedido pedido) {
        return 10.00;
    }
}
