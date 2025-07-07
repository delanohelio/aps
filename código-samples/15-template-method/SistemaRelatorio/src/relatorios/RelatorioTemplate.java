package relatorios;

public abstract class RelatorioTemplate {

    public final void gerarRelatorio() {
        // Define o esqueleto do algoritmo
        criarCabecalho();
        gerarCorpo();
        criarRodape();
    }

    protected abstract void criarCabecalho();
    protected abstract void gerarCorpo();
    protected abstract void criarRodape();
}
