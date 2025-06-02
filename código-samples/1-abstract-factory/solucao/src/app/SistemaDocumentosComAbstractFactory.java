package app;

import factory.DocumentoFactory;
import factory.Relatorio;
import model.Contrato;
import model.Fatura;
import model.Recibo;
import util.FabricaDocumentosFactory;

import java.util.Scanner;

public class SistemaDocumentosComAbstractFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o país (BR ou US): ");
        String pais = scanner.nextLine().trim().toUpperCase();

        try {
            DocumentoFactory factory = FabricaDocumentosFactory.getFactory(pais);

            Fatura fatura = factory.criarFatura();
            Recibo recibo = factory.criarRecibo();
            Contrato contrato = factory.criarContrato();

            fatura.gerar();
            recibo.gerar();
            contrato.gerar();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
