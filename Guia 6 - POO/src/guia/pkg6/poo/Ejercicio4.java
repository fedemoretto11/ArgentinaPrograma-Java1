/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;

import entidad.Rectangulo;

/**
 *
 * @author fedmo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.crearRectangulo();
        System.out.println(rectangulo1.calcularPerimeto());
        System.out.println(rectangulo1.calcularSuperficie());
    }
}
