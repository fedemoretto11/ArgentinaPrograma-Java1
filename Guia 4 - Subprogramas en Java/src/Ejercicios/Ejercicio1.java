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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir;
        salir = false;
        int num1 = 0;
        int num2 = 0;

        while (salir == false) {
            System.out.println("**************");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("**************");
        
        
            System.out.println("Elija una opcion: ");
            int opcion = sc.nextInt();

            if (opcion != 5) {
                System.out.println("Ingrese el primer numero: ");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = sc.nextInt();
            }

            switch (opcion) {
            case 1:
                int resultadoSuma = suma(num1, num2);
                System.out.println("La suma da como resultado: " + resultadoSuma);
                break;
            case 2:
                int resultadoResta = resta(num1, num2);
                System.out.println("La resta da como resultado: " + resultadoResta);
                break;
            case 3:
                int resultadoMultiplicacion = multiplicacion(num1, num2);
                System.out.println("La multiplicacion da como resultado: " + resultadoMultiplicacion);
                break;
            case 4:
                int resultadoDivision = division(num1, num2);
                System.out.println("La division da como resultado: " + resultadoDivision);
                break;
            case 5:
                System.out.println("Realmente desea salir?");
                String rta = sc.next();
                if (rta.toLowerCase().equals("s")) {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                }
            default:
                System.out.println("Ingrese una opcion correcta");
            }  
        }
        sc.close();      
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    } 
    
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}
