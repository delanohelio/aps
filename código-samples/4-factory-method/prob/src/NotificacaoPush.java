public class NotificacaoPush implements Notificacao {

    private boolean enviado;


    public void enviar(String mensagem) {
        System.out.println("Enviando por PUSH: " + mensagem);
    }

    @Override
    public boolean verificarEnvio() {
        return enviado;
    }
}