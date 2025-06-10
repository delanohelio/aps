package abstratas;

import concretas.Notificacao;
import concretas.NotificacaoPush;

public class NotificacaoPushCreator extends NotificacaoCreator {
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
