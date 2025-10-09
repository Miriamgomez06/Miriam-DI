package model;
import java.util.ArrayList;

public class PlataformaJuegos {
    private ArrayList<Videojuego> juegos;

    public PlataformaJuegos() {

        juegos = new ArrayList<>();
    }

    public void agregarJuego(Videojuego juego) {

        juegos.add(juego);
    }

    public void eliminarJuego(Videojuego juego) {
        juegos.remove(juego);
    }


    public void mostrarJuegosOrdenadosPorPrecio() {
        juegos.forEach(juegos: System.out.println(juegos));
    }


    public void filtrarPorClasificacionEdad(String clasificacion) {
        juegos.stream().filter(juegos: juego.getClasificacionEdad().equals(clasificacion)).forEach(juegos: System.out.println(juegos));
    }


    public double calcularPrecioTotal() {

    }
}
