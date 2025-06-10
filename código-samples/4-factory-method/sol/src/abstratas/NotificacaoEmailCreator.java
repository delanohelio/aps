package abstratas;

import concretas.Notificacao;
import concretas.NotificacaoEmail;

// Concrete Creators
public class NotificacaoEmailCreator extends NotificacaoCreator {
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
