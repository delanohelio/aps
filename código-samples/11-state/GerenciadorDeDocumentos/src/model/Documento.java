package model;

import estados.EstadoDocumento;
import estados.EstadoRascunho;

public class Documento {
    private EstadoDocumento estadoAtual;
    private String conteudo;

    public Documento() {
        // O estado inicial é definido aqui
        this.estadoAtual = new EstadoRascunho();
    }

    // O contexto permite que os objetos de estado mudem o seu estado.
    public void mudarEstado(EstadoDocumento novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    // O contexto delega o comportamento para o objeto de estado atual.
    public void editar(String novoConteudo) {
        estadoAtual.editar(this, novoConteudo);
    }

    public void revisar() {
        estadoAtual.revisar(this);
    }

    public void publicar() {
        estadoAtual.publicar(this);
    }
}
