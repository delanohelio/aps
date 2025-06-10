package concretas;

public class NotificacaoSMS implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }

}