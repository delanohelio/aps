package observers;

public class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto) {
        System.out.println("  >> Notificação para " + this.nome + ": O produto '" + nomeProduto + "' está disponível novamente!");
    }
}
