import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio11 {

    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt"; // Nombre del archivo de entrada
        String archivoSalida = "salida.txt"; // Nombre del archivo de salida

        try {
            // Leer las líneas del archivo de entrada y almacenarlas en una lista
            List<String> lineas = leerArchivo(archivoEntrada);

            // Ordenar las líneas
            Collections.sort(lineas);

            // Escribir las líneas ordenadas en el archivo de salida
            escribirArchivo(archivoSalida, lineas);

            System.out.println("El archivo ha sido ordenado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    // Método para leer todas las líneas de un archivo y almacenarlas en una lista
    private static List<String> leerArchivo(String nombreArchivo) throws IOException {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        }
        return lineas;
    }

    // Método para escribir las líneas en un archivo
    private static void escribirArchivo(String nombreArchivo, List<String> lineas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }
}
