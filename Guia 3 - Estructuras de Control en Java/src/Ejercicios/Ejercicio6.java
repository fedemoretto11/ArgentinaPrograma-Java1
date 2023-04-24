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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir;
        salir = false;

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
            int opcion = leer.nextInt();

            switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                System.out.println("Realmente desea salir?");
                String rta = leer.next();
                if (rta.toLowerCase().equals("s")) {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                }
            default:
                System.out.println("Ingrese una opcion correcta");
            }  
        }      
    }

    public static void suma() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para sumar: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para sumar: ");
        int num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    private static void resta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para restar: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para restar: ");
        int num2 = leer.nextInt();
        
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para multiplicar: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para multiplicar: ");
        int num2 = leer.nextInt();
        
        int resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
    
    public static void dividir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para dividir: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para dividir: ");
        int num2 = leer.nextInt();
        
        int resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
    }
}
