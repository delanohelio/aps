package model;

public class Carrinho {
    // Em um sistema real, aqui haveria uma lista de produtos.
    // Para simplificar, vamos apenas usar o valor total.
    private double total;

    public Carrinho(double total) {
        this.total = total;
    }

    public double getTotal() { return total; }
}