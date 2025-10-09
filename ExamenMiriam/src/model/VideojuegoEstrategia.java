package model;

    public class VideojuegoEstrategia extends Videojuego {
        private int complejidad;
        private int duracionPartida;
        private double tamanoGB;

        public VideojuegoEstrategia(String titulo, String desarrollador, int anoLanzamiento, double precio, String clasificacionEdad, int complejidad, int duracionPartida, double tamanoGB) {
            super(titulo, desarrollador, anoLanzamiento, precio, clasificacionEdad);
            this.complejidad = complejidad;
            this.duracionPartida = duracionPartida;
            this.tamanoGB = tamanoGB;
        }


        public int getComplejidad() {
            return complejidad;
        }

        public void setComplejidad(int complejidad) {
            this.complejidad = complejidad;
        }

        public int getDuracionPartida() {
            return duracionPartida;
        }

        public void setDuracionPartida(int duracionPartida) {
            this.duracionPartida = duracionPartida;
        }

        public double getTamanoGB() {
            return tamanoGB;
        }

        public void setTamanoGB(double tamanoGB) {
            this.tamanoGB = tamanoGB;
        }

        @Override
        public double calcularPrecioFinal() {
            return getPrecio() * (1 + 0.03 * complejidad);
        }

        @Override
        public double obtenerTamanoGB() {
            return 0;
        }
    }


