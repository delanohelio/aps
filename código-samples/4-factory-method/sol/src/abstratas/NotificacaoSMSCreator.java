package abstratas;

import concretas.Notificacao;
import concretas.NotificacaoSMS;

public class NotificacaoSMSCreator extends NotificacaoCreator {
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
