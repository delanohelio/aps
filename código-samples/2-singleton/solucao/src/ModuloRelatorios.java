public class ModuloRelatorios {
    public void exibirIdioma() {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
        System.out.println("Módulo Relatórios - Idioma: " + config.getIdioma());
    }
}