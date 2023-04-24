/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author fedmo
 */
public class Rectangulo2 {
    private int base;
    private int altura;
    
    
    // Constructores

    public Rectangulo2(int lado1, int lado2) {
        this.base = lado1;
        this.altura = lado2;
    }

    public Rectangulo2() {
    }
    
    
    // Getters

    public int getLado1() {
        return base;
    }

    public int getLado2() {
        return altura;
    }
    
    
    // Setters

    public void setLado1(int lado1) {
        this.base = lado1;
    }

    public void setLado2(int lado2) {
        this.altura = lado2;
    }
    
    
    
    // Metodos
    
    public int calcular_area() {
        return base * altura;
    }
    
}
