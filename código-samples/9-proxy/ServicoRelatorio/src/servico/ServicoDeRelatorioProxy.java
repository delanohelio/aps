package servico;

import model.Usuario;

/**
 * O Proxy: Atua como um substituto e controla o acesso ao Objeto Real.
 * Ele implementa a mesma interface, tornando-se transparente para o cliente.
 */
public class ServicoDeRelatorioProxy implements IServicoDeRelatorio {
    private IServicoDeRelatorio servicoReal;

    public ServicoDeRelatorioProxy() {
        // O proxy cria e gerencia a instância do objeto real.
        this.servicoReal = new ServicoDeRelatorioReal();
    }

    @Override
    public void gerarRelatorioConfidencial(Usuario usuario) {
        System.out.println("(Proxy) Recebendo solicitação do usuário: " + usuario.getNome());

        // 1. Lógica de controle de acesso (a principal responsabilidade do proxy aqui).
        if (temPermissao(usuario)) {
            System.out.println("(Proxy) Usuário '" + usuario.getNome() + "' autorizado.");
            // 2. Se autorizado, delega a chamada para o objeto real.
            this.servicoReal.gerarRelatorioConfidencial(usuario);
        } else {
            // 3. Se não, bloqueia o acesso lançando uma exceção.
            throw new SecurityException("Acesso negado! O usuário '" + usuario.getNome() + "' não tem perfil de ADMIN.");
        }
        System.out.println("(Proxy) Finalizando a solicitação.");
    }

    private boolean temPermissao(Usuario usuario) {
        return "ADMIN".equals(usuario.getPerfil());
    }
}