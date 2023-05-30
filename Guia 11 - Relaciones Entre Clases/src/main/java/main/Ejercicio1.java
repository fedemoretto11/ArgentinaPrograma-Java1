/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Ejercicio1Perro;
import entidades.Ejercicio1Persona;

/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1Perro perro1 = new Ejercicio1Perro("Sombra", "Labrador", 12, "Grande");
        Ejercicio1Perro perro2 = new Ejercicio1Perro("Coco", "Corgui", 2, "Chico");
        
        Ejercicio1Persona persona1 = new Ejercicio1Persona("Federico", "Moretto", 28, 384378001, perro1);
        Ejercicio1Persona persona2 = new Ejercicio1Persona("Nicolas", "Moretto", 42, 184378001, perro2);
        
        System.out.println(persona1);
        System.out.println(persona2);



    }
}
