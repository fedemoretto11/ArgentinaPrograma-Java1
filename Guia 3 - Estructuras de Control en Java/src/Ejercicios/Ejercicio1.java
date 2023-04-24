package Ejercicios;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es par o impar: ");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
        
    }
}
