import java.util.ArrayList;

/**
 * Representa un ticket de una cafetería.
 * El ticket contiene información sobre el cliente,
 * el camarero y los productos incluidos.
 *
 * @author Carmen
 * @version 1.0
 */
public class Ticket {

    // Constructores

    /**
     * Crea un nuevo ticket asociado a un cliente y un camarero.
     *
     * @param cliente cliente asociado al ticket
     * @param camarero camarero que atiende el ticket
     */
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
    }

    // Atributos de la clase ticket

    private Cliente cliente;
    private Camarero camarero;
    private ArrayList<Producto> productos = new ArrayList<>();
    private int contadorProductos;

    // Getters y Setters

    /**
     * Calcula y devuelve el número de productos incluidos en el ticket.
     *
     * @return número de productos del ticket
     */
    public int getContadorProductos() {
        contadorProductos = 0;
        for (Producto producto : productos) {
            contadorProductos = contadorProductos + 1;
        }
        return contadorProductos;
    }

    // Métodos

    /**
     * Añade un producto al ticket.
     *
     * @param producto producto que se añadirá al ticket
     */
    public void anadirProductos(Producto producto) {
        productos.add(producto);
    }

    /**
     * Recorre y muestra por pantalla todos los productos
     * incluidos en el ticket, indicando su número, nombre y precio.
     */
    public void recorrerProductos() {
        System.out.println("Productos: ");

        int contador = 1;

        for (Producto producto : productos) {
            System.out.println(contador + "- " + producto.getNombre()
                    + " - " + producto.getPrecio() + "€.");

            contador = contador + 1;
        }
    }

    /**
     * Calcula y muestra por pantalla el total del ticket.
     * Permite elegir si se desea calcular el total aplicando
     * los descuentos de los productos.
     *
     * @param descuento indica si se deben aplicar los descuentos
     */
    public void total(boolean descuento) {

        if (descuento) {

            double total = 0;

            for (Producto producto : productos) {
                total = producto.aplicarDescuento() + total;
            }

            System.out.println("Total con descuento: " + total + "€. ");

        } else {

            double total = 0;

            for (Producto producto : productos) {
                total = producto.getPrecio() + total;
            }

            System.out.println("Total sin descuento: " + total + "€. ");
        }
    }

    /**
     * Muestra por pantalla los descuentos aplicados a los productos
     * y el precio final de los productos que tienen descuento.
     * Este método solo puede ser utilizado dentro de la clase Ticket.
     */
    private void mostrarDescuentos() {

        for (Producto producto : productos) {

            if (producto.getDescuento() > 0) {

                System.out.println("Descuento aplicado al "
                        + producto.getNombre() + ": "
                        + producto.getDescuento() + "%");

                System.out.println("Precio final del "
                        + producto.getNombre() + ": "
                        + producto.aplicarDescuento() + "€");
            }
        }
    }

    /**
     * Muestra por pantalla el ticket completo, incluyendo
     * los datos del cliente y camarero, los productos,
     * el total sin descuento, los descuentos aplicados
     * y el total con descuento.
     */
    public void mostrarTicket() {

        System.out.println("--- CAFETERÍA JAVA ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero.getNombre()
                + " - " + camarero.getCodigoEmpleado());

        System.out.println(" ");

        recorrerProductos();

        System.out.println(" ");

        total(false);

        System.out.println(" ");

        mostrarDescuentos();

        total(true);
    }
}