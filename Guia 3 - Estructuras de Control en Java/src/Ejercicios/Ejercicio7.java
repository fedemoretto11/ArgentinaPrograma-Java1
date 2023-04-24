/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String secuenciaFinal = "&&&&&";
        
        String ingreso;
        int correcto = 0;
        int incorrecto = 0;

        
        do {
            System.out.println("Ingrese una palabra: ");
            ingreso = leer.nextLine().toUpperCase();
            String lastCaracter = ingreso.substring(ingreso.length() - 1, ingreso.length());
            
            if (ingreso.length() == 5) {
                if (ingreso.substring(0,1).equals("X") && lastCaracter.equals("O")) {
                    correcto++;
                    System.out.println("Palabra ingresada correctamente");
                } else {
                    incorrecto++;
                    System.out.println("Palabra con caracteres incorrectos");
                }
            } else {
                incorrecto++;
                System.out.println("Palabra sin la longitud requerida");               
            }
            
            
        } while ( ingreso.equals(secuenciaFinal) == false );
        
        System.out.println("********************");
        System.out.println("Usted realizo " + correcto + " lecturas correctas");
        System.out.println("Usted realizo " + incorrecto + " lecturas incorrectas");
        System.out.println("********************");


        
    }
    
}
