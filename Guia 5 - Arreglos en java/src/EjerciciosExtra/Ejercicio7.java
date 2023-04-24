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
public class Ejercicio7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de numeros a mostrar de la sucesión de Fibonacci");
      int n = sc.nextInt();
      int[] vector = new int[n];
      vector = llenado(vector);
      
      for (int i = 0; i < vector.length; i++) {
        System.out.print("[" + vector[i] + "]");
      }
      sc.close();
    }

    public static int[] llenado(int[] vector) {
      vector[0] = 1;
      vector[1] = 1;
      for (int i = 2; i < vector.length; i++) {
        vector[i] = vector[i - 2] + vector[i - 1];
      }
      return vector;
    }

    
}
