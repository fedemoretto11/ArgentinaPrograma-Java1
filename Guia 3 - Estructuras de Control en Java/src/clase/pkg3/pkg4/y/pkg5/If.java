/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3.pkg4.y.pkg5;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        
        if (num1 > 25) {
            System.out.println("El numero ingresado es mayor a 25");
        } 
        else if (num1 == 25) {
            System.out.println("El numero ingresado es 25");
        }
        else {
            System.out.println("El numero ingresado es menor a 25");
        }
      
    }
   
}
