/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio2Guia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero: ");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el segundo numero: ");
    int num2 = sc.nextInt();
    
    EsMultiplo(num1, num2);
    sc.close();
  }

  public static void EsMultiplo(int num1, int num2) {
    
    String frase = num1 % num2 == 0 ? "Es multiplo" : "No es multiplo";
    System.out.println(frase);
  
  }
}

