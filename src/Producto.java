/**
 * Representa un producto en el inventario.
 *
 * @author Carmen
 * @version 1.0
 */
public class Producto implements Descontable {

    // Constructores

    /**
     * Crea un nuevo producto con un nombre, precio y categoría.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría a la que pertenece el producto
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Atributos de la clase productos

    private String nombre;
    private double precio;
    private String categoria;
    private int descuento = 0;

    // Getters y Setters

    /**
     * Devuelve el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del producto.
     *
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del producto.
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoría del producto.
     *
     * @return categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría del producto.
     *
     * @param categoria nueva categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Devuelve el porcentaje de descuento aplicado al producto.
     *
     * @return porcentaje de descuento
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Modifica el porcentaje de descuento del producto.
     *
     * @param descuento nuevo porcentaje de descuento
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /**
     * Calcula el precio final del producto aplicando el descuento indicado.
     * Además, guarda el descuento en el producto.
     *
     * @param descuento porcentaje de descuento que se aplicará
     * @return precio final del producto después de aplicar el descuento
     */
    @Override
    public double aplicarDescuento(int descuento) {
        this.descuento = descuento;
        double precioFinal = precio - (precio * descuento / 100);
        return precioFinal;
    }

    /**
     * Calcula el precio final del producto utilizando el descuento
     * que ya está guardado en el producto.
     *
     * @return precio final del producto después de aplicar el descuento
     */
    @Override
    public double aplicarDescuento() {
        double precioFinal = precio;

        if (descuento > 0) {
            precioFinal = precio - (precio * descuento / 100);
        }

        return precioFinal;
    }

    // Métodos

    /**
     * Devuelve una descripción con la información básica del producto.
     *
     * @return información del producto, incluyendo nombre, precio y categoría
     */
    public String mostrarInformacion() {
        return "Producto: " + nombre + ". Precio: " + precio + ". Categoría: " + categoria;
    }
}