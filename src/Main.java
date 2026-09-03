/**
 * Clase principal del programa que permite ejecutar
 * y comprobar el funcionamiento del sistema de gestión
 * de productos, clientes, camareros y tickets.
 *
 * @author Carmen
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Crea un cliente, un camarero y varios productos,
     * crea un ticket, añade los productos, aplica un descuento
     * y muestra el ticket completo por pantalla.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        // 1. Crear al menos un cliente.
        Cliente mario = new Cliente("Mario", "650988098");

        // 2. Crear al menos un camarero.
        Camarero roberto = new Camarero("Roberto", 1234);

        // 3. Crear varios productos, incluyendo objetos de las clases hijas.
        Producto cubierto = new Producto("Cubierto", 1.20, "suplemento");
        Bebida cafe = new Bebida("Café", 1.20, "bebida", "doble");
        Comida tarta = new Comida("Tarta", 3.50, "comida", false);

        // Mostrar la información de los productos.
        System.out.println(cafe.mostrarInformacion());
        System.out.println(tarta.mostrarInformacion());
        System.out.println(cubierto.mostrarInformacion());
        System.out.println("-------------------------------");

        // 4. Crear un ticket.
        Ticket ticket = new Ticket(mario, roberto);

        // 5. Añadir productos al ticket.
        ticket.anadirProductos(cafe);
        ticket.anadirProductos(tarta);
        ticket.anadirProductos(cubierto);

        // 6. Aplicar un descuento.
        cafe.aplicarDescuento(10);

        // 7. Mostrar el ticket completo.
        // 8. Calcular y mostrar el total.
        ticket.mostrarTicket();
    }
}

