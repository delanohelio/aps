package factory;

import model.Contrato;
import model.Fatura;
import model.Recibo;
import model.eua.ContratoEUA;
import model.eua.FaturaEUA;
import model.eua.ReciboEUA;

public class DocumentoEUAFactory implements DocumentoFactory {
    public Fatura criarFatura() {
        return new FaturaEUA();
    }

    public Recibo criarRecibo() {
        return new ReciboEUA();
    }

    public Contrato criarContrato() {
        return new ContratoEUA();
    }
}
