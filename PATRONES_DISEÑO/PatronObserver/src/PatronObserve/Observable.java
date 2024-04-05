package PatronObserve;

public interface Observable {
    void agregarSeguidor(Observador o);
    void quitarSeguidor(Observador o);
    void notificarSeguidor();
}
