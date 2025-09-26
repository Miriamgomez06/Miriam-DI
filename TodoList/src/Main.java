import model.Encargo;
import model.Persona;
import model.Tarea;
import model.TareaProfesional;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Tarea tarea = new Tarea("Practica DI",
                "Esta practica de DI es hacer un programa todolist",
                true,
                2);
        // tarea.asignarResponsable(new Persona("123A","Nombre1","Apellido1",23));
        // tarea.asignarResponsable(new Persona("123A","Nombre1","Apellido1",23));
        // tarea.asignarResponsable(new Persona("123A","Nombre1","Apellido1",23));
        /*.agregarEncargo(new Encargo(1,"Planificar la entrega"));
        tarea.agregarEncargo(new Encargo(2,"Codiicar la practica"));
        tarea.agregarEncargo(new Encargo(3,"Grabar video"));
        tarea.agregarEncargo(new Encargo(4,"Entregar practica"));
        tarea.completarEncargo(1);
        tarea.completarEncargo(2);
        tarea.completarEncargo(3);
        tarea.completarEncargo(4);
        // tarea.listarEncargos();
        tarea.completarTarea();
        // tarea.buscarEncargoId(9);
        // tarea.listarEncargosCompletados();*/


        TareaProfesional tareaProfesional = new TareaProfesional("tarea1", "descripcion", true,5,10000, new Date());
        System.out.println(tareaProfesional);




    }
}