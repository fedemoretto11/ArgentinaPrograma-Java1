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
public class Operacion {
    private double numero1;
    private double numero2;

    
    // Constructores
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    
    // Getters

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    // Setters

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        setNumero1(sc.nextDouble());
        System.out.println("Ingrese el segundo numero: ");
        setNumero2(sc.nextDouble());
    }
    
    public double sumar() {
        return numero1 + numero2;
    }
    
    public double restar() {
        return numero1 - numero2;
    }
    
    public double multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error no se puede multiplicar por 0");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error no se puede dividir por 0");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
    
    
}
