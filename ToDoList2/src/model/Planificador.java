package model;

import java.util.ArrayList;
import java.util.List;

public class Planificador {
    private List<ElementoPlanificador> elementos;
    private int siguienteId;

    public Planificador() {
        this.elementos = new ArrayList<>();
        this.siguienteId = 1;
    }

    public void agregarElemento(ElementoPlanificador elemento) {
        elementos.add(elemento);
    }

    public Tarea buscarTareaPorId(int id) {
        for (ElementoPlanificador elemento : elementos) {
            if (elemento instanceof Tarea && elemento.getId() == id) {
                return (Tarea) elemento;
            }
        }
        return null;
    }

    public Lista buscarListaPorId(int id) {
        for (ElementoPlanificador elemento : elementos) {
            if (elemento instanceof Lista && elemento.getId() == id) {
                return (Lista) elemento;
            }
        }
        return null;
    }

    public void listarTodos() {
        if (elementos.isEmpty()) {
            System.out.println("No hay elementos en el planificador.");
            return;
        }

        for (ElementoPlanificador elemento : elementos) {
            elemento.mostrarDetalles();
        }
    }

    public void listarCompletadas() {
        boolean hayCompletadas = false;
        for (ElementoPlanificador elemento : elementos) {
            if (elemento instanceof Tarea) {
                Tarea tarea = (Tarea) elemento;
                if (tarea.isCompletada()) {
                    tarea.mostrarDetalles();
                    hayCompletadas = true;
                }
            }
        }
        if (!hayCompletadas) {
            System.out.println("No hay tareas completadas.");
        }
    }

    public void listarIncompletas() {
        boolean hayIncompletas = false;
        for (ElementoPlanificador elemento : elementos) {
            if (elemento instanceof Tarea) {
                Tarea tarea = (Tarea) elemento;
                if (!tarea.isCompletada()) {
                    tarea.mostrarDetalles();
                    hayIncompletas = true;
                }
            }
        }
        if (!hayIncompletas) {
            System.out.println("No hay tareas incompletas.");
        }
    }

    public int getSiguienteId() {
        return siguienteId++;
    }


    public void agregarPersonaATarea(int idTarea, String persona) {
        Tarea tarea = buscarTareaPorId(idTarea);
        if (tarea != null) {
            tarea.agregarPersona(persona);
            System.out.println("Persona agregada correctamente.");
        } else {
            System.out.println("No se encontró la tarea con ID: " + idTarea);
        }
    }

    public void agregarEncargoATarea(int idTarea, String encargo) {
        Tarea tarea = buscarTareaPorId(idTarea);
        if (tarea != null) {
            tarea.agregarEncargo(encargo);
            System.out.println("Encargo agregado correctamente.");
        } else {
            System.out.println("No se encontró la tarea con ID: " + idTarea);
        }
    }

    public void agregarElementoALista(int idLista, String elemento) {
        Lista lista = buscarListaPorId(idLista);
        if (lista != null) {
            lista.agregarElemento(elemento);
            System.out.println("Elemento agregado a la lista correctamente.");
        } else {
            System.out.println("No se encontró la lista con ID: " + idLista);
        }
    }
}
