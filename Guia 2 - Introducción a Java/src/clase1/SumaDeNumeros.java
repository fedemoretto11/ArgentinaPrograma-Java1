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

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        Integer numero2 = leer.nextInt();

        Integer resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);

    }
}
