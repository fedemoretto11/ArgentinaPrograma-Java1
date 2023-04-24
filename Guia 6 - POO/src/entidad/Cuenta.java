/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Cuenta {
    private int saldo;
    private String titular;

    
    // Constructor
    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }
    
    
    // Getter

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    
    // Setter

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    // Metodos
    
    private boolean validarIdentidad(String titular){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();
        int intentosRestantes = 3;
        
        while (intentosRestantes > 0){
            if(usuario.toLowerCase().equals(titular.toLowerCase())) {
                System.out.println("Ingreso correcto");
                return true;
            } else {
                System.out.println("Usuario incorrecto, le quedan " + (intentosRestantes - 1) + " intentos. Ingrese nuevamente su usuario");
                usuario = sc.nextLine();
                intentosRestantes--;
            }
        }
        System.out.println("Demasiados intentos realizados, cuenta bloqueada");
        return false;
    }
    
    
    
    
    public void retirar_dinero(int saldo, String titular){
        Scanner sc = new Scanner(System.in);
        int montoParaRetirar;
        
        if(validarIdentidad(titular)){
            System.out.println("Ingrese el monto que desea retirar: ");
            montoParaRetirar = sc.nextInt();
            if (saldo - montoParaRetirar < 0) {
                System.out.println("Saldo insuficiente");
            } 
            else if (saldo - montoParaRetirar == 0) {
                System.out.println("Monto retirado, le quedan $0");
            } 
            else {
                System.out.println("Usted retiro: $" + montoParaRetirar + ". Le " + "quedan en su cuenta: $" + (saldo - montoParaRetirar));
            }
        }
        
        
        
    }  
}













