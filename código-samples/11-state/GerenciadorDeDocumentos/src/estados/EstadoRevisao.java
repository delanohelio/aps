package estados;

import model.Documento;

public class EstadoRevisao implements EstadoDocumento {
    @Override
    public void editar(Documento doc, String conteudo) {
        System.out.println("Ação inválida: Não é possível editar um documento em revisão.");
    }

    @Override
    public void revisar(Documento doc) {
        System.out.println("Aviso: O documento já está em revisão.");
    }

    @Override
    public void publicar(Documento doc) {
        System.out.println("Publicando o documento...");
        doc.mudarEstado(new EstadoPublicado()); // Transição para o próximo estado!
    }
}
