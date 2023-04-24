/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        if (letra.toLowerCase().equals("a") || 
            letra.toLowerCase().equals("e") || 
            letra.toLowerCase().equals("i") || 
            letra.toLowerCase().equals("o") || 
            letra.toLowerCase().equals("u")) {
            System.out.println("La letra ingresada es una vocal!");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        } 
        
    }
}
