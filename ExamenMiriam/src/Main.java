import model.PlataformaJuegos;
import model.VideojuegoAccion;
import model.VideojuegoEstrategia;
import model.VideojuegoRPG;
import java.util.Scanner;

public class Main {

    private static PlataformaJuegos plataformaJuegos = new PlataformaJuegos();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        VideojuegoAccion videojuegoAccion = new VideojuegoAccion("Fortnite","Epic games",2022, 20, "+14",30,true,16.5);
        VideojuegoEstrategia videojuegoEstrategia = new VideojuegoEstrategia("Its take two","Epic games",2024, 40,"+18",20,2,20.2);
        VideojuegoRPG videojuegoRPG = new VideojuegoRPG("Spiderman2","Epic games",2025,50,"+16",3,true);
    }

    private static void mostrarMenu(){
        while (true){
            System.out.println("1.Ver todos los juegos disponibles:");
            System.out.println("2.Filtrar juegos por tipo:");
            System.out.println("3.Filtrar juegos por clasificación de edad:");
            System.out.println("4.Ver detalles de un juego:");
            System.out.println("5.Calcular el tiempo de descarga:");
            System.out.println("6.Calcular el precio total:");
            System.out.println("7.Saliendo....");
            System.out.println("0.Seleccione una opcion: ");
        }

       /* int opcion = scanner.nextInt();
        switch (opcion){
            case 1 : agregarJuegos();
                    break;
            case 2: eliminarJuego();
                    break;
            case 3: mostrarJuegosOrdenadosPorPrecio();
                    break;
            case 4: filtrarPorClasificacionEdad();
                    break;
            case 5: calcularPrecioTotal();
                    break;
            case 0:
                System.out.println("saliendo...");
        } default System.out.println("Opción no válida");*/

    }


}
