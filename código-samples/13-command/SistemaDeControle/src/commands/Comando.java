package commands;

public interface Comando {
    void executar();
    void desfazer(); // Adicionando suporte para Undo!
}
