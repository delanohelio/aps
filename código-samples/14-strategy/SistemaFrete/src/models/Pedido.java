package models;

import strategy.EstrategiaDeFrete;

public class Pedido {
    private double pesoTotal;
    private EstrategiaDeFrete estrategiaDeFrete;

    // A estratégia é definida no momento da criação ou por um setter.
    public void setEstrategiaDeFrete(EstrategiaDeFrete estrategia) {
        this.estrategiaDeFrete = estrategia;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    // O contexto não sabe qual algoritmo está sendo usado.
    // Ele apenas delega a chamada para o objeto de estratégia.
    public double calcularFrete() {
        if (estrategiaDeFrete == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida!");
        }
        return estrategiaDeFrete.calcular(this);
    }

}
