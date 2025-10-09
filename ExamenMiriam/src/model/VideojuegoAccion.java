package model;

public class VideojuegoAccion extends Videojuego {
    private int nivelViolencia;
    private boolean modoMultijugador;
    private double tamanoGB;

    public VideojuegoAccion(String titulo, String desarrollador, int anoLanzamiento, double precio, String clasificacionEdad, int nivelViolencia, boolean modoMultijugador, double tamanoGB) {
        super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
        this.nivelViolencia = nivelViolencia;
        this.modoMultijugador = modoMultijugador;
        this.tamanoGB = tamanoGB;
    }


    public int getNivelViolencia() {
        return nivelViolencia;
    }

    public void setNivelViolencia(int nivelViolencia) {
        this.nivelViolencia = nivelViolencia;
    }

    public boolean isModoMultijugador() {
        return modoMultijugador;
    }

    public void setModoMultijugador(boolean modoMultijugador) {
        this.modoMultijugador = modoMultijugador;
    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }


    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getPrecio();
        if (nivelViolencia > 3) {
            precioFinal += precioFinal * 0.05;
        }
        if (modoMultijugador) {
            precioFinal += precioFinal * 0.10;
        }
        return precioFinal;
    }

    @Override
    public double obtenerTamanoGB() {
        return 0;
    }
}
