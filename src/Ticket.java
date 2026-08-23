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



    public void mostrarTicket(){
        System.out.println("--- CAFETERÍA JAVA ---");
        System.out.println( "Cliente: " +cliente.getNombre());
        System.out.println("Camarero: " +camarero.getNombre() +" - " +camarero.getCodigoEmpleado());
        System.out.println("Productos: ");

//TODO MEJORAR
    }
}
