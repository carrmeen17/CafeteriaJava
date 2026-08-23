public class Camarero {

    public Camarero(String nombre, int codigoEmpleado) {
        this.nombre=nombre;
        this.codigoEmpleado=codigoEmpleado;
    }

    String nombre;
    int codigoEmpleado;

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

    public String mostrarInformacion(){
        return "Camarero: " +nombre +". Código Empleado: " +codigoEmpleado;

    }
}
