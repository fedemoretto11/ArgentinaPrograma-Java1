/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Random;

/**
 *
 * @author fedmo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
      Random random = new Random();

      int[][] matriz = new int[4][4];
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
          matriz[i][j] = random.nextInt(10);
        }
      }

      impresionMatriz(matriz);
      voltearMatriz(matriz);
      System.out.println("-----");
      impresionMatriz(matriz);
      
    }

    public static void impresionMatriz(int[][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println();
      }
    }

    public static void voltearMatriz(int[][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
          matriz[j][i] = matriz[i][j];
        }
      }
    }
}
