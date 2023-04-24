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

public class CalculoF {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en °C PARA CONVERTIR A °F");
        Float celsius = leer.nextFloat();
        Float farenheit = 32 + (9 * celsius / 5);
        System.out.println("La temperatura en Farenheit es: " + farenheit);
    }
}
