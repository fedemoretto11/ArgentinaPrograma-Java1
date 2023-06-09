/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author fedmo
 */
public class Perro {
    private String raza;
    
    // Constructores

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    
    // Getters
    
    public String getRaza() {
        return raza;
    }

    
    // Setters
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public static Comparator<Perro> compararRaza = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2){
            return p1.getRaza().compareTo(p2.getRaza());
        }
    };
    
}
