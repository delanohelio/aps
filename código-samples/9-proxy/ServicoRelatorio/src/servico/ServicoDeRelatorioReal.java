package servico;

import model.Usuario;

/**
 * O Objeto Real (Real Subject): a classe que possui a lógica de negócio
 * principal e que queremos proteger.
 */
public class ServicoDeRelatorioReal implements IServicoDeRelatorio {

    @Override
    public void gerarRelatorioConfidencial(Usuario usuario) {
        System.out.println("--> (Objeto Real) Conectando ao banco de dados e gerando relatório confidencial para o usuário: " + usuario.getNome());
        System.out.println("--> (Objeto Real) Relatório gerado com sucesso.");
    }
}