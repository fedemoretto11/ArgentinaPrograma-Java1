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
public class Persona2 {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private int altura;
    
    
    // Constructores

    public Persona2() {
    }

    public Persona2(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    
    // Getters 

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }
    
    
    // Setters 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
}
