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
public class Nif {
    private long dni;
    private char letter;

    
    // Constructor
    
    public Nif() {
    }

    public Nif(long dni, char letter) {
        this.dni = dni;
        this.letter = letter;
    }
    
    
    // Getter

    public long getDni() {
        return dni;
    }

    public char getLetter() {
        return letter;
    }
    
    
    // Setters 

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

}
