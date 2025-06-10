public class NotificacaoSMS implements Notificacao {
    private boolean enviado;

    public void enviar(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }

    public boolean verificarEnvio() {
        return enviado;
    }
}