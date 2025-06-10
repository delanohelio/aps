//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String tipo = "sms"; // simula entrada do usuário
        Notificacao notificacao;

        if (tipo.equals("email")) {
            notificacao = new NotificacaoEmail();
        } else if (tipo.equals("sms")) {
            notificacao = new NotificacaoSMS();
        } else if (tipo.equals("push")) {
            notificacao = new NotificacaoPush();
        } else if (tipo.equals("telefone")) {
            notificacao = new NotificacaoLigacao();
        } else {
            throw new IllegalArgumentException("Tipo inválido");
        }

        notificacao.enviar("Bem-vindo ao sistema!");
    }
}