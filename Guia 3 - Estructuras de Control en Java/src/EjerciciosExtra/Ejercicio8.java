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
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int par = 0;
      int inpar = 0;
      int total = 0;
      int ingreso = 1;
      int num;

      do {
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num > 0) {
          ingreso = num;
          par = num % 2 == 0 ? par++ : inpar++;
          total++;
        } else {
          System.out.println("Ingrese un numero correcto");
        }
      } while (ingreso % 5 != 0);

      System.out.println("Ingreso un total de " + total + " numeros");
      System.out.println(par + " son pares");
      System.out.println(inpar + " son impares");

    }
}
