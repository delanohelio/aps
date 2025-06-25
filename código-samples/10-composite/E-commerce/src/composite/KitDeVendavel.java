package composite;

import interfaces.ItemVendavel;

import java.util.ArrayList;
import java.util.List;

public class KitDeVendavel implements ItemVendavel {
    private String nomeDoKit;
    private List<ItemVendavel> itens = new ArrayList<>();

    public KitDeVendavel(String nomeDoKit) {
        this.nomeDoKit = nomeDoKit;
    }

    public void adicionarItem(ItemVendavel item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        System.out.println("Calculando preço do kit: " + nomeDoKit);
        // A mágica da recursão: delega o cálculo para os filhos.
        double precoTotal = 0;
        for (ItemVendavel item : itens) {
            precoTotal += item.getPreco();
        }
        return precoTotal;
    }
}
