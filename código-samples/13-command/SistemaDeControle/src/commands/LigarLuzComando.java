package commands;

import receivers.Luz;

public class LigarLuzComando implements Comando {
    private Luz luz; // Referência para o Receiver

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

    @Override
    public void desfazer() {
        luz.desligar(); // A ação de desfazer "ligar" é "desligar"
    }
}
