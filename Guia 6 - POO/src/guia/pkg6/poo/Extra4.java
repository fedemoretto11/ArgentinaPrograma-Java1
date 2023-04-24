/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Extra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cuenta 1 con constructor con parametros pasados
        Cuenta cuenta1 = new Cuenta(15000, "Federico");
        cuenta1.retirar_dinero(cuenta1.getSaldo(), cuenta1.getTitular());
        
        
        
        // Cuenta 2 con constructor con parametros sin pasar
        Cuenta cuenta2 = new Cuenta();
        System.out.println("Ingrese el nombre del dueño de la cuenta: ");
        cuenta2.setTitular(sc.nextLine());
        System.out.println("Ingrese el monto que dispone la cuenta: ");
        cuenta2.setSaldo(sc.nextInt());
        

        cuenta2.retirar_dinero(cuenta2.getSaldo(), cuenta2.getTitular());

        
        
    }
}
