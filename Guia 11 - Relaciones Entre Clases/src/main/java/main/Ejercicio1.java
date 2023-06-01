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
        Ejercicio1Perro perrera = new Ejercicio1Perro();
        perrera.crearPerro("Sombra", "Labrador", 12, "Grande");
        perrera.crearPerro("Coco", "Corgui", 2, "Chico");
        perrera.crearPerro("Pepe", "Labrador", 4, "Grande");
        perrera.crearPerro("Felipe", "Galgo", 7, "Grande");
        perrera.crearPerro("Boldo", "Chihuahua", 1, "Chico");
        perrera.crearPerro("Nala", "Breton", 3, "Grande");
        perrera.crearPerro("Sasha", "Breton", 5, "Grande");
        perrera.crearPerro("Panda", "Perro", 1, "Chico");
        perrera.crearPerro("Cual", "Callejero", 8, "Grande");
        perrera.crearPerro("Filo", "Salchicha", 2, "Chico");
        
        Ejercicio1Persona persona1 = new Ejercicio1Persona("Federico", "Moretto", 28, 384378001);
        Ejercicio1Persona persona2 = new Ejercicio1Persona("Nicolas", "Moretto", 42, 184378001);
     


        persona1.adoptarPerro(perrera);
        persona2.adoptarPerro(perrera);

        perrera.mostarAdoptados();

        System.out.println(persona1);
        System.out.println(persona2);
        


    }
}
