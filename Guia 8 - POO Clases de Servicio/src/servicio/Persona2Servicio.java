/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona2;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Persona2Servicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona2 crearPersona(){
        System.out.println("----- Clonation System // Crear persona -----");
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        char sexo;
        do {
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = sc.next().toUpperCase().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        
        System.out.println("Ingrese el peso: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la altura en cm: ");
        int altura = sc.nextInt();
        sc.nextLine();
   
        return new Persona2(nombre, edad, sexo, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona2 persona) {
        return persona.getEdad() >= 18;
    }
    
    public int calcularIMC(Persona2 persona) {
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        double indice = peso / Math.pow((altura / 100),2);
        if (indice < 20) {return -1;}
        else if (indice >= 20 && indice <= 25) {return 0;}
        else {return 1;}
    }
     
    public void mostrarDatos(Persona2 persona){
        System.out.println("----- DATOS DE LA PERSONA -----");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Altura: " + persona.getAltura());
        System.out.println("-------------------------------");
        System.out.println("");

        
    }
}
