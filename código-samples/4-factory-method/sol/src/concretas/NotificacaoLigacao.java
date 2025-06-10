package concretas;

public class NotificacaoLigacao implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando por Telefone: " + mensagem);
    }
}
