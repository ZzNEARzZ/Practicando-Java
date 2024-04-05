package PatronObserve;

public class Seguidor implements Observador{

    private String nombre;
    private String apellido;
    private double cantidadNoti=0;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public double reporteNotificaciones(){
        System.out.println("El usuario: " +getApellido()+" "+getNombre()+ "Tiene: "+cantidadNoti+" notificaciones");
        return cantidadNoti;
    }

    @Override
    public void actualizar(String mensaje) {

        System.out.println(getNombre() +": "+ mensaje );
        cantidadNoti++;

    }
}
