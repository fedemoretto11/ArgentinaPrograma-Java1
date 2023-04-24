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
public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double altura;
    double alturaGeneral = 0;
    double alturaPetisos = 0;
    int cantidadGeneral = 0;
    int cantidadPetisos = 0;
    double promedioGeneral;
    double promedioPetisos;

    System.out.println("Ingrese la cantidad de personas a calcular: ");
    int cantidadAMedir = leer.nextInt();

    while (cantidadGeneral < cantidadAMedir) {
      System.out.println("Ingrese la altura: ");
      altura = leer.nextDouble();
      if (altura <= 1.6) {
        alturaGeneral = alturaGeneral + altura;
        alturaPetisos = alturaPetisos + altura;
        cantidadGeneral++;
        cantidadPetisos++;
      } else {
        alturaGeneral = alturaGeneral + altura;
        cantidadGeneral++;
      }
    }

    promedioGeneral = alturaGeneral / cantidadGeneral;
    promedioPetisos = alturaPetisos / cantidadPetisos;
    double redondeoGeneral = (double) Math.round(promedioGeneral * 100) / 100;
    double redondeoPetisos = (double) Math.round(promedioPetisos * 100) / 100;

    System.out.println("**********");
    System.out.println("Altura promedio total: " + redondeoGeneral);
    System.out.println("Altura promedio menor a 1.6 mts: " + redondeoPetisos);
    System.out.println("**********");



  }    
}
