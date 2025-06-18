package servico;

import model.Usuario;

/**
 * O Assunto (Subject): define a interface comum para o Objeto Real e o Proxy.
 * O cliente irá interagir com objetos através desta interface.
 */
public interface IServicoDeRelatorio {
    void gerarRelatorioConfidencial(Usuario usuario);
}