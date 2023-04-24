/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros: ");
        int tamaño = sc.nextInt();
        sc.nextLine();
        String[] equipo = new String[tamaño];
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el nombre del compañero: ");
            equipo[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(equipo));
        sc.close();
    }
    
}
