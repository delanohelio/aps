package models;

/**
 * Representa os dados no formato XML do sistema legado.
 * É a classe que precisa ser "adaptada".
 */
public class XMLDocument {
    private final String conteudo;

    public XMLDocument(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudoXML() {
        return this.conteudo;
    }
}