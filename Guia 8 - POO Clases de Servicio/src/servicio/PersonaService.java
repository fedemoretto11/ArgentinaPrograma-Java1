/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class PersonaService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        System.out.println("Ingresar nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingresar apellido: ");
        String apellido = sc.nextLine();
        
        System.out.println("Ingresar edad: ");
        int edad = sc.nextInt();
        
        return new Persona(nombre, apellido, edad);
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
    }
    
  
}
