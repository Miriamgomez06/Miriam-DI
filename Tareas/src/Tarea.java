import java.util.ArrayList;

public abstract class Tarea implements ElementoPlanificador{

    int id;
    String titulo, descripcion, fecha;
    boolean completada;
    ArrayList<Tarea>subtareas;
    ArrayList<String>personas;
    ArrayList<String>encargos;

    public Tarea() {
    }

    public Tarea(boolean completada, String descripcion, ArrayList<String> encargos, String fecha, int id, ArrayList<String> personas, ArrayList<Tarea> subtareas, String titulo) {
        this.completada = completada;
        this.descripcion = descripcion;
        this.encargos = encargos;
        this.fecha = fecha;
        this.id = id;
        this.personas = personas;
        this.subtareas = subtareas;
        this.titulo = titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getEncargos() {
        return encargos;
    }

    public void setEncargos(ArrayList<String> encargos) {
        this.encargos = encargos;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<String> personas) {
        this.personas = personas;
    }

    public ArrayList<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(ArrayList<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
