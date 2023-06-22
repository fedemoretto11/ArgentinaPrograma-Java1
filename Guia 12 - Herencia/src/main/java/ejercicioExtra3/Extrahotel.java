package ejercicioExtra3;

public abstract class Extrahotel extends Alojamiento {

    protected Boolean privado;
    protected Integer metrosCuadrados;

    
    // Constructores
    
    public Extrahotel() {
    }

    public Extrahotel(Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    // Getters and Setters 

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nPrivado: " + privado + " // Metros Cuadrados: " + metrosCuadrados;
    }
    
    
    
}
