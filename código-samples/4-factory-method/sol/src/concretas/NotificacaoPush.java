package concretas;

public class NotificacaoPush implements Notificacao {

    public void enviar(String mensagem) {
        System.out.println("Enviando por PUSH: " + mensagem);
    }

}