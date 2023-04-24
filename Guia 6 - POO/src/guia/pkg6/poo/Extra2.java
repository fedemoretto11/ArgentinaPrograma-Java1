/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;
import entidad.Puntos;
/**
 *
 * @author fedmo
 */
public class Extra2 {
    public static void main(String[] args) {
        Puntos punto = new Puntos();
        
        punto.crearPuntos();
        System.out.println("La distancia entre los puntos es de: " + 
        punto.calcularDistancia(punto.getX1(), punto.getX2(), 
        punto.getY1(), punto.getY2()));
    }
}
