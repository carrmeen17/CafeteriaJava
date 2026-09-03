/**
 * Representa una comida del inventario.
 * Hereda las características básicas de un producto.
 *
 * @author Carmen
 * @version 1.0
 */
public class Comida extends Producto {

    // Constructores

    /**
     * Crea una nueva comida con un nombre, precio, categoría
     * e indica si se sirve caliente.
     *
     * @param nombre nombre de la comida
     * @param precio precio de la comida
     * @param categoria categoría a la que pertenece la comida
     * @param esCaliente indica si la comida se sirve caliente
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.esCaliente = esCaliente;
    }

    // Atributos de la clase comida

    private String nombre;
    private double precio;
    private String categoria;
    private boolean esCaliente;

    // Getters y Setters

    /**
     * Devuelve el nombre de la comida.
     *
     * @return nombre de la comida
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la comida.
     *
     * @param nombre nuevo nombre de la comida
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio de la comida.
     *
     * @return precio de la comida
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio de la comida.
     *
     * @param precio nuevo precio de la comida
     */
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoría de la comida.
     *
     * @return categoría de la comida
     */
    @Override
    public String getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría de la comida.
     *
     * @param categoria nueva categoría de la comida
     */
    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Indica si la comida se sirve caliente.
     *
     * @return true si la comida es caliente, false si es fría
     */
    public boolean getesCaliente() {
        return esCaliente;
    }

    /**
     * Modifica el estado de la comida indicando si se sirve caliente.
     *
     * @param esCaliente nuevo estado de la comida
     */
    public void setesCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    // Métodos

    /**
     * Comprueba si la comida se sirve caliente o fría.
     *
     * @return "Caliente" si la comida se sirve caliente,
     *         o "Frío" si se sirve fría
     */
    public String comprobarCaliente() {
        if (esCaliente) {
            return "Caliente";
        } else {
            return "Frío";
        }
    }

    // Métodos sobrescritos de su clase padre Producto

    /**
     * Devuelve una descripción con la información de la comida,
     * incluyendo su nombre, precio, categoría y si es caliente o fría.
     *
     * @return información de la comida
     */
    @Override
    public String mostrarInformacion() {
        return "Producto: " + nombre + ". Precio: " + precio
                + ". Categoría: " + categoria
                + ". Es caliente: " + comprobarCaliente();
    }
}