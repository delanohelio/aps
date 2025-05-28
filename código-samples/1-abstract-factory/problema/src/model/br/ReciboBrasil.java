package model.br;

import model.Recibo;

public class ReciboBrasil implements Recibo {
    public void gerar() {
        System.out.println("Gerando recibo brasileiro com CPF e impostos locais.");
    }
}
