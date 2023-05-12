/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Cadena {
    private String frase;
    private int longitud;
    
    // Constructores 

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    // Getters

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    // Setters 

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
}
