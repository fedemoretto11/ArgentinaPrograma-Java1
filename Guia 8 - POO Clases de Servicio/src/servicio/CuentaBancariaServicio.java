/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class CuentaBancariaServicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta() {
        System.out.println("-----CREACION DE CUENTA-----");
        System.out.println("Ingresar numeroCuenta: ");
        int numeroCuenta = sc.nextInt();
        
        System.out.println("Ingresar dniCliente: ");
        long dniCliente = sc.nextLong();
        
        System.out.println("Ingresar saldoActual: ");
        int saldoActual = sc.nextInt();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("-----DATOS DE CUENTA-----");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo Actual: $" + cuenta.getSaldoActual());
        System.out.println("-------------------------");
        System.out.println("");


    }
    
    public void ingresarDinero(CuentaBancaria cuenta){
        System.out.println("-----INGRESO DE DINERO-----");
        System.out.println("Ingrese el monto a agregar a su cuenta: ");
        int saldo = cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldo += sc.nextInt());
        System.out.println("");
    }
    
    public void retirarDinero(CuentaBancaria cuenta) {
        System.out.println("-----RETIRO DE DINERO-----");
        System.out.println("Ingrese el monto a retirar: ");
        int montoRetirar = sc.nextInt();
        if (cuenta.getSaldoActual() - montoRetirar >= 0) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - montoRetirar);
            System.out.println("Retiro de $" + montoRetirar + " realizado satisfactoriamente");
            System.out.println("Saldo restante: $" + cuenta.getSaldoActual());
        } else {
            System.out.println("Usted no dispone de fondos suficientes");
            System.out.println("Su saldo es: $" + cuenta.getSaldoActual());
        }
        System.out.println("");
    }
    
    public void extraccionRapida(CuentaBancaria cuenta) {
        int veintePorciento = (int) Math.round(cuenta.getSaldoActual() * 0.2);
        System.out.println("-----EXTRACCION RAPIDA-----");
        if (veintePorciento >= 0) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - veintePorciento);
            System.out.println("Retiro de $" + veintePorciento + " realizado satisfactoriamente");
            System.out.println("Saldo restante: $" + cuenta.getSaldoActual());
        } else {
            System.out.println("Usted no dispone de fondos suficientes");
            System.out.println("Su saldo es: $" + cuenta.getSaldoActual());
        }
        System.out.println("");
    }
    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("-----CONSULTA DE SALDO-----");
        System.out.println("Saldo Actual: $" + cuenta.getSaldoActual());
        System.out.println("-------------------------");
        System.out.println("");

    }
}
