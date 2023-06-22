package ejercicioExtra3;

public class Residencia extends Extrahotel {

    protected Integer cantidadHabitaciones;
    protected Boolean descuentoGremios;
    protected Boolean campoDeportivo;
    
    // Constructores

    public Residencia() {
    }

    public Residencia(Integer cantidadHabitaciones, Boolean descuentoGremios, Boolean campoDeportivo, Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }
    
    
    // Getters and Setters

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Boolean getDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(Boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nCcantidadHabitaciones: " + cantidadHabitaciones + " // Descuento Gremios: " + descuentoGremios + " // Campo Deportivo: " + campoDeportivo;
    }
    
    
    // Metodos
    
}
