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
public class Circunferencia {
    private double radio;
    private double area;
    

    public Circunferencia() {
    }


    public double getRadio() {
        return radio;
    }

    private void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = sc.nextDouble();
        this.setRadio(radio);
    }
    
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}
