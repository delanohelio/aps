package relatorios;

public class RelatorioDeVendas extends RelatorioTemplate {
    @Override
    protected void criarCabecalho() {
        System.out.println("== LOGO DA EMPRESA ==");
        System.out.println("Título: Relatório de Vendas Mensal");
    }

    @Override
    protected void gerarCorpo() {
        System.out.println("Corpo: Produto A - R$ 1000 | Produto B - R$ 1500");
    }

    @Override
    protected void criarRodape() {
        System.out.println("Rodapé: Data 07/07/2025 - confidenciavel.com");
    }
}