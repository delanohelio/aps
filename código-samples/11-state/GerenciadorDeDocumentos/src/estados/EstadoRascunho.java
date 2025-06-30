package estados;

import model.Documento;

// Um Estado Concreto: implementa o comportamento associado a um estado do Contexto.
public class EstadoRascunho implements EstadoDocumento {

    public void editar(Documento doc, String conteudo) {
        doc.setConteudo(conteudo);
        System.out.println("Conteúdo do rascunho atualizado.");
    }

    public void revisar(Documento doc) {
        System.out.println("Enviando para revisão...");
        doc.mudarEstado(new EstadoRevisao()); // Transição para o próximo estado!
    }

    public void publicar(Documento doc) {
        System.out.println("Ação inválida: Um rascunho não pode ser publicado diretamente.");
    }
}


// A classe EstadoPublicado seria implementada de forma similar.
