import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Usando ArrayList
        System.out.println("Usando ArrayList:");
        List<Double> arrayList = generarListaAleatoria(new ArrayList<>(), 100);
        mostrarLista(arrayList);

        // Usando LinkedList
        System.out.println("\nUsando LinkedList:");
        List<Double> linkedList = generarListaAleatoria(new LinkedList<>(), 100);
        mostrarLista(linkedList);
    }

    public static List<Double> generarListaAleatoria(List<Double> lista, int cantidad) {
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextDouble() * 100); // Genera valores aleatorios entre 0 y 100
        }
        return lista;
    }

    public static void mostrarLista(List<Double> lista) {
        for (Double valor : lista) {
            System.out.println(valor);
        }
    }
}
