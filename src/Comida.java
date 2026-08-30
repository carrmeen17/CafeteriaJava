public class Comida extends Producto {

// constructores
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.esCaliente=esCaliente;
    }

// atributos de la clase comida
    private String nombre;
    private double precio;
    private String categoria;
    private boolean esCaliente;


//Getters y Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }
    public String getCategoria() {

        return categoria;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }

    public boolean getesCaliente() {

        return esCaliente;
    }

    public void setesCaliente(boolean esCaliente) {

        this.esCaliente = esCaliente;
    }

//métodos
    public String comprobarCaliente (){
        if (esCaliente){
            return "Caliente";
        }else {
            return "Frío";
        }
    }

// métodos sobreescrito de su clase padre producto
    @Override
    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria +". Es caliente: " +comprobarCaliente();

    }
}
