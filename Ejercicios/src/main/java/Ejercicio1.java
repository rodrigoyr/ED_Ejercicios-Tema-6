public class Ejercicio1 {

    public static void main(String[] args) {
        // Ejemplo de uso
        Pareja<Integer, String> pareja = new Pareja<>(10, "Hola");
        System.out.println("Primer dato: " + pareja.getPrimero());
        System.out.println("Segundo dato: " + pareja.getSegundo());
    }

    public static class Pareja<T, S> {
        private T primero;
        private S segundo;

        public Pareja(T primero, S segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        public T getPrimero() {
            return primero;
        }

        public S getSegundo() {
            return segundo;
        }
    }
}
