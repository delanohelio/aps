package decoradores;

import componentes.Notificador;

/**
 * Decorador Concreto: Adiciona a funcionalidade de enviar WhatsApp.
 */
public class NotificadorWhatsAppDecorator extends NotificadorDecorator {
    public NotificadorWhatsAppDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem); // 1. Chama o método do objeto decorado
        System.out.println("Enviando notificação por WhatsApp: '" + mensagem + "'"); // 2. Adiciona sua própria funcionalidade
    }
}