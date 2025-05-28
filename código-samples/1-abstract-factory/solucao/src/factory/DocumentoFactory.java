package factory;

import model.Contrato;
import model.Fatura;
import model.Recibo;

public interface DocumentoFactory {
    Fatura criarFatura();

    Recibo criarRecibo();

    Contrato criarContrato();
}
