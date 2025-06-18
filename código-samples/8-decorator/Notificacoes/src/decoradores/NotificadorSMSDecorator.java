package decoradores;

import componentes.Notificador;

/**
 * Decorador Concreto: Adiciona a funcionalidade de enviar SMS.
 */
public class NotificadorSMSDecorator extends NotificadorDecorator {
    public NotificadorSMSDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem); // 1. Chama o método do objeto decorado (ex: o NotificadorEmail)
        System.out.println("Enviando notificação por SMS: '" + mensagem + "'"); // 2. Adiciona sua própria funcionalidade
    }
}