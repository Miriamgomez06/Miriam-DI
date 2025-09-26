package model;

import java.util.Date;

public class TareaProfesional extends Tarea {

    /*private String titulo, descripcion
    private boolean prioritario completada
    private persona[] encargados;
     private Arraylist<Encargo> listaTareas;*/

    private int presupuesto;
    private Date fechaLimite;

    public TareaProfesional(String titulo, String descripcion, boolean prioritario, int numeroPersonas, int presupuesto, Date fechaLimite){
        super(titulo, descripcion, numeroPersonas);
        this.fechaLimite = fechaLimite;
        this.presupuesto = presupuesto;

    }


    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "tareaProfesional" + "presupuesto" + presupuesto + "fechalimite" + fechaLimite;
    }
}
