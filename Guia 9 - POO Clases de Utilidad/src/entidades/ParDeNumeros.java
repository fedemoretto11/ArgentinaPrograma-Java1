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
public class ParDeNumeros {
    private double num1;
    private double num2;

    // Contructor

    public ParDeNumeros() {
        num1 = Math.round((Math.random() * 10) * 100.0) / 100.0;
        num2 = Math.round((Math.random() * 10) * 100.0) / 100.0;
    }
    
    // Getterse 

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    // Setters

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
    
    
    
}
