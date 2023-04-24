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
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    String aviso;
    int num1 = (int) (Math.random() * 11);
    int num2 = (int) (Math.random() * 11);
    int resultado = num1 * num2;
    

    do {
      System.out.println("Ingrese un resultado: ");
      num = sc.nextInt();
      aviso = num < resultado ? "Demasiado Bajo" : 
              num > resultado ? "Demasiado Alto" : "CORRECTO!! El resultado es: " + resultado;
      System.out.println(aviso);
    } while (num != resultado);
  }

}
