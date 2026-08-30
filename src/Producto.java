public class Producto implements Descontable{

// constructores
    public Producto(String nombre, double precio, String categoria) {
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

// atributos de la clase productos
    private String nombre;
    private double precio;
    private String categoria;
    private int descuento = 0;

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

    public int getDescuento() {

        return descuento;
    }

    public void setDescuento(int descuento) {

        this.descuento = descuento;
    }

// metodos de interfaz
// usamos este método con un numero distinto de argumentos para poder utilizarlo sin tener que setear un descuento
    @Override
    public double aplicarDescuento(int descuento) {
        this.descuento = descuento;
       double precioFinal=precio-(precio*descuento/100);
        return precioFinal;
    }
    @Override
    public double aplicarDescuento() {
        double precioFinal=precio;
        if (descuento>0){
            precioFinal=precio-(precio*descuento/100);
        }

        return precioFinal;
    }


// métodos
    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria;

    }

}
