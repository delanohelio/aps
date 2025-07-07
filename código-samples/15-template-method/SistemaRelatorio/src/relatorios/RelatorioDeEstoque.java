package relatorios;

public class RelatorioDeEstoque extends RelatorioTemplate {
    @Override
    protected void criarCabecalho() {
        System.out.println("== LOGO DA EMPRESA ==");
        System.out.println("Título: Relatório de Estoque Atual");
        System.out.println("---------------------------------");
    }

    @Override
    protected void gerarCorpo() {
        System.out.println("Produto A - 50 unidades");
        System.out.println("Produto B - 30 unidades");
    }

    @Override
    protected void criarRodape() {
        System.out.println("---------------------------------");
        System.out.println("Data: 07/07/2025 - Página 1");
    }
}
