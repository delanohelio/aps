package componentes;

/**
 * Componente: Define a interface para os objetos que podem
 * ter responsabilidades adicionadas dinamicamente.
 */
public interface Notificador {
    void enviar(String mensagem);
}