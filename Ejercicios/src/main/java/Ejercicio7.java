import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Crear el mapa con los números del 0 al 10 y sus nombres en texto como claves
        Map<String, Integer> numerosMapa = new HashMap<>();
        numerosMapa.put("cero", 0);
        numerosMapa.put("uno", 1);
        numerosMapa.put("dos", 2);
        numerosMapa.put("tres", 3);
        numerosMapa.put("cuatro", 4);
        numerosMapa.put("cinco", 5);
        numerosMapa.put("seis", 6);
        numerosMapa.put("siete", 7);
        numerosMapa.put("ocho", 8);
        numerosMapa.put("nueve", 9);
        numerosMapa.put("diez", 10);

        // Mostrar el contenido del mapa
        System.out.println("Contenido del mapa:");
        for (Map.Entry<String, Integer> entry : numerosMapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

