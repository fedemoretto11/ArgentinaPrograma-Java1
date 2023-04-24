/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
      int[] resultado = generarVector();
      System.out.println(Arrays.toString(resultado));
      digitos(resultado);

    }

    public static int[] generarVector() {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      System.out.println("Ingrese un numero para determinar la cantidad de numero que se generaran: ");
      int size = sc.nextInt();
      int[] numeros = new int[size];

      for (int i = 0; i < numeros.length; i++) {
        numeros[i] = random.nextInt(99999);
      }
      sc.close();
      return numeros;
    }

    public static void digitos(int[] vector) {
      int uno = 0;
      int dos = 0;
      int tres = 0;
      int cuatro = 0;
      int cinco = 0;
      for (int i = 0; i < vector.length; i++) {
        switch (String.valueOf(vector[i]).length()) {
          case 1:
            uno++;
            break;
          case 2:
            dos++;
            break;
          case 3:
            tres++;
            break;
          case 4:
            cuatro++;
            break;
          case 5:
            cinco++;
            break;
        }
      }

      System.out.println("De los numeros ingresados " + uno + " es de un digito, " + dos + " son de dos digitos "+tres+" de tres "+cuatro+" de cuatro y "+cinco+" de cinco digitos");

    
    }
}
