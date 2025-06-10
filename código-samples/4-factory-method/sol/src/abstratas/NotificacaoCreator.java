package abstratas;

import concretas.Notificacao;

public abstract class NotificacaoCreator {

    private boolean notificado;

    public abstract Notificacao criarNotificacao();

    public void notificar(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
        notificado = true;
    }

    public boolean checarNotificado() {
        return notificado;
    }
}

