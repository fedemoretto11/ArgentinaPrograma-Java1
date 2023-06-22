/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Extra2Espectador {
    private String nombre;
    private Integer edad;
    private Double dinero;
    
    // Constructores

    public Extra2Espectador() {
    }

    public Extra2Espectador(String nombre, Integer edad, Double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    // Getter and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    
    // To String

    @Override
    public String toString() {
        return "Extra2Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
}
