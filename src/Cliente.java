/**
 * Representa a un cliente de la empresa.
 *
 * @author Carmen
 * @version 1.0
 */
public class Cliente {

    // Constructores

    /**
     * Crea un nuevo cliente con un nombre y un número de teléfono.
     *
     * @param nombre nombre del cliente
     * @param telefono número de teléfono del cliente
     */
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Atributos de la clase cliente

    private String nombre;
    private String telefono;

    // Getters y Setters

    /**
     * Devuelve el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del cliente.
     *
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de teléfono del cliente.
     *
     * @return número de teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el número de teléfono del cliente.
     *
     * @param telefono nuevo número de teléfono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos

    /**
     * Devuelve una descripción con la información del cliente,
     * incluyendo su nombre y número de teléfono.
     *
     * @return información del cliente
     */
    public String mostrarInformacion() {
        return "Cliente: " + nombre + ". Teléfono: " + telefono;
    }
}