import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Map<Integer, Character> mapaNumerosLetras = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Introducir par número/letra");
            System.out.println("2. Recuperar letra a partir de un número");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Introduce una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    mapaNumerosLetras.put(numero, letra);
                    break;
                case 2:
                    System.out.print("Introduce el número del que quieres recuperar la letra: ");
                    int numBuscar = scanner.nextInt();
                    if (mapaNumerosLetras.containsKey(numBuscar)) {
                        char letraCorrespondiente = mapaNumerosLetras.get(numBuscar);
                        System.out.println("La letra correspondiente al número " + numBuscar + " es: " + letraCorrespondiente);
                    } else {
                        System.out.println("El número ingresado no tiene una letra asociada.");
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
}
