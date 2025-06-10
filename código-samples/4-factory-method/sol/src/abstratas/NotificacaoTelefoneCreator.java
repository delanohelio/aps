package abstratas;

import concretas.Notificacao;
import concretas.NotificacaoLigacao;

public class NotificacaoTelefoneCreator extends NotificacaoCreator {

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoLigacao();
    }
}
