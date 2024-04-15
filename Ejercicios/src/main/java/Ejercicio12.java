import java.io.File;
import java.util.*;

public class Ejercicio12 {
    private static Map<String, String> archivos = new HashMap<>();

    public static void main(String[] args) {
        // Directorio a explorar
        String directorioRaiz = "C:/"; // Puedes cambiarlo al directorio que desees explorar

        // Indexar el contenido del directorio
        indexarDirectorio(new File(directorioRaiz));

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Buscar ruta de un archivo por nombre");
            System.out.println("2. Listar archivos ordenados alfabéticamente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Introduce el nombre del archivo: ");
                    String nombreArchivo = scanner.nextLine();
                    buscarArchivo(nombreArchivo);
                    break;
                case "2":
                    listarArchivosOrdenados();
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("3"));

        scanner.close();
    }

    // Método recursivo para indexar los archivos y sus rutas
    private static void indexarDirectorio(File directorio) {
        if (directorio.isDirectory()) {
            for (File archivo : Objects.requireNonNull(directorio.listFiles())) {
                if (archivo.isDirectory()) {
                    indexarDirectorio(archivo);
                } else {
                    archivos.put(archivo.getName(), archivo.getAbsolutePath());
                }
            }
        }
    }

    // Método para buscar la ruta de un archivo por su nombre
    private static void buscarArchivo(String nombreArchivo) {
        String ruta = archivos.get(nombreArchivo);
        if (ruta != null) {
            System.out.println("La ruta del archivo \"" + nombreArchivo + "\" es: " + ruta);
        } else {
            System.out.println("No se encontró el archivo \"" + nombreArchivo + "\".");
        }
    }

    // Método para listar los archivos ordenados alfabéticamente junto con sus rutas completas
    private static void listarArchivosOrdenados() {
        List<String> nombresOrdenados = new ArrayList<>(archivos.keySet());
        Collections.sort(nombresOrdenados);

        System.out.println("\nListado de archivos ordenados alfabéticamente:");
        for (String nombre : nombresOrdenados) {
            System.out.println(nombre + ": " + archivos.get(nombre));
        }
    }
}

