import model.*;
import java.util.Scanner;
public class Main {


      private static Planificador planificador = new Planificador();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            mostrarMenuPrincipal();
        }

        private static void mostrarMenuPrincipal() {
            while (true) {
                System.out.println("GESTIÓN DE TAREAS");
                System.out.println("1. Registrar tarea");
                System.out.println("2. Registrar lista");
                System.out.println("3. Modificar tarea");
                System.out.println("4. Listar todos los elementos");
                System.out.println("5. Completar tarea");
                System.out.println("6. Listar tareas completadas");
                System.out.println("7. Listar tareas incompletas");
                System.out.println("8. Agregar persona a tarea");
                System.out.println("9. Agregar encargo a tarea");
                System.out.println("10. Agregar elemento a lista");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> registrarTarea();
                    case 2 -> registrarLista();
                    case 3 -> modificarTarea();
                    case 4 -> planificador.listarTodos();
                    case 5 -> completarTarea();
                    case 6 -> planificador.listarCompletadas();
                    case 7 -> planificador.listarIncompletas();
                    case 8 -> agregarPersonaATarea();
                    case 9 -> agregarEncargoATarea();
                    case 10 -> agregarElementoALista();
                    case 0 -> {
                        System.out.println("Salir");
                        return;
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        }

        private static void registrarTarea() {
            System.out.println("REGISTRAR TAREA");
            System.out.println("1. Tarea de Ocio");
            System.out.println("2. Tarea de Trabajo");
            System.out.print("Seleccione el tipo de tarea: ");

            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();
            System.out.print("Fecha: ");
            String fecha = scanner.nextLine();

            System.out.println("Prioridad (1-Baja, 2-Media, 3-Alta): ");
            int prioridadOp = scanner.nextInt();
            scanner.nextLine();
            Prioridad prioridad = Prioridad.values()[prioridadOp - 1];

            int id = planificador.getSiguienteId();
            Tarea tarea;

            if (tipo == 1) {
                System.out.print("Ubicación: ");
                String ubicacion = scanner.nextLine();
                System.out.print("Presupuesto: ");
                double presupuesto = scanner.nextDouble();
                scanner.nextLine();

                tarea = new TareaOcio(id, titulo, descripcion, fecha, prioridad, ubicacion, presupuesto);
            } else {
                System.out.print("Proyecto: ");
                String proyecto = scanner.nextLine();
                tarea = new TareaTrabajo(id, titulo, descripcion, fecha, prioridad, proyecto);
            }


            System.out.print("¿Depende de otra tarea?: ");
            if (scanner.nextLine().equalsIgnoreCase("s")) {
                System.out.print("ID de la tarea padre: ");
                int idPadre = scanner.nextInt();
                scanner.nextLine();
                Tarea tareaPadre = planificador.buscarTareaPorId(idPadre);
                if (tareaPadre != null) {
                    tareaPadre.agregarSubtarea(tarea);
                    System.out.println("Subtarea agregada correctamente.");
                } else {
                    System.out.println("No se encontró la tarea padre. Se agregará como tarea principal.");
                    planificador.agregarElemento(tarea);
                }
            } else {
                planificador.agregarElemento(tarea);
            }

            System.out.println("Tarea registrada correctamente con ID: " + id);
        }

        private static void registrarLista() {
            System.out.println("REGISTRAR LISTA");
            int id = planificador.getSiguienteId();
            Lista lista = new Lista(id);
            planificador.agregarElemento(lista);
            System.out.println("Lista creada correctamente con ID: " + id);
        }

        private static void modificarTarea() {
            System.out.print("ID de la tarea a modificar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Tarea tarea = planificador.buscarTareaPorId(id);
            if (tarea == null) {
                System.out.println("No se encontró la tarea.");
                return;
            }

            System.out.println("Campos modificables:");
            System.out.println("1. Título");
            System.out.println("2. Descripción");
            System.out.println("3. Fecha");
            System.out.println("4. Prioridad");
            if (tarea instanceof TareaOcio) {
                System.out.println("5. Ubicación");
                System.out.println("6. Presupuesto");
            } else if (tarea instanceof TareaTrabajo) {
                System.out.println("5. Proyecto");
            }

            System.out.print("Seleccione el campo a modificar: ");
            int campo = scanner.nextInt();
            scanner.nextLine();

            switch (campo) {
                case 1 -> {
                    System.out.print("Nuevo título: ");
                    tarea.setTitulo(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("Nueva descripción: ");
                    tarea.setDescripcion(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Nueva fecha: ");
                    tarea.setFecha(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Nueva prioridad (1-Baja, 2-Media, 3-Alta): ");
                    int prioridadOp = scanner.nextInt();
                    scanner.nextLine();
                    tarea.setPrioridad(Prioridad.values()[prioridadOp - 1]);
                }
                case 5 -> {
                    if (tarea instanceof TareaOcio) {
                        System.out.print("Nueva ubicación: ");
                        ((TareaOcio) tarea).setUbicacion(scanner.nextLine());
                    } else if (tarea instanceof TareaTrabajo) {
                        System.out.print("Nuevo proyecto: ");
                        ((TareaTrabajo) tarea).setProyecto(scanner.nextLine());
                    }
                }
                case 6 -> {
                    if (tarea instanceof TareaOcio) {
                        System.out.print("Nuevo presupuesto: ");
                        ((TareaOcio) tarea).setPresupuesto(scanner.nextDouble());
                        scanner.nextLine();
                    }
                }
            }

            System.out.println("Tarea modificada correctamente.");
        }

        private static void completarTarea() {
            System.out.print("ID de la tarea a completar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Tarea tarea = planificador.buscarTareaPorId(id);
            if (tarea != null) {
                if (tarea.getSubtareas().isEmpty()) {
                    tarea.completar();
                    System.out.println("Tarea completada correctamente.");
                } else {
                    System.out.println("No se puede completar manualmente una tarea con subtareas.");
                    System.out.println("Se completará automáticamente cuando todas sus subtareas estén completadas.");
                }
            } else {
                System.out.println("No se encontró la tarea.");
            }
        }

        private static void agregarPersonaATarea() {
            System.out.print("ID de la tarea: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nombre de la persona: ");
            String persona = scanner.nextLine();
            planificador.agregarPersonaATarea(id, persona);
        }

        private static void agregarEncargoATarea() {
            System.out.print("ID de la tarea: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Encargo: ");
            String encargo = scanner.nextLine();
            planificador.agregarEncargoATarea(id, encargo);
        }

        private static void agregarElementoALista() {
            System.out.print("ID de la lista: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Elemento a agregar: ");
            String elemento = scanner.nextLine();
            planificador.agregarElementoALista(id, elemento);
        }
    }
1
