/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fedmo
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Ingrese el tamaño de la matriz: ");
    int n = sc.nextInt();
    int[][] matriz = new int[n][n];
    int sumaNumeros = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = random.nextInt(19);
        sumaNumeros += matriz[i][j];
      }
    }

    impresionMatriz(matriz);
    System.out.println("La suma de los numeros de la matriz es: " + sumaNumeros);
    sc.close();
  }

  public static void impresionMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
          System.out.print("[" + matriz[i][j] + "]");
      }
      System.out.println();
    }
  }
}
