package ejercicioExtra3;

public class Camping extends Extrahotel {

    protected Integer capacidadMaxCarpas;
    protected Integer capacidadBanios;
    protected Boolean restaurant;
    
    
    // Constructores

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer capacidadBanios, Boolean restaurant, Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.capacidadBanios = capacidadBanios;
        this.restaurant = restaurant;
    }

    
    // Getters and Setters
    
    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCapacidadBanios() {
        return capacidadBanios;
    }

    public void setCapacidadBanios(Integer capacidadBanios) {
        this.capacidadBanios = capacidadBanios;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad Max Carpas: " + capacidadMaxCarpas + " // CapacidadBanios: " + capacidadBanios + " // Restaurant: " + restaurant;
    }

    
}
