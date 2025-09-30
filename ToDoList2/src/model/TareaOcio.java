package model;

public class TareaOcio extends Tarea {
    private String ubicacion;
    private double presupuesto;

    public TareaOcio(int id, String titulo, String descripcion, String fecha,
                     Prioridad prioridad, String ubicacion, double presupuesto) {
        super(id, titulo, descripcion, fecha, prioridad);
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tarea de Ocio ");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Completada: " + (completada ? "Sí" : "No"));
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Personas asignadas: " + personas);
        System.out.println("Encargos: " + encargos);
        System.out.println("Subtareas: " + subtareas.size());
    }
}
