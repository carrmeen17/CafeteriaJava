public class Bebida extends Producto {

// constructores
    public Bebida(String nombre, double precio, String categoria,String tamano) {
        super(nombre, precio, categoria);
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
        this.tamano=tamano;
    }

// atributos de la clase bebida
    private String nombre;
    private double precio;
    private String categoria;
    private String tamano;

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

    public String getTamano() {

        return tamano;
    }

    public void setTamano(String tamano) {

        this.tamano = tamano;
    }

// métodos sobreescrito de su clase padre producto
    @Override
    public String mostrarInformacion(){
        return "Producto: " +nombre +". Precio: " +precio +". Categoría: " +categoria +". Tamaño: " +tamano;

    }
}
