public class Main {

    public static void main(String[] args) {
        ConfiguracaoSistema configuracaoSistema = ConfiguracaoSistema.getInstance();
        configuracaoSistema.setIdioma("en-US");

        ModuloPedidos pedidos = new ModuloPedidos();
        ModuloRelatorios relatorios = new ModuloRelatorios();

        pedidos.exibirIdioma();
        relatorios.exibirIdioma();
    }
}
