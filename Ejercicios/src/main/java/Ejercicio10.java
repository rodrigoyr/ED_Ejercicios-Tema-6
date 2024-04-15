import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Crear un TreeSet para almacenar los registros de venta
        Set<Venta> ventasSet = new TreeSet<>(new VentaComparator());

        // Leer registros de venta del usuario
        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Introducir nueva venta");
            System.out.println("2. Listar ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduce los detalles de la venta:");
                    System.out.print("Nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Precio de la transacción: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Fecha de la transacción (formato dd/MM/yyyy): ");
                    String fechaStr = scanner.nextLine();
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha = dateFormat.parse(fechaStr);
                        ventasSet.add(new Venta(producto, cliente, precio, fecha));
                    } catch (ParseException e) {
                        System.out.println("Error: Formato de fecha incorrecto. Por favor, utiliza el formato dd/MM/yyyy.");
                    }
                    break;
                case "2":
                    if (ventasSet.isEmpty()) {
                        System.out.println("No hay ventas registradas.");
                    } else {
                        System.out.println("\nListado de ventas:");
                        for (Venta venta : ventasSet) {
                            System.out.println(venta);
                        }
                    }
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

    // Clase para representar una venta
    static class Venta {
        private String producto;
        private String cliente;
        private double precio;
        private Date fecha;

        public Venta(String producto, String cliente, double precio, Date fecha) {
            this.producto = producto;
            this.cliente = cliente;
            this.precio = precio;
            this.fecha = fecha;
        }

        public String getProducto() {
            return producto;
        }

        public String getCliente() {
            return cliente;
        }

        public double getPrecio() {
            return precio;
        }

        public Date getFecha() {
            return fecha;
        }

        @Override
        public String toString() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return "Producto: " + producto + ", Cliente: " + cliente + ", Precio: " + precio + ", Fecha: " + dateFormat.format(fecha);
        }
    }

    // Comparador personalizado para ordenar las ventas según la fecha, nombre del cliente y precio
    static class VentaComparator implements Comparator<Venta> {
        @Override
        public int compare(Venta venta1, Venta venta2) {
            // Comparar por fecha
            int comparacionFecha = venta1.getFecha().compareTo(venta2.getFecha());
            if (comparacionFecha != 0) {
                return comparacionFecha;
            }
            // Si las fechas son iguales, comparar por nombre del cliente
            int comparacionCliente = venta1.getCliente().compareTo(venta2.getCliente());
            if (comparacionCliente != 0) {
                return comparacionCliente;
            }
            // Si los nombres de cliente son iguales, comparar por precio
            return Double.compare(venta1.getPrecio(), venta2.getPrecio());
        }
    }
}
