/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero para saber si es o no es primo: ");
      int num = sc.nextInt();
      boolean resultado = primo(num);
      System.out.println(resultado);
      sc.close();

    }

    public static boolean primo(int num) {
      int contador = 0;
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
          contador++;
        }
      }
      return contador > 2 ? false : true;
      
    }    
  }
  