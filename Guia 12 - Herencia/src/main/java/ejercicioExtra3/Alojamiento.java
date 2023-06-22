package ejercicioExtra3;

public abstract class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    
    // Constructores
    
    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    
    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return "Alojamiento: \nNombre: " + nombre + " // Direccion: " + direccion + " // Localidad: " + localidad + " // Gerente: " + gerente;
    }
    
    
    // Metodos
    
    
    
}
