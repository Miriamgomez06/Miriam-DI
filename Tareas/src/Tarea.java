import java.util.ArrayList;
import java.util.List;

public abstract class Tarea implements ElementoPlanificador {
    protected int id;
    protected String titulo;
    protected String descripcion;
    protected String fecha;
    protected Prioridad prioridad;
    protected boolean completada;
    protected List<Tarea> subtareas;
    protected List<String> personas;
    protected List<String> encargos;

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

    // Getters y Setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public Prioridad getPrioridad() { return prioridad; }
    public void setPrioridad(Prioridad prioridad) { this.prioridad = prioridad; }
    public boolean isCompletada() { return completada; }

    public List<Tarea> getSubtareas() { return subtareas; }
    public List<String> getPersonas() { return personas; }
    public List<String> getEncargos() { return encargos; }

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
