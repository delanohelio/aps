package app;

import model.Contrato;
import model.br.ContratoBrasil;
import model.eua.ContratoEUA;
import model.Fatura;
import model.br.FaturaBrasil;
import model.eua.FaturaEUA;
import model.Recibo;
import model.br.ReciboBrasil;
import model.eua.ReciboEUA;

import java.util.Scanner;

public class SistemaDocumentosSemAbstractFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o país (BR ou US): ");
        String pais = scanner.nextLine().trim().toUpperCase();

        Fatura fatura;
        Recibo recibo;
        Contrato contrato;

        if (pais.equals("BR")) {
            fatura = new FaturaBrasil();
            recibo = new ReciboBrasil();
            contrato = new ContratoBrasil();
        } else if (pais.equals("US")) {
            fatura = new FaturaEUA();
            recibo = new ReciboEUA();
            contrato = new ContratoEUA();
        } else {
            System.out.println("País não suportado.");
            scanner.close();
            return;
        }

        fatura.gerar();
        recibo.gerar();
        contrato.gerar();

        scanner.close();
    }
}
