package ejercicioExtra3;

public final class Hotel5Estrellas extends Hotel4Estrellas {

    private Integer cantidadSalonesConf;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;
    
    
    // Constructores
    
    
    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantidadSalonesConf, Integer cantidadSuites, Integer cantidadLimosinas, Character gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        calcularPrecio();
    }

    
    
    
    // Getters and Setters

    public Integer getCantidadSalonesConf() {
        return cantidadSalonesConf;
    }

    public void setCantidadSalonesConf(Integer cantidadSalonesConf) {
        this.cantidadSalonesConf = cantidadSalonesConf;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nCantidad Salones Conf: " + cantidadSalonesConf + " // Cantidad Suites: " + cantidadSuites + " // Cantidad Limosinas: " + cantidadLimosinas;
    }
    
    
    // Metodos
    
    @Override
    protected void calcularPrecio() {
        if ( cantidadLimosinas != null){
            super.calcularPrecio();
            Double limo = (Double) (15.0 * this.cantidadLimosinas.doubleValue());
            setPrecioHabitaciones(getPrecioHabitaciones() + limo);
        }
    }
}

