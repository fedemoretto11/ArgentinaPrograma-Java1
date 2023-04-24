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
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el monto a convertir: ");
    double monto = sc.nextDouble();
    sc.nextLine();
    System.out.println("Ingrese la moneda a la cual desea convertir (libra/dolar/yen): ");
    String moneda = sc.nextLine();
    System.out.println(moneda);
    sc.close();
    conversorDeMoneda(monto, moneda);
    
  }
    


  public static void conversorDeMoneda(double monto, String moneda) {
    double resultado;
    switch(moneda) {
      case "libra":
        resultado = monto * 0.86;
        System.out.println("El monto ingresado equivale a " + resultado + " libras.");
        break;
      case "dolar":
        resultado = monto * 1.28611;
        System.out.println("El monto ingresado equivale a " + resultado + " dolares.");
        break;
      case "yen":
        resultado = monto * 129.852;
        System.out.println("El monto ingresado equivale a " + resultado + " yuanes.");
        break;
    }
  }
}
