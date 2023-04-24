/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Cafetera;
import servicio.CafeteraServicio;

/**
 *
 * @author fedmo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        
        Cafetera cafetera1 = cs.crearCafetera();
        
        cs.llenarCafetera(cafetera1);
        cs.servirTaza(cafetera1);
        cs.vaciarCafetera(cafetera1);
        cs.agregarCafe(cafetera1);
        
        
    }
}
