/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Extra2Cine {
    private String[][] sala = new String[6][8];
    private String pelicula;
    private Integer precio;
    
    // Constructor

    public Extra2Cine() {
    }

    public Extra2Cine(String pelicula, Integer precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }
    
    // Getters and Setters

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Extra2Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }
    
    
}
