import com.sun.nio.sctp.SctpMultiChannel;

public class Main {

    public static void main() {
// 1. Crear al menos un cliente.
        Cliente mario = new Cliente("Mario", "650988098");
// 2. Crear al menos un camarero.
        Camarero roberto = new Camarero("Roberto", 1234);
// 3. Crear varios productos, incluyendo objetos de las clases hijas.
        Producto cubierto = new Producto("Cubierto", 1.20, "suplemento");
        Bebida cafe = new Bebida("Café", 1.20, "bebida", "doble");
        Comida tarta = new Comida("Tarta", 3.50, "comida", false);

// ejemplos para mostrar la informacion
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
// 6. Mostrar el ticket completo por pantalla, 7. Calcular y mostrar el total y 8. Aplicar al menos un descuento usando la interfaz Descontable.
        cafe.aplicarDescuento(10);
        ticket.mostrarTicket();



    }
}
