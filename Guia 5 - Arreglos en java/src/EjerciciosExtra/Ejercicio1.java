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
public class Ejercicio1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Determine el tamaño del vector: ");
      int n = sc.nextInt();
      int[] numeros = new int[n];
      int suma = 0;
      
      for (int i = 0; i < numeros.length; i++) {
        System.out.println("Ingrese un numeros: ");
        numeros[i] = sc.nextInt();
      }

      for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
      }

      System.out.println("La suma total de los numeros ingresados es: " + suma);
      sc.close();
    }
}
