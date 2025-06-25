import composite.KitDeVendavel;
import interfaces.ItemVendavel;
import leafs.Garantia;
import leafs.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando produtos individuais
        Produto teclado = new Produto("Teclado Mecânico", 350.00);
        Produto mouse = new Produto("Mouse Gamer RGB", 150.00);
        Produto headset = new Produto("Headset 7.1", 400.00);
        Produto monitor = new Produto("Monitor Ultrawide", 1800.00);

        Garantia garantiaTeclado = new Garantia("Garantia Extra do Teclado", 35.0, 2);
        Garantia garantiaMouse = new Garantia("Garantia Extra do Mouse", 15.0, 2);
        Garantia garantiaHeadset = new Garantia("Garantia Extra do Headset", 40.0, 2);
        Garantia garantiaMonitor = new Garantia("Garantia Extra do Monitor", 180.0, 2);

        KitDeVendavel garantiaGamer =  new KitDeVendavel("Garantia Extra do Gamer");
        garantiaGamer.adicionarItem(garantiaTeclado);
        garantiaGamer.adicionarItem(garantiaMouse);
        garantiaGamer.adicionarItem(garantiaHeadset);

        // Criando um kit composto por outros itens
        KitDeVendavel kitGamer = new KitDeVendavel("Kit Gamer Essencial");
        kitGamer.adicionarItem(teclado);
        kitGamer.adicionarItem(mouse);
        kitGamer.adicionarItem(headset);
        kitGamer.adicionarItem(garantiaGamer);



        // Montando o carrinho de compras com itens individuais e kits
        List<ItemVendavel> carrinho = new ArrayList<>();
        carrinho.add(monitor);       // Adicionando um produto individual
        carrinho.add(kitGamer);      // Adicionando um kit
        carrinho.add(garantiaMonitor);

        // Calculando o total do carrinho de forma uniforme
        double totalCarrinho = 0;
        System.out.println("--- Calculando Total do Carrinho ---");
        for (ItemVendavel item : carrinho) {
            totalCarrinho += item.getPreco(); // O cliente não precisa saber o tipo do item!
            System.out.println("Subtotal parcial: R$ " + totalCarrinho);
            System.out.println("--------------------");
        }

        System.out.println("\nVALOR TOTAL DO CARRINHO: R$ " + totalCarrinho);
    }
}