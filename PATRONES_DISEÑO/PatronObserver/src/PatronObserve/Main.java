package PatronObserve;

public class Main {
    public static void main(String[] args) {
        Usuario roger = new Usuario("Roger","Chapana");
        Usuario winny = new Usuario("Winny","Quispe");

        Observador obs1 = new Seguidor("Karina","Llanos");

        Observador obs2 = new Seguidor("Topo","Yiyo");
        Observador obs3 = new Seguidor("NArco","Paflilo");

        roger.agregarSeguidor(obs1);
        roger.agregarSeguidor(obs3);
        winny.agregarSeguidor(obs2);



        roger.subidoFoto("Actualizando");
        roger.subidoFoto("Probando");

        obs3.reporteNotificaciones();
        obs2.reporteNotificaciones();

        winny.subidoFoto("no");
        obs2.reporteNotificaciones();


    }
}
