import model.Usuario;
import servico.IServicoDeRelatorio;
import servico.ServicoDeRelatorioProxy;

public class Main {
    public static void main(String[] args) {
        // Criando usuários com diferentes perfis
        Usuario admin = new Usuario("Alice", "ADMIN");
        Usuario comum = new Usuario("Bob", "USUARIO");

        // O cliente é configurado para usar o Proxy. Para ele, é transparente.
        // Ele depende da interface IServicoDeRelatorio, não da implementação concreta.
        IServicoDeRelatorio servico = new ServicoDeRelatorioProxy();

        System.out.println("--- Cenário 1: Tentativa de acesso com usuário ADMIN ---");
        try {
            servico.gerarRelatorioConfidencial(admin);
        } catch (SecurityException e) {
            System.err.println("ERRO: " + e.getMessage());
        }

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("--- Cenário 2: Tentativa de acesso com usuário COMUM ---");
        try {
            servico.gerarRelatorioConfidencial(comum);
        } catch (SecurityException e) {
            System.err.println("ERRO: " + e.getMessage());
        }
    }
}