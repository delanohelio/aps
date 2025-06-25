package leafs;

import interfaces.ItemVendavel;

public class Garantia implements ItemVendavel {

    private String nome;
    private double preco;
    private int anos;

    public Garantia(String nome, double preco, int anos) {
        this.nome = nome;
        this.preco = preco;
        this.anos = anos;
    }

    @Override
    public double getPreco() {
        System.out.println("Calculando preço da garantia: " + nome + " (R$ " + preco + ") para cada " + anos + " anos");
        return this.anos * this.preco;
    }
}
