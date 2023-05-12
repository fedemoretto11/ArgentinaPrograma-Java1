/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Persona;
import servicio.PersonaService;

/**
 *
 * @author fedmo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        PersonaService anses = new PersonaService();
        Persona persona1 = anses.crearPersona();
        anses.calcularEdad(persona1);
        anses.mostrarPersona(persona1);



        
        
//        System.out.println("Fecha de nacimiento: " + persona1.getFechaDeNacimiento().getDate() + "/" + (persona1.getFechaDeNacimiento().getMonth() + 1) + "/" + persona1.getFechaDeNacimiento().getYear());

    }
}
