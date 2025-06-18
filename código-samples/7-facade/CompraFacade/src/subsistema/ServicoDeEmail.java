package subsistema;

public class ServicoDeEmail {
    public void enviarConfirmacao(String destinatario, String titulo, String mensagem) {
        System.out.println("[Subsistema] Enviando e-mail de confirmação para: " + destinatario);
        System.out.println("    Título: " + titulo);
        System.out.println("    Corpo: " + mensagem);
    }
}