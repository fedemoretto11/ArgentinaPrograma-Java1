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
public class For {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        
        System.out.print(num);
        System.out.print("");
        for (int i = 0; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
       
        
 
    }
}
