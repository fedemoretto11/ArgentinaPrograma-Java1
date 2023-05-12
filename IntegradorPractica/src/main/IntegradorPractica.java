package main;

import entidades.Estudiantes;
import java.util.Scanner;
import services.EstudiantesService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fedmo
 */
public class IntegradorPractica {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes[] alumnos = new Estudiantes[2];
        EstudiantesService preceptoria = new EstudiantesService();
        
        menu(preceptoria, alumnos);
        
        
    }
    
    
    
    // Menu para tener todo mas organizado
    
    public static void menu(EstudiantesService preceptoria, Estudiantes[] alumnos){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        

        
        while (menu){
            System.out.println("===== MENU =====");
            System.out.println("1. Cargar alumno");
            System.out.println("2. Ver alumnos");
            System.out.println("3. Ver promedio");
            System.out.println("4. Ver notas mayores al promedio");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    preceptoria.cargarAlumnos(alumnos);
                    break;
                case 2:
                    preceptoria.imprimirNotas(alumnos);
                    break;
                case 3:
                    System.out.println("El promedio de las notas es: " + preceptoria.promedio(alumnos));
                    break;
                case 4:
                    System.out.println("----- Notas mayores al promedio -----");
                    preceptoria.imprimirNotas(preceptoria.mayorPromedio(alumnos));
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    System.out.println("Gracias por utilizar notitas para todes xD");
                    menu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
    
}
