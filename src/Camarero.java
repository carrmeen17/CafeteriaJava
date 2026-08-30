public class Camarero {

// constructores
    public Camarero(String nombre, int codigoEmpleado) {
        this.nombre=nombre;
        this.codigoEmpleado=codigoEmpleado;
    }

// atributos de la clase camarero
    private String nombre;
    private int codigoEmpleado;

//Getters y Setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getCodigoEmpleado() {

        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {

        this.codigoEmpleado = codigoEmpleado;
    }

// métodos
    public String mostrarInformacion(){
        return "Camarero: " +nombre +". Código Empleado: " +codigoEmpleado;

    }
}
