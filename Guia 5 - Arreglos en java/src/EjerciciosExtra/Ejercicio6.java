/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    int contador = 0;
    String[][] sopa = new String[20][20];
    sopa = llenadoMatriz(sopa);
    impresionMatriz(sopa);


    int randomI = 0;
    int anteriorI = 0;
    while (contador < 5) {
      Random random = new Random();

      String nombre = ingresoPalabra();
      System.out.println(nombre);
      contador++;

      if (randomI == anteriorI) {
        randomI = random.nextInt(20 - nombre.length());
      }
      int randomJ = random.nextInt(20 - nombre.length());
      
      int count = 0;
      for (int j = 0; j < nombre.length(); j++) {
        sopa[randomI][randomJ + j] = nombre.substring(count, count + 1);
        count++;
      }
      anteriorI = randomI;
    }


    impresionMatriz(sopa);
  }



  public static String ingresoPalabra(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese una palabra: ");
    String rta = "";

    String palabra = sc.nextLine();

    while (palabra.length() < 3 || palabra.length() > 5) {
      rta = palabra.length() < 3 ? "Palabra demasiado corta, ingrese otra" : "Palabra demasiado larga, ingrese otra";
      System.out.println(rta);

  

      palabra = sc.nextLine();
    }
    
    return palabra;
  }


  public static String[][] llenadoMatriz(String[][] matriz) {
    Random random = new Random();
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = String.valueOf(random.nextInt(10));
      }
    }
    return matriz;
  }

  public static void impresionMatriz(String[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
          System.out.print("[" + matriz[i][j] + "] ");
      }
      System.out.println();
    }
  }
}


