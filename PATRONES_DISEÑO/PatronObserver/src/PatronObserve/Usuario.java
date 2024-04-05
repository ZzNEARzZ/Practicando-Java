package PatronObserve;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable{

    private String nombre;
    private String apellido;

    private List<Observador> seguidores = new ArrayList<>();

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void subidoFoto(String cargando){
        String mensaje=getNombre() +" "+getApellido()+" Actualizo su Foto de Perfil";
        notificarSeguidor();

    }
    @Override
    public void agregarSeguidor(Observador o) {
        seguidores.add(o);
    }

    @Override
    public void quitarSeguidor(Observador o) {

        seguidores.remove(o);
    }

    @Override
    public void notificarSeguidor() {
        for (Observador o : seguidores){
            o.actualizar(getNombre() +" "+getApellido()+" Actualizo su Foto de Perfil");
        }

    }
}
