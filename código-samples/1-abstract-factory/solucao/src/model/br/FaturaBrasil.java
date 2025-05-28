package model.br;

import model.Fatura;

public class FaturaBrasil implements Fatura {
    public void gerar() {
        System.out.println("Gerando fatura brasileira com CNPJ e valor em reais.");
    }
}