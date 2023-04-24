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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();

        
        
        while (frase.length() != 8) {
            
            if (frase.length() != 8) {
                System.out.println("Frase con longitud INCORRECTA");
            } else {
                System.out.println("Frase con longitud CORRECTA");
                break;
            
            }
            System.out.println("Ingrese una nueva frase: ");
            frase = leer.nextLine();
        }
        
        
    }
}
