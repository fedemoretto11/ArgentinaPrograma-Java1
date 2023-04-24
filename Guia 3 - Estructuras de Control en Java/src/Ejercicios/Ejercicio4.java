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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String primerLetra = frase.substring(0,1);
        
        if (primerLetra.toLowerCase().equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }  
}
