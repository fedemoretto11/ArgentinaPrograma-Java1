/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;
import java.net.SocketTimeoutException;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su categoira: ");
        String categoria = leer.nextLine();
        System.out.println("Ingrese el monto a abonar: ");
        double monto = leer.nextDouble();
        double montoAbonar;

        switch (categoria.toUpperCase()) {
            case "A": 
                montoAbonar = monto - (monto * 0.5);
                System.out.println("Usted debera abonar la suma de: $" + montoAbonar);
                break;
            case "B": 
                montoAbonar = monto - (monto * 0.35);
                System.out.println("Usted debera abonar la suma de: $" + montoAbonar);
                break;
            case "C": 
                System.out.println("Usted debera abonar el 100%, la suma es de: $" + monto);
                break;
        }
    }
}
