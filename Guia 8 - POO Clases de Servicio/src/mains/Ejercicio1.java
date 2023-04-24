/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;

/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = cbs.crearCuenta(); 
            
        menu(cuenta1, cbs);
        
    }
    
  
    
    
    public static void menu(CuentaBancaria cuenta, CuentaBancariaServicio cbs) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-----MENU PRINCIPAL-----");
            System.out.println("1. Consultar Datos");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. ingresarDinero");
            System.out.println("4. retirarDinero");
            System.out.println("5. extraccionRapida");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            System.out.println("");


            switch(opcion) {
                case 1:
                   cbs.consultarDatos(cuenta);
                   break;
                case 2:
                   cbs.consultarSaldo(cuenta);
                   break;
                case 3:
                   cbs.ingresarDinero(cuenta);
                   break;
                case 4:
                   cbs.retirarDinero(cuenta);
                   break;
                case 5:
                    cbs.extraccionRapida(cuenta);
                    break;
                case 6:
                    System.out.println("Muchas gracias!");
                    System.out.println("Hasta luego!");
                    break;
                default:
                   System.out.println("Opción inválida");
                   break;
           }

           System.out.println();
        } while (opcion != 6);

    }
}
