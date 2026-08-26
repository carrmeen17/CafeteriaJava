public class Bebida extends Producto {

    public Bebida(String nombre, double precio, String categoria,String tamano) {
        super(nombre, precio, categoria);
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.tamano=tamano;
    }

    String nombre;
    double precio;
    String categoria;
    String tamano;

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

    public String getTamano() {

        return tamano;
    }

    public void setTamano(String tamano) {

        this.tamano = tamano;
    }

    @Override
    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria +". Tamaño: " +tamano;

    }
}
