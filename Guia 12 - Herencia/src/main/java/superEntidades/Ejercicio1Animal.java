/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superEntidades;

/**
 *
 * @author fedmo
 */
public class Ejercicio1Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Ejercicio1Animal() {
    }

    public Ejercicio1Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    
    public void alimentacion(){
        System.out.println(alimento);
    }
}
