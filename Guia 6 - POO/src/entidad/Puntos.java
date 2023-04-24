/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fedmo
 */
public class Puntos {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    
    // Constructor
    
    public Puntos(double x1, double x2, double y1) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Puntos() {
    }
    
    
    // Getters

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
    
    
    // Setters 

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
    // Metodos
    
    public void crearPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1: ");
        setX1(sc.nextDouble());
        System.out.println("Ingrese el valor de x2: ");
        setX2(sc.nextDouble());
        System.out.println("Ingrese el valor de y1: ");
        setY1(sc.nextDouble());
        System.out.println("Ingrese el valor de y2: ");
        setY2(sc.nextDouble());
    }
    
    public double calcularDistancia(double x1,double x2,double y1,double y2){
        double cateto1 = x2 - x1;
        double cateto2 = y2 - y1;
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto1));
    }
    
    
    
    
    
    
}
