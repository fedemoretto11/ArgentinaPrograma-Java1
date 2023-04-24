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
      Scanner leer = new Scanner(System.in);
      int maximo = 0;
      int minimo = 9999;
      double promedio;
      int num;
      int sumaNumeros = 0;
      int cantidad = 0;
      System.out.println("Ingrese la cantidad de numeros: ");
      int numMax = leer.nextInt();

      while (cantidad < numMax) {
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        maximo = num > maximo ? num : maximo;
        minimo = num < minimo ? num : minimo;
        sumaNumeros = sumaNumeros + num;
        cantidad++;
      }


      // do {
      //   System.out.println("Ingrese un numero: ");
      //   num = leer.nextInt();
      //   maximo = num > maximo ? num : maximo;
      //   minimo = num < minimo ? num : minimo;
      //   sumaNumeros = sumaNumeros + num;
      //   cantidad++;
      // } while (cantidad < numMax);

      promedio = sumaNumeros / cantidad;
      System.out.println("Maximo: " + maximo);
      System.out.println("Minimo: " + minimo);
      System.out.println("Promedio: " + promedio);


    }
}
