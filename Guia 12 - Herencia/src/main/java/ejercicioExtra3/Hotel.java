package ejercicioExtra3;

public abstract class Hotel extends Alojamiento {
    protected Integer cantidadDeHabitaciones;
    protected Integer numeroDeCamas;
    protected Integer cantidadDePisos;
    protected Double precioHabitaciones;
    
    
    // Constructores

    public Hotel() {

    }

    public Hotel(Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioHabitaciones = 50.0 + numeroDeCamas;
    }
    
    // Getters and Setters

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Integer getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(Integer numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nCantidad De Habitaciones: " + cantidadDeHabitaciones + " // Numero De Camas: " + numeroDeCamas + " // Cantidad De Pisos: " + cantidadDePisos + " // Precio Habitaciones: U$D" + precioHabitaciones;
    }
    
    
    // Metodos
    
    protected abstract void calcularPrecio();
}
