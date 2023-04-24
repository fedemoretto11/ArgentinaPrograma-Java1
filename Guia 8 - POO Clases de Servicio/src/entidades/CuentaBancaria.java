/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;

    
    // Constructores
            
    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    
    // Getter

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getDniCliente() {
        return dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    
    
    // Setter

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    

}
