public class Producto {

    public Producto(String nombre, double precio, String categoria) {
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    String nombre;
    double precio;
    String categoria;

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


    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria;

    }
}
