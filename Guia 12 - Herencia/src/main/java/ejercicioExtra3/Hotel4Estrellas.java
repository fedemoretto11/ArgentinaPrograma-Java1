package ejercicioExtra3;

public class Hotel4Estrellas extends Hotel {

    protected Character gimnasio;
    protected String nombreRestaurant;
    protected Integer capacidadRestaurant;

    // Constructores

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(Character gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        calcularPrecio();
    }

    
    
    
    
    // Getter and Setter

    public Character getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nGimnasio: " + gimnasio + " // Nombre Restaurant: " + nombreRestaurant + " // Capacidad Restaurant: " + capacidadRestaurant;
    }
    
    

    // Metodos
    

    @Override
    protected void calcularPrecio() {
        Double restaurant;
        Double gym;
        if (capacidadRestaurant < 30) {
            restaurant = 10.0;
        } else if (capacidadRestaurant >= 30 && capacidadRestaurant <= 50){
            restaurant = 30.0;
        } else {
            restaurant = 50.0;
        }
    
        if (gimnasio == 'A' || gimnasio == 'a') {
            gym = 50.0;
        } else {
            gym = 30.0;
        }
         
        setPrecioHabitaciones(getPrecioHabitaciones() + restaurant + gym);
    }
}
