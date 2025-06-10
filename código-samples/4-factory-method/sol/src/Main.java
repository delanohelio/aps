import abstratas.NotificacaoCreator;
import abstratas.NotificacaoEmailCreator;
import abstratas.NotificacaoPushCreator;
import abstratas.NotificacaoSMSCreator;
import abstratas.NotificacaoTelefoneCreator;

public class Main {
    public static void main(String[] args) {
        String tipo = "push"; // simula entrada do usuário
        NotificacaoCreator creator = switch (tipo) {
            case "email" -> new NotificacaoEmailCreator();
            case "sms" -> new NotificacaoSMSCreator();
            case "push" -> new NotificacaoPushCreator();
            case "telefone" -> new NotificacaoTelefoneCreator();
            default -> throw new IllegalArgumentException("Tipo inválido");
        };

        creator.notificar("Bem-vindo ao sistema!");
        System.out.println(creator.checarNotificado());
    }
}