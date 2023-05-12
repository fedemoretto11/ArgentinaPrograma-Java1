/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class PersonaService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("-----Creador de personas-----");
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Dia: ");
        int dia = sc.nextInt();
        System.out.println("Mes: ");
        int mes = sc.nextInt();
        System.out.println("Año: ");
        int año = sc.nextInt();        
        Date fechaDeNacimiento = new Date(año - 1900, mes - 1, dia);
        return new Persona(nombre, fechaDeNacimiento);
    }
    
    public int calcularEdad(Persona persona){
        Date hoy = new Date();
        int edad = hoy.getYear() - persona.getFechaDeNacimiento().getYear();
        
        if (hoy.getMonth() - persona.getFechaDeNacimiento().getMonth() < 0){
            edad--;
        }
        else if (hoy.getMonth() - persona.getFechaDeNacimiento().getMonth() == 0 && hoy.getDate() - persona.getFechaDeNacimiento().getDate() < 0){
            edad--;
        }
        return edad;
    }
    
    public boolean menorQue(Persona persona/*, int edad*/){
        System.out.println("Ingrese la edad a comparar: ");
        int edad = sc.nextInt();
        return calcularEdad(persona) > edad;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("-----Informacion de la persona----");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaDeNacimiento().getDate() + "/" + (persona.getFechaDeNacimiento().getMonth() + 1) + "/" + persona.getFechaDeNacimiento().getYear());
        System.out.println("Edad: " + calcularEdad(persona));
        System.out.println("----------------------------------");

    }
    
}
