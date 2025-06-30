package estados;

import model.Documento;

public class EstadoPublicado implements EstadoDocumento {
    @Override
    public void editar(Documento doc, String conteudo) {
        System.out.println("Ação inválida: Não é possível editar um documento publicado.");
    }

    @Override
    public void revisar(Documento doc) {
        System.out.println("Ação inválida: Não é possível revisar um documento publicado.");
    }

    @Override
    public void publicar(Documento doc) {
        System.out.println("Aviso: O documento já está publicado.");
    }
}
