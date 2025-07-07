import relatorios.RelatorioDeEstoque;
import relatorios.RelatorioDeVendas;
import relatorios.RelatorioTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Gerando Relatório de Vendas ---");
        RelatorioTemplate relatorioVendas = new RelatorioDeVendas();
        relatorioVendas.gerarRelatorio();

         System.out.println("\n--- Gerando Relatório de Estoque ---");
         RelatorioTemplate relatorioEstoque = new RelatorioDeEstoque();
         relatorioEstoque.gerarRelatorio();
    }
}