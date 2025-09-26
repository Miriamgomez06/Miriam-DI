import java.util.ArrayList;

public class TareaOcio extends  Tarea{

    String ubicacion;
    double presupuesto;

    public TareaOcio() {
    }

    public TareaOcio(double presupuesto, String ubicacion) {
        this.presupuesto = presupuesto;
        this.ubicacion = ubicacion;
    }

    public TareaOcio(boolean completada, String descripcion, ArrayList<String> encargos, String fecha, int id, ArrayList<String> personas, ArrayList<Tarea> subtareas, String titulo, double presupuesto, String ubicacion) {
        super(completada, descripcion, encargos, fecha, id, personas, subtareas, titulo);
        this.presupuesto = presupuesto;
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("tarea de ocio");
        System.out.println("id:"+id);
        System.out.println("titulo"+titulo);
        System.out.println("descripcion"+descripcion);

        System.out.println("Fecha: " + fecha);
        System.out.println("Completada: " + (completada ? "Sí" : "No"));
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Personas asignadas: " + personas);
        System.out.println("Encargos: " + encargos);
        System.out.println("Subtareas: " + subtareas.size());
    }
}


