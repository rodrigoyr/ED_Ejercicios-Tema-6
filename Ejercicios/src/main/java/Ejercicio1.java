public class Ejercicios1<T> {
    private T primerElemento;
    private T segundoElemento;

    // Constructor
    public Pareja(T primerElemento, T segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    // Método para obtener el primer elemento
    public T obtenerPrimerElemento() {
        return primerElemento;
    }

    // Método para obtener el segundo elemento
    public T obtenerSegundoElemento() {
        return segundoElemento;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Pareja<Integer> parejaEnteros = new Pareja<>(5, 10);
        System.out.println("Primer elemento: " + parejaEnteros.obtenerPrimerElemento());
        System.out.println("Segundo elemento: " + parejaEnteros.obtenerSegundoElemento());

        Pareja<String> parejaStrings = new Pareja<>("Hola", "Mundo");
        System.out.println("Primer elemento: " + parejaStrings.obtenerPrimerElemento());
        System.out.println("Segundo elemento: " + parejaStrings.obtenerSegundoElemento());
    }
}
