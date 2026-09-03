import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Producto_Test {

    @Test
    void aplicarDescuento() {
        Producto p = new Producto("Pan", 1.0, "Comida");
        assertEquals(0.90, p.aplicarDescuento(10), 0.01);
    }

    @Test
    void aplicarDescuento_get() {
        Producto p = new Producto("Pan", 1.0, "Comida");
        assertEquals(p.getPrecio(), p.aplicarDescuento(), 0.01);
    }

    @Test
    void mostrarInformacion() {
        Producto p = new Producto("Pan", 1.0, "Comida");
        String salida_esperada = "Producto: " +p.getNombre() +". Precio: " +p.getPrecio() +". Categoría: " +p.getCategoria();
        assertEquals(salida_esperada, p.mostrarInformacion());
    }


}