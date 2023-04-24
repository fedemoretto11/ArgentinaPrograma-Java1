/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
      int numeros[] = new int[100];
      for(int i = numeros.length - 1; i >= 0; i--) {
        numeros[i] = i + 1;
        System.out.print("[" + numeros[i] + "]");
      }
    }
}
