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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero que sera el valor limite positivo: ");
        int limite = leer.nextInt();
        int suma = 0; 
        while (suma < limite) {
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("Usted alcanzo el limite, la suma de sus numeros es de " + suma);   
    }
}
