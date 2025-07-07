import models.Pedido;
import strategy.FreteFixo;
import strategy.FretePorPeso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setPesoTotal(10); // 10 kg

        // Cenário 1: Usando a estratégia de frete fixo
        pedido.setEstrategiaDeFrete(new FreteFixo());
        System.out.println("Custo com Frete Fixo: R$ " + pedido.calcularFrete());

        // Cenário 2: Trocando para a estratégia de frete por peso
        pedido.setEstrategiaDeFrete(new FretePorPeso());
        System.out.println("Custo com Frete por Peso: R$ " + pedido.calcularFrete());
    }
}