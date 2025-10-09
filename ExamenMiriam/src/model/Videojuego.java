package model;
public abstract class Videojuego implements Descargable{
    private String titulo;
    private String desarrollador;
    private int anoLanzamiento;
    private double precio;
    private String clasificacionEdad;

    public Videojuego(String titulo, String desarrollador, int anoLanzamiento, double precio, String clasificacionEdad) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.anoLanzamiento = anoLanzamiento;
        this.precio = precio;
        this.clasificacionEdad = clasificacionEdad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Desarrollador: " + desarrollador + ", Año: " + anoLanzamiento + ", Precio: " + precio + "€, Clasificación: " + clasificacionEdad;
    }


    public double calcularPrecioFinal() {
        return precio;
    }

    @Override
    public double velocidadInternet() {
        return 0;
    }

    @Override
    public double obtenerTamanoGB() {
        return 0;
    }
}

