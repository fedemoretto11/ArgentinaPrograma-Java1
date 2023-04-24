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
public class DoWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int num;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            
            if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            } else if (num < 0) {
                suma = suma;
            } else {
                suma = suma + num;
            }
            
            contador = contador + 1;
        } while (contador < 20);
        
        System.out.println("La suma de los numeros es: " + suma);
        
    }
}
