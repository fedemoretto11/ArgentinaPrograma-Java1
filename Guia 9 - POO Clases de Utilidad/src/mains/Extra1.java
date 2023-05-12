/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int indice = rand.nextInt(12);
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo","junio","julio","agosto","septiembre","octubre","noviembre", "diciembre"};
        String mesSecreto = mes[indice];
        
        System.out.println("Ingrese un mes a adivinar: ");
        String mesAdivinar = sc.nextLine().toLowerCase();
        
        while (!mesAdivinar.equals(mesSecreto)) {
            System.out.println("Mes incorrecto ingrese nuevamente: ");
            mesAdivinar = sc.nextLine().toLowerCase();
        }
        System.out.println("A adivinado correctamente el mes! El mes fue: " + mesSecreto);
        
        
        
        
        
        
    }
}
