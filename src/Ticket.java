import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.ArrayList; // usamos ArrayList por comodidad y flexibilidad a la hora de añadir items en los productos.

// constructores
public class Ticket {

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente=cliente;
        this.camarero=camarero;
    }


// atributos de la clase ticket
    private Cliente cliente;
    private Camarero camarero;
    private ArrayList<Producto> productos= new ArrayList<>();
    private int contadorProductos;

//Getters y Setters
    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

// métodos
    public void anadirProductos(Producto producto){
        productos.add(producto);
    }

    public void recorrerProductos(){
        System.out.println("Productos: ");
        int contador = 1;
        for (Producto producto : productos) {
            System.out.println(contador +"- " + producto.getNombre() +" - " + producto.getPrecio() +"€.");
            contador = contador +1;

        }

    }

    public void total(boolean descuento){
        if (descuento){
            double total = 0;
            for (Producto producto : productos) {
                total = producto.aplicarDescuento()+ total;
            }
            System.out.println("Total con descuento: " + total + "€. ");
        }else{
            double total = 0;
            for (Producto producto : productos) {
                total = producto.getPrecio() + total;
            }
            System.out.println("Total sin descuento: " + total + "€. ");
        }

    }
// este método solo será accesible para mostrar ticket, no para el resto.
    private void mostrarDescuentos(){
        for (Producto producto : productos) {
            if (producto.getDescuento() > 0){
                System.out.println("Descuento aplicado al " + producto.getNombre() +": " +producto.getDescuento() +"%");
                System.out.println("Precio final del " + producto.getNombre() + ":" + producto.aplicarDescuento() +"€");
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
        total(false);
        System.out.println(" ");
        mostrarDescuentos();

        total(true);

    }


}
