/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Ejercicio2Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Ejercicio2Jugador() {
    }

    public Ejercicio2Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    // Metodos
    
    public void disparo(Ejercicio2RevolverDeAgua r){
        if(r.mojar()){
            setMojado(true);
            
        } else {
            setMojado(false);
            r.siguienteChorro();
        }
    }
    
    
}
