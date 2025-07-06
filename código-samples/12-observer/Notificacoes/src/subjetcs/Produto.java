package subjetcs;

import observers.Observador;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Assunto {
    private String nome;
    private int estoque;
    private List<Observador> observadores = new ArrayList<>();

    public Produto(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int novoEstoque) {
        // Se o produto estava sem estoque e agora tem, notifique!
        if (this.estoque == 0 && novoEstoque > 0) {
            System.out.println("O produto '" + this.nome + "' voltou ao estoque!");
            notificarObservadores(); // Chama a notificação
        }
        this.estoque = novoEstoque;
    }

    @Override
    public void anexar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void desanexar(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        // O Subject não sabe quem são os observadores, apenas os notifica.
        for (Observador obs : observadores) {
            obs.atualizar(this.nome);
        }
    }
}
