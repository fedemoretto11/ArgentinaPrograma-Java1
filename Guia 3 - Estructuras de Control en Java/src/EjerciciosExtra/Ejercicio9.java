/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;
import java.time.format.SignStyle;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

      System.out.println("Ingrese el dividendo: ");
      int dividendo = leer.nextInt();

      System.out.println("Ingrese el divisor: ");
      int divisor = leer.nextInt();

      int cociente = 0;

      while (dividendo >= divisor) {
        dividendo -= divisor;
        cociente++;
      }
      
      System.out.println("El resultado es " + cociente);
      System.out.println("El resto es :" + dividendo);
    }
}
