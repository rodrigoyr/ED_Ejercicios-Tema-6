import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear lista de 100 Parejas de enteros
        List<Pareja<Integer, Integer>> listaParejas = generarListaParejas(100);

        // Mostrar las parejas por pantalla
        for (Pareja<Integer, Integer> pareja : listaParejas) {
            System.out.println("(" + pareja.getPrimero() + ", " + pareja.getSegundo() + ")");
        }
    }

    public static List<Pareja<Integer, Integer>> generarListaParejas(int cantidad) {
        List<Pareja<Integer, Integer>> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int primero = random.nextInt(101); // Números aleatorios entre 0 y 100
            int segundo = random.nextInt(101);
            lista.add(new Pareja<>(primero, segundo));
        }
        return lista;
    }

    public static class Pareja<T, S> {
        private T primero;
        private S segundo;

        public Pareja(T primero, S segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        public T getPrimero() {
            return primero;
        }

        public S getSegundo() {
            return segundo;
        }
    }
}
