package model;
import java.util.ArrayList;
import java.util.List;

public abstract class Tarea implements ElementoPlanificador {
    int id;
    String titulo;
    String descripcion;
    String fecha;
    Prioridad prioridad;
    boolean completada;
    ArrayList<Tarea> subtareas;
    List<String> personas;
    ArrayList<String> encargos;

    public Tarea(int id, String titulo, String descripcion, String fecha, Prioridad prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.completada = false;
        this.subtareas = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.encargos = new ArrayList<>();
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPersonas() {
        return personas;
    }

    public void setPersonas(List<String> personas) {
        this.personas = personas;
    }

    public ArrayList<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(ArrayList<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public void agregarPersona(String persona) {
        personas.add(persona);
    }

    public void agregarEncargo(String encargo) {
        encargos.add(encargo);
    }

    public void completar() {
        if (subtareas.isEmpty() || todasSubtareasCompletadas()) {
            this.completada = true;
        }
    }

    private boolean todasSubtareasCompletadas() {
        for (Tarea subtarea : subtareas) {
            if (!subtarea.isCompletada()) {
                return false;
            }
        }
        return true;
    }

    public abstract void mostrarDetalles();
}