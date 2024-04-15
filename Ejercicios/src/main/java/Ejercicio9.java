import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Crear un TreeSet para almacenar los nombres completos de las personas
        Set<Persona> personasSet = new TreeSet<>();

        // Leer pares nombre/apellido del usuario
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido;
        System.out.println("Introduce pares nombre/apellido (Escribe 'fin' para terminar):");
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (!nombre.equalsIgnoreCase("fin")) {
                System.out.print("Apellido: ");
                apellido = scanner.nextLine();
                personasSet.add(new Persona(nombre, apellido));
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        // Mostrar nombres completos ordenados alfabéticamente por apellido
        System.out.println("\nNombres completos ordenados por apellido:");
        for (Persona persona : personasSet) {
            System.out.println(persona.getNombreCompleto());
        }
    }

    // Definir la clase Persona para representar el nombre y apellido de una persona
    static class Persona implements Comparable<Persona> {
        private String nombre;
        private String apellido;

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombreCompleto() {
            return apellido + ", " + nombre;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            // Comparar por apellido, si los apellidos son iguales, comparar por nombre
            int comparacionApellido = this.apellido.compareToIgnoreCase(otraPersona.apellido);
            if (comparacionApellido == 0) {
                return this.nombre.compareToIgnoreCase(otraPersona.nombre);
            }
            return comparacionApellido;
        }
    }
}
