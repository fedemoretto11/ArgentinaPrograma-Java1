/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author fedmo
 */
import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");   
        String frase = leer.nextLine();
        frase.toLowerCase();
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
        System.out.println("Frase en matusculas: " + frase.toUpperCase());   
    }
}