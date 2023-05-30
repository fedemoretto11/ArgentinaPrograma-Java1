/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class JugadorJugador {
    private String nombre;
    private String apellido;
    private String posicion;
    private Integer numero;

    
// Constructores
    
    public JugadorJugador() {
    }

    public JugadorJugador(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    
// Getters
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public Integer getNumero() {
        return numero;
    }
    
// Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
    
    
}
