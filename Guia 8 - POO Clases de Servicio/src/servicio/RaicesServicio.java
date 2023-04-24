/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class RaicesServicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaiz(){
        System.out.println("Ingrese el valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double c = sc.nextDouble();
        
        return new Raices( a, b, c);
    }
    
    public double getDiscriminate(Raices raiz){
//         (b^2)-4*a*c 
        return Math.pow(raiz.getB(),2) - 4 * raiz.getA()*raiz.getC();
    }
    
    public boolean tieneRaices(Raices raiz){
        return getDiscriminate(raiz) >= 0;
    }
    
    public boolean tieneRaiz(Raices raiz){
        return getDiscriminate(raiz) == 0;
    }
    
    public void obtenerRaices(Raices raiz) {
        if (tieneRaices(raiz)) {
            double raiz1 = (-raiz.getB() - Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA());
            double raiz2 = (-raiz.getB() + Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA());
            System.out.println("Las raices son: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("No tiene raices");
        }
    }
    
    public void obtenerRaiz(Raices raiz) {
        if(tieneRaiz(raiz)) {
            double raiz1 = (-raiz.getB() - Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA());
            System.out.println("La raiz es: " + raiz1);
        } else {
            System.out.println("No tiene raiz");
        }
    }
    
    public void calcular(Raices raiz) {
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solución");
        }
    }
    
    
}
