public class ModuloPedidos {
    public void exibirIdioma() {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
        System.out.println("Módulo Pedidos - Idioma: " + config.getIdioma());
    }
}