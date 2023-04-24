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
public class Ejercicio2 {
    public static void main(String[] args) {
      int[] resultado = generarVector();
      System.out.println(Arrays.toString(resultado));

      busquedaNumero(resultado);
      
      
    }

    public static int[] generarVector() {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      System.out.println("Ingrese un numero para determinar la cantidad de numero que se generaran: ");
      int size = sc.nextInt();
      int[] numeros = new int[size];

      for (int i = 0; i < numeros.length; i++) {
        numeros[i] = random.nextInt(11);
      }
      return numeros;
    }

    public static void busquedaNumero(int[] vector) {
      Scanner sc = new Scanner(System.in);
      int repetido = 0;
      int posicion = 0;

      System.out.println("Ingrese un numero a buscar: ");
      int num = sc.nextInt();

      for (int i = 0; i < vector.length; i++) {
        if (vector[i] == num) {
          repetido++;
          posicion = i;
        }
      }
      
      if(repetido == 0) {
        System.out.println("El numero no se ha encontrado");
      } 
      else if (repetido == 1) {
        System.out.println("El numero se ha encontrado 1 vez en la posicion " + posicion);
      } else {
        System.out.println("En numero se ha encontrado " + repetido + " veces en las posiciones " + posicion);
      }
      sc.close();
    }
}
