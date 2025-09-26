import java.util.ArrayList;
import java.util.List;

public class Lista implements ElementoPlanificador {
    private int id;
    private List<String> elementos;

    public Lista(int id) {
        this.id = id;
        this.elementos = new ArrayList<>();
    }

    public int getId() { return id; }
    public List<String> getElementos() { return elementos; }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(String elemento) {
        elementos.remove(elemento);
    }

    @Override
    public String getTitulo() {
        return "Lista " + id;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Lista ===");
        System.out.println("ID: " + id);
        System.out.println("Elementos: " + elementos.size());
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println((i + 1) + ". " + elementos.get(i));
        }
    }
}