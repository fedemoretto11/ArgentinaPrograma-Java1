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
public class Ejercicio13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la altura de la escalera: ");
      int altura = sc.nextInt();

      for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + "");
        }
        System.out.println();
    }
  }
}
