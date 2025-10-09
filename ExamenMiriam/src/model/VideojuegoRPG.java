package model;

public class VideojuegoRPG extends Videojuego{

    boolean mundoAbierto;
    int horasHistoriaPrincipal;

    public VideojuegoRPG(String titulo, String desarrollador, int anoLanzamiento, double precio, String clasificacionEdad, int horasHistoriaPrincipal, boolean mundoAbierto) {
        super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
        this.mundoAbierto = mundoAbierto;
    }

    public int getHorasHistoriaPrincipal() {
        return horasHistoriaPrincipal;
    }

    public void setHorasHistoriaPrincipal(int horasHistoriaPrincipal) {
        this.horasHistoriaPrincipal = horasHistoriaPrincipal;
    }

    public boolean isMundoAbierto() {
        return mundoAbierto;
    }

    public void setMundoAbierto(boolean mundoAbierto) {
        this.mundoAbierto = mundoAbierto;
    }

    public double calcularPrecioFinal(){
        return getPrecio() * (10 + 0.02 * horasHistoriaPrincipal);


    }

    @Override
    public double obtenerTamanoGB() {
        return 0;
    }
}
