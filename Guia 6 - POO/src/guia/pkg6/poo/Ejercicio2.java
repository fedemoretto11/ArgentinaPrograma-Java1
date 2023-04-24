/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;

import entidad.Circunferencia;

/**
 *
 * @author fedmo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

        
    }
}
