import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        // Generar 1 millón de enteros aleatorios
        int cantidad = 1_000_000;
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros.add(random.nextInt());
        }

        // Medir el tiempo de ordenación con TreeSet
        long startTime = System.currentTimeMillis();
        ordenarConTreeSet(new ArrayList<>(numeros));
        long endTime = System.currentTimeMillis();
        long tiempoTreeSet = endTime - startTime;

        // Medir el tiempo de ordenación con Collections.sort
        startTime = System.currentTimeMillis();
        ordenarConCollectionsSort(new ArrayList<>(numeros));
        endTime = System.currentTimeMillis();
        long tiempoCollectionsSort = endTime - startTime;

        // Medir el tiempo de ordenación con Arrays.sort
        Integer[] arrayNumeros = numeros.toArray(new Integer[0]);
        startTime = System.currentTimeMillis();
        ordenarConArraysSort(arrayNumeros);
        endTime = System.currentTimeMillis();
        long tiempoArraysSort = endTime - startTime;

        // Mostrar los tiempos de ordenación
        System.out.println("Tiempo de ordenación con TreeSet: " + tiempoTreeSet + " ms");
        System.out.println("Tiempo de ordenación con Collections.sort: " + tiempoCollectionsSort + " ms");
        System.out.println("Tiempo de ordenación con Arrays.sort: " + tiempoArraysSort + " ms");
    }

    private static void ordenarConTreeSet(List<Integer> numeros) {
        Set<Integer> treeSet = new TreeSet<>(numeros);
    }

    private static void ordenarConCollectionsSort(List<Integer> numeros) {
        Collections.sort(numeros);
    }

    private static void ordenarConArraysSort(Integer[] numeros) {
        Arrays.sort(numeros);
    }
}
