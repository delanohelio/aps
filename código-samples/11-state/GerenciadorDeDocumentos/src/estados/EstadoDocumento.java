package estados;

import model.Documento;

public interface EstadoDocumento {
    void editar(Documento doc, String conteudo);
    void revisar(Documento doc);
    void publicar(Documento doc);
}