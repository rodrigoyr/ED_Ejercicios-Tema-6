import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
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
                    conjunto.add(cadena);
                    mostrarConjunto(conjunto);
                    break;
                case 2:
                    System.out.print("Introduce la cadena a eliminar: ");
                    String cadenaEliminar = scanner.nextLine();
                    if (conjunto.contains(cadenaEliminar)) {
                        conjunto.remove(cadenaEliminar);
                        mostrarConjunto(conjunto);
                    } else {
                        System.out.println("La cadena no está en la lista.");
                    }
                    break;
                case 3:
                    mostrarConjunto(conjunto);
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

    public static void mostrarConjunto(TreeSet<String> conjunto) {
        System.out.println("Contenido del conjunto:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
