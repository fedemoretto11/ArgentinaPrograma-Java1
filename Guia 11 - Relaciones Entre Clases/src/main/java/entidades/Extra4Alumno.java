/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Extra4Alumno {
    private String nombreCompleto;
    private Integer dni;
    private Integer cantidadVotos;
    
    
    // Constructores

    public Extra4Alumno() {
    }

    public Extra4Alumno(String nombreCompleto, Integer dni, Integer cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }
    
    
    // Getters and Setters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    
    // To String

    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto + " // DNI: " + dni + " // Cantidad de Votos: " + cantidadVotos;
    }
    
    
    
}
