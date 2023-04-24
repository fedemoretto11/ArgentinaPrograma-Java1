/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3.pkg4.y.pkg5;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class While {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Su nota no es correcta, ingrese otra");
            nota = leer.nextInt();
        }
        System.out.println("Nota correcta, su nota es: " + nota);
    }
}
