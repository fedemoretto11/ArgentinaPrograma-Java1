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
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int num = sc.nextInt();
    int digitos = 0;

    if (num == 0) {
        digitos = 1;
    } else {
        while (num > 0) {
            num = num / 10;
            digitos++;
        }
    }

    System.out.println("El número tiene " + digitos + " dígitos.");
  }
}
