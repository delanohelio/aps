package strategy;

import models.Pedido;

public interface EstrategiaDeFrete {
    double calcular(Pedido pedido);
}
