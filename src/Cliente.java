public class Cliente {

// constructores
    public Cliente (String nombre, String telefono) {
        this.nombre=nombre;
        this.telefono=telefono;
    }

// atributos de la clase cliente
    private String nombre;
    private String telefono;

//Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

// métodos
    public String mostrarInformacion(){
        return "Cliente: " +nombre +". Teléfono: " +telefono;

    }
}
