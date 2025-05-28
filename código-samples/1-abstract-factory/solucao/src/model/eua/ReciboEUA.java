package model.eua;

import model.Recibo;

public class ReciboEUA implements Recibo {
    public void gerar() {
        System.out.println("Generating US receipt with SSN and tax format.");
    }
}
