package leafs;

import interfaces.ItemVendavel;

public class Produto implements ItemVendavel {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        System.out.println("Calculando preço do produto: " + nome + " (R$ " + preco + ")");
        return this.preco;
    }
}
