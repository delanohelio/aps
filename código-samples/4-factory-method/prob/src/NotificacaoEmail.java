public class NotificacaoEmail implements Notificacao {

    private boolean enviado;

    public void enviar(String mensagem) {
        enviado = true;
        System.out.println("Enviando por EMAIL: " + mensagem);
    }

    public boolean verificarEnvio() {
        return enviado;
    }

}