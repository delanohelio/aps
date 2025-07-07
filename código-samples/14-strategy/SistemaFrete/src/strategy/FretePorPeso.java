package strategy;

import models.Pedido;

public class FretePorPeso implements EstrategiaDeFrete {
    @Override
    public double calcular(Pedido pedido) {
        return pedido.getPesoTotal() * 5.0;
    }
}
