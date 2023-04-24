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
public class Switch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de bomba a comprobar");                
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor) {
            case 1:
                System.out.println("Es una bomba de agua");
                break;
            case 2: 
                System.out.println("Es una bomba de gasolina");
                break;
            case 3:
                System.out.println("Es una bomba de hormigon");
                break;
            case 4:
                System.out.println("Es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
    }
    }
}
