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

    public void total(){

        double total = 0;
        for (Producto producto : productos) {
            total = producto.getPrecio() + total;
        }
        System.out.println("Total: " + total + "€. ");
    }

    public void mostrarDescuentos(){
        for (Producto producto : productos) {
            if (producto.getDescuento() > 0){
                System.out.println("Descuento aplicado al " +producto.nombre +": " +producto.getDescuento() +"%");
                System.out.println("Precio final del " +producto.nombre + ":" + producto.aplicarDescuento() +"€");
            }

        }


    }

    public void mostrarTicket(){
        System.out.println("--- CAFETERÍA JAVA ---");
        System.out.println( "Cliente: " +cliente.getNombre());
        System.out.println("Camarero: " +camarero.getNombre() +" - " +camarero.getCodigoEmpleado());
        System.out.println(" ");
        recorrerProductos();
        System.out.println(" ");
        total();
        System.out.println(" ");
        mostrarDescuentos();

//TODO MEJORAR
    }
}
