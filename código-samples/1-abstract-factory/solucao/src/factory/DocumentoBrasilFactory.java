package factory;

import model.Contrato;
import model.Fatura;
import model.Recibo;
import model.br.ContratoBrasil;
import model.br.FaturaBrasil;
import model.br.ReciboBrasil;

public class DocumentoBrasilFactory implements DocumentoFactory {
    public Fatura criarFatura() {
        return new FaturaBrasil();
    }

    public Recibo criarRecibo() {
        return new ReciboBrasil();
    }

    public Contrato criarContrato() {
        return new ContratoBrasil();
    }
}
