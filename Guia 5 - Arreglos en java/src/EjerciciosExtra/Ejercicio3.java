/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el largo del vector: ");
    int n = sc.nextInt();
    sc.close();

    int[] arreglo = new int[n];

    arreglo = llenadoVector(arreglo);

    impresionVector(arreglo);
    System.out.println();
    System.out.println("-----");
    impresionVectorJunto(arreglo);
  }    

  public static int[] llenadoVector(int[] vector) {
    Random random = new Random();
    for (int i = 0; i < vector.length; i++) {
      vector[i] = random.nextInt(10);
    }
    return vector;
  }

  // Impresion uno por uno
  public static void impresionVector(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
      System.out.print("[" + vector[i] + "]");
    }
  }

  // Impresion todo arreay de una
  public static void impresionVectorJunto(int[] vector) {
    System.out.println(Arrays.toString(vector));
  }
}
