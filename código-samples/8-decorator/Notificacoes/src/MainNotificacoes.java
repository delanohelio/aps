import componentes.Notificador;
import componentes.NotificadorEmail;
import decoradores.NotificadorSMSDecorator;
import decoradores.NotificadorWhatsAppDecorator;

public class MainNotificacoes {
    public static void main(String[] args) {
        String mensagem = "Sua compra foi aprovada e será enviada em breve!";
        System.out.println("Disparando notificações para a mensagem: \"" + mensagem + "\"\n");

        // --- Cenário 1: Notificação padrão, apenas por E-mail ---
        System.out.println("--- Cenário 1: Notificação simples ---");
        Notificador notificadorSimples = new NotificadorEmail();
        notificadorSimples.enviar(mensagem);

        // --- Cenário 2: Notificação prioritária, por E-mail e SMS ---
        System.out.println("\n--- Cenário 2: Notificação prioritária ---");
        Notificador notificador = new NotificadorEmail();
        Notificador notificadorPrioritario = new NotificadorSMSDecorator(notificador);
        notificadorPrioritario.enviar(mensagem);

        // --- Cenário 3: Notificação de marketing, todos os canais ---
        System.out.println("\n--- Cenário 3: Notificação de marketing ---");
        // Começamos com a base (E-mail) e vamos "decorando" com os outros canais
        Notificador notificadorMarketing = new NotificadorEmail();
        notificadorMarketing = new NotificadorSMSDecorator(notificadorMarketing);
        notificadorMarketing = new NotificadorWhatsAppDecorator(notificadorMarketing);

        notificadorMarketing.enviar(mensagem);

        // --- Cenário 4: Notificação email e whatsapp ---
        System.out.println("\n--- Cenário 4: Notificação e-mail e whatsapp ---");
        Notificador notificadoremail =  new NotificadorEmail();
        Notificador noficadorwhatsapp = new NotificadorWhatsAppDecorator(notificadoremail);
        noficadorwhatsapp.enviar(mensagem);
    }
}