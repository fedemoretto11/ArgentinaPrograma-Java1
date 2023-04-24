/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();

      System.out.println("Ingrese el tamaño de los vectores: ");
      int n = sc.nextInt();
      sc.close();

      int[] vector1 = new int[n];
      int[] vector2 = new int[n];
      for (int i = 0; i < vector2.length; i++) {
        vector1[i] = random.nextInt(2);
        vector2[i] = random.nextInt(2);
      }

      for (int i = 0; i < vector2.length; i++) {
        if (vector1[i] != vector2[i]) {
          System.out.println("La diferencia denumeros se encuentras en la posicion: " + i);
          break;
      }
    }
  }
}
