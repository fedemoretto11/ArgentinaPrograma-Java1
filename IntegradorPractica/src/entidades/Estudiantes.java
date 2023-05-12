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
public class Estudiantes {
    private String nombre;
    private float nota;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }
    
    // Setters 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
