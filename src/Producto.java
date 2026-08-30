public class Producto implements Descontable{

    public Producto(String nombre, double precio, String categoria) {
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    private String nombre;
    private double precio;
    private String categoria;
    private int descuento = 0;

    //TODO comentarios
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

    @Override
    public double aplicarDescuento(int descuento) {
        this.descuento = descuento;
       double precioFinal=precio-(precio*descuento/100);
        return precioFinal;
    }
    @Override
    public double aplicarDescuento() {
        double precioFinal=precio-(precio*descuento/100);
        return precioFinal;
    }



    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria;

    }

}
