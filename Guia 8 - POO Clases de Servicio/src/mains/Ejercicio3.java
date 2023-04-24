/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Persona2;
import java.util.Scanner;
import servicio.Persona2Servicio;

/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Persona2Servicio ps = new Persona2Servicio();
        int[] imc = new int[4];
        boolean[] edades = new boolean[4];
        Persona2[] persona = new Persona2[4];
        
        
//        Asi los crea el usuario
//        persona[0] = ps.crearPersona();
//        persona[1] = ps.crearPersona();
//        persona[2] = ps.crearPersona();
//        persona[3] = ps.crearPersona();
//        
//        Creados de forma genericas para pruebas
        persona[0] = new Persona2("Fede", 28, 'H', 68, 178);
        persona[1] = new Persona2("Mery", 22, 'M', 59, 165);
        persona[2] = new Persona2("Robert", 12, 'H', 145, 143);
        persona[3] = new Persona2("Peter", 49, 'H', 60, 198);
        
        llenadoIMC(ps,imc,persona);
        menu(persona, ps, eleccionPersona(), imc);
    }
    
    
    public static void menu(Persona2[] persona, Persona2Servicio ps, int personaSeleccionada, int[] imc) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("-----MENU PRINCIPAL-----");
        System.out.println("1. Consultar Datos");
        System.out.println("2. Calcular IMC");
        System.out.println("3. Es mayor de Edad?");
        System.out.println("4. Elegir otra persona");
        System.out.println("5. Ver porcentajes de IMC");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
        opcion = sc.nextInt();
        System.out.println("");

        switch(opcion) {
            case 1:
               ps.mostrarDatos(persona[personaSeleccionada]);
               break;
            case 2:
               System.out.println("IMC de la persona (-1 debajo del peso / 0 normopeso / 1 sobrepeso): " + ps.calcularIMC(persona[personaSeleccionada]));
               break;
            case 3:                    
               System.out.println("Es mayor de edad? " + ps.esMayorDeEdad(persona[personaSeleccionada]));
               break;
            case 4:
               int nuevaSeleccion = eleccionPersona();
               if (nuevaSeleccion >= 0 && nuevaSeleccion < persona.length) {
                   personaSeleccionada = nuevaSeleccion;
                   menu(persona, ps, personaSeleccionada,imc);
               } else {
                   System.out.println("Selección inválida.");
               }
               break;
            case 5:
                porcentajeIMC(imc);
                break;
            case 6:
                System.out.println("Muchas gracias!");
                System.out.println("Hasta luego!");
                break;
            default:
               System.out.println("Opción inválida");
               break;
       }

       System.out.println();
    } while (opcion != 6);
}

    public static void llenadoIMC(Persona2Servicio ps, int[] imc, Persona2[] persona){
        imc[0] = ps.calcularIMC(persona[0]);
        imc[1] = ps.calcularIMC(persona[1]);
        imc[2] = ps.calcularIMC(persona[2]);
        imc[3] = ps.calcularIMC(persona[3]); 
    }
    
    public static void porcentajeIMC(int[] imc) {
        double alto = 0;
        double normal = 0;
        double bajo = 0;
        for (int i = 0; i < imc.length; i++) {
            System.out.println(imc[i]);
            if(imc[i] == 1){
                alto++;
            } else if (imc[i] == 0) {
                normal++;
            } else {
                bajo++;
            }
        }
        
        System.out.println("El " + (alto / 4) * 100 + "% de las personas son obesas");
        System.out.println("El " + normal / 4 * 100 + "% de las personas son normalitas");
        System.out.println("El " + bajo / 4 * 100 + "% de las personas son flacuchas");

    }
    
    public static void llenadoEdades(Persona2Servicio ps, boolean[] edades, Persona2[] persona){
        edades[0] = ps.esMayorDeEdad(persona[0]);
        edades[1] = ps.esMayorDeEdad(persona[1]);
        edades[2] = ps.esMayorDeEdad(persona[2]);
        edades[3] = ps.esMayorDeEdad(persona[3]); 
    }
    
    public static int eleccionPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una persona: ");
        int opcion = sc.nextInt();
        return opcion - 1;
    
    }
    
    
    
    
    
}
 
