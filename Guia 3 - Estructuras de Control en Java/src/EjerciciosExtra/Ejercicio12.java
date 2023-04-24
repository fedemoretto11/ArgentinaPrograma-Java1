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
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i <= 999; i++) {
      String numStr = String.format("%03d", i); 
      numStr = numStr.replace("3", "E"); 
      System.out.println(numStr); 
    }
  
  

    
  }
}

