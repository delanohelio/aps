package model.eua;

import model.Fatura;

public class FaturaEUA implements Fatura {
    public void gerar() {
        System.out.println("Generating US invoice in dollars with US tax ID.");
    }
}
