/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra2;

/**
 *
 * @author fedmo
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private Boolean techado;
    
    
    // Constructores

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }
    
    
    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return super.toString() + "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }
    
    
    
    
    
    
    
    
    
    // Metodos
    
    @Override
    public Integer calcularSuperficie() {
        return super.alto * super.ancho;
        
    }

    @Override
    public Integer calcularVolumen() {
        return super.alto * super.ancho * super.largo;
    }
    
    
}
