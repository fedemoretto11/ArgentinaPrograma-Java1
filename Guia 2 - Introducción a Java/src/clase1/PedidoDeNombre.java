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

public class PedidoDeNombre {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre por favor: ");
        nombre = leer.next();
        System.out.println("Hola " + nombre);

        
    }
}
