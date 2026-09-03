import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ticket_Test {
    Cliente mario = new Cliente("Mario", "650988098");
    Camarero roberto = new Camarero("Roberto", 1234);
    @Test
    void sacar_numero_productos() {
        Ticket t = new Ticket(mario, roberto);
        Producto cubierto = new Producto("Cubierto", 1.20, "suplemento");
        t.anadirProductos(cubierto);
        assertEquals(1, t.getContadorProductos(), 0.01);
    }

}