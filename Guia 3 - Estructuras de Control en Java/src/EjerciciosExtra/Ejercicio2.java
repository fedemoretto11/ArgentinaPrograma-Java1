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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int auxiliar;
        System.out.println("Ingrese un valor para A: ");
        int A = leer.nextInt();
        System.out.println("Ingrese un valor para B: ");
        int B = leer.nextInt();
        System.out.println("Ingrese un valor para C: ");
        int C = leer.nextInt();
        System.out.println("Ingrese un valor para D: ");
        int D = leer.nextInt();
        
        System.out.println("*************");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("*************");
        
        auxiliar = A;
        A = D;
        D = B;
        B = C;
        C = auxiliar;
        
        System.out.println("*************");
        System.out.println("Nuevas asignaciones");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("*************");
    }
}
