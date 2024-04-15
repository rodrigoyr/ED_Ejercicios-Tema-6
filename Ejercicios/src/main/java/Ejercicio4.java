import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Introducir nueva cadena");
            System.out.println("2. Eliminar última cadena");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    mostrarLista(lista);
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        lista.removeLast();
                        mostrarLista(lista);
                    } else {
                        System.out.println("La lista está vacía, no se puede eliminar ningún elemento.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void mostrarLista(LinkedList<String> lista) {
        System.out.println("Contenido de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
