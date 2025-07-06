package invokers;

import commands.Comando;

public class ControleRemoto {
    private Comando comando;
    private Comando ultimoComandoExecutado;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void botaoPressionado() {
        if (comando != null) {
            comando.executar();
            ultimoComandoExecutado = comando;
        }
    }

    public void botaoDesfazerPressionado() {
        if (ultimoComandoExecutado != null) {
            System.out.print("Desfazendo última ação... ");
            ultimoComandoExecutado.desfazer();
            ultimoComandoExecutado = null;
        }
    }
}
