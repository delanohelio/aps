package decoradores;

import componentes.Notificador;

/**
 * Decorador Abstrato: Mantém uma referência ao objeto Notificador
 * e se conforma à interface do Notificador, delegando o trabalho a ele.
 */
public abstract class NotificadorDecorator implements Notificador {
    protected Notificador notificadorEnvolvido;

    public NotificadorDecorator(Notificador notificador) {
        this.notificadorEnvolvido = notificador;
    }

    // Por padrão, o decorador delega a chamada para o objeto que ele envolve.
    @Override
    public void enviar(String mensagem) {
        notificadorEnvolvido.enviar(mensagem);
    }
}