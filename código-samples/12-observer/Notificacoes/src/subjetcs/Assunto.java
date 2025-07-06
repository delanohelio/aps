package subjetcs;

import observers.Observador;

public interface Assunto {
    void anexar(Observador observador);
    void desanexar(Observador observador);
    void notificarObservadores();
}