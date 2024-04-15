import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Introducir nueva cadena");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cadena: ");
                    String cadena = scanner.nextLine();
                    System.out.print("Introduce la posición (índice) donde insertarla: ");
                    int posicion = scanner.nextInt();
                    lista.add(posicion, cadena);
                    mostrarLista(lista);
                    break;
                case 2:
                    System.out.print("Introduce la posición (índice) de la cadena a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    if (posicionEliminar >= 0 && posicionEliminar < lista.size()) {
                        lista.remove(posicionEliminar);
                        mostrarLista(lista);
                    } else {
                        System.out.println("Posición no válida.");
                    }
                    break;
                case 3:
                    mostrarLista(lista);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarLista(LinkedList<String> lista) {
        System.out.println("Contenido de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
