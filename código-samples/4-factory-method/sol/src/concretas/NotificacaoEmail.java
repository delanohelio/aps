package concretas;

public class NotificacaoEmail implements Notificacao {

    public void enviar(String mensagem) {
        System.out.println("Enviando por EMAIL: " + mensagem);
    }

}