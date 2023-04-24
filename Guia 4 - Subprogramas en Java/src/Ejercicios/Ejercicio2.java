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
public class Ejercicio2 {
    public static void main(String[] args) {
        Boolean salir = false;
        while (salir == false) {
            
            String nombre = imprimirNombre();
            int años = edad();
            System.out.println("--------------------");
            System.out.println("La persona ingresada se llama " + nombre + ".");
            System.out.println("La edad de " + nombre + " es " + años + " años.");
            System.out.println(nombre + " es " + mayorMenor(años) + " de edad.");
            System.out.println("--------------------");
            salir = salir();
            mensajeSalida(salir);
        }
    }

    public static String imprimirNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        sc.close();
        return nombre;
    }

    public static int edad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.close();
        return edad;
        
    }

    public static String mayorMenor(int edad) {
        return edad > 18 ? "mayor" : "menor";
        
    }

    public static Boolean salir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea salir: (s/n)");
        String salida = sc.nextLine().toLowerCase();
        sc.close();
        return salida.equals("s") ? true : false;
    }

    public static void mensajeSalida(boolean salir) {
        if (salir == true) {
            System.out.println("Saliendo del sistema...");
        }
    };



}
