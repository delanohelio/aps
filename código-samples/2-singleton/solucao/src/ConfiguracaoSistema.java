public class ConfiguracaoSistema {
    private static ConfiguracaoSistema configuracaoSistema;
    public String idioma;

    private ConfiguracaoSistema() {
        this.idioma = "pt-BR";
    }

    public static ConfiguracaoSistema getInstance() {
        if (configuracaoSistema == null) {
            configuracaoSistema = new ConfiguracaoSistema();
        }
        return configuracaoSistema;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}