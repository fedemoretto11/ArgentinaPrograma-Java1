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
public class Ejercicio14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hijos = 0;
      int edades = 0;

      System.out.println("Cuantas familias hay? ");
      int familias = sc.nextInt();

      for (int i = 0; i < familias; i++) {
        System.out.println("Ingrese la cantidad de hijos por familia: ");
        int hijosPorFamilia = sc.nextInt();
        
        for (int j = 0; j < hijosPorFamilia; j++) {
          System.out.println("Ingrese la edad del hijo/a: ");
          int edad = sc.nextInt();
          edades += edad;
          hijos++;
        }
      }

      double promedioEdad = edades / hijos;
      System.out.println("La edad promedio de todas las familias es de: " + promedioEdad);
    }
}
