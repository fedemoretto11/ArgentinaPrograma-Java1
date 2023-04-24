/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author fedmo
 */
import java.util.Scanner;

public class CalculoNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Double num = leer.nextDouble();
        Double doble = num * 2;
        Double triple = num * 3;
        Double raiz = Math.sqrt(num);
        System.out.println("El numero ingresado fue: " + num);
        System.out.println("El doble de ese numero es: " + doble);
        System.out.println("El triple de ese numero es: " + triple);
        System.out.println("La raiz cuadrada de ese numero es: " + raiz);

    }
}
