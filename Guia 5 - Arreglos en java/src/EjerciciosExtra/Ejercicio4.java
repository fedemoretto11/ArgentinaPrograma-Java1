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
public class Ejercicio4 {

    public static void main(String[] args) {
      double[] notas = new double[10];
      int aprobado = 0;
      int desaprobado = 0;

      for (int i = 0; i < notas.length; i++) {
        System.out.println("Alumno: " + (i + 1));
        notas[i] = promedioAlumno();
        System.out.println(notas[i]);
        if (notas[i] >= 7) {
          aprobado++;
        } else { desaprobado++;}
      }
      
      System.out.println("***************");
      System.out.println("Han aprobado un total de " + aprobado + " alumnos y desaprobaron " + desaprobado + " alumnos");
      System.out.println("***************");

    }
    
    
    
    public static double promedioAlumno() {
      Scanner sc = new Scanner(System.in);
      double notas = 0;
      
      System.out.println("Ingrese la nota del primer trabajo practico: ");
      notas += (sc.nextDouble() * 0.1);
      
      System.out.println("Ingrese la nota del segundo trabajo practico: ");
      notas += (sc.nextDouble() * 0.15);
      
      System.out.println("Ingrese la nota del primer integrador: ");
      notas += (sc.nextDouble() * 0.25);
      
      System.out.println("Ingrese la nota del segundo integrador: ");
      notas += (sc.nextDouble() * 0.5);
      
      
      
      double promedio = notas / (1);
      
      return promedio;
    }
    
} 
