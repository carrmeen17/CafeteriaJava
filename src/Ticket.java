import java.sql.SQLOutput;

public class Ticket {

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente=cliente;
        this.camarero=camarero;
    }

    Cliente cliente;
    Camarero camarero;
    Producto [] productos;
    int contadorProductos;

    public void recorrerProductos(){
        System.out.println("Productos: ");
        int contador = 1;
        for (Producto producto : productos) {
            System.out.println(contador +"- " + producto.getNombre() +" - " + producto.getPrecio() +"€.");
            contador = contador +1;

        }

    }

    public void mostrarTicket(){
        System.out.println("--- CAFETERÍA JAVA ---");
        System.out.println( "Cliente: " +cliente.getNombre());
        System.out.println("Camarero: " +camarero.getNombre() +" - " +camarero.getCodigoEmpleado());


//TODO MEJORAR
    }
}
