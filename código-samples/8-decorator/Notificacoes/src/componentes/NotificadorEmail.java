package componentes;

/**
 * Componente Concreto: A implementação base e principal do nosso sistema.
 * Sempre enviaremos um e-mail.
 */
public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por E-mail: '" + mensagem + "'");
    }
}