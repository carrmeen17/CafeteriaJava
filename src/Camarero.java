/**
 * Representa a un camarero de la empresa.
 *
 * @author Carmen
 * @version 1.0
 */
public class Camarero {

    // Constructores

    /**
     * Crea un nuevo camarero con un nombre y un código de empleado.
     *
     * @param nombre nombre del camarero
     * @param codigoEmpleado código identificativo del empleado
     */
    public Camarero(String nombre, int codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    // Atributos de la clase camarero

    private String nombre;
    private int codigoEmpleado;

    // Getters y Setters

    /**
     * Devuelve el nombre del camarero.
     *
     * @return nombre del camarero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del camarero.
     *
     * @param nombre nuevo nombre del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código del empleado.
     *
     * @return código identificativo del empleado
     */
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Modifica el código del empleado.
     *
     * @param codigoEmpleado nuevo código del empleado
     */
    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    // Métodos

    /**
     * Devuelve una descripción con la información del camarero,
     * incluyendo su nombre y código de empleado.
     *
     * @return información del camarero
     */
    public String mostrarInformacion() {
        return "Camarero: " + nombre + ". Código Empleado: " + codigoEmpleado;
    }
}