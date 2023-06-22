/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Ejercicio2Lavadora;
import entidades.Ejercicio2Televisor;
import java.util.ArrayList;
import superEntidades.Ejercicio2Electrodomestico;

/**
 *
 * @author fedmo
 */
public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Ejercicio2Electrodomestico> electrodomesticos = new ArrayList();
        Double precioTotal = 0.0;
        Double preciolavadora = 0.0;
        Double precioTelevisor = 0.0;
        
        Ejercicio2Lavadora lavadora1 = new Ejercicio2Lavadora(25, "blanco", 'e', 26.0);
        Ejercicio2Lavadora lavadora2 = new Ejercicio2Lavadora(22, "rojo", 'a', 29.0);
        Ejercicio2Lavadora lavadora3 = new Ejercicio2Lavadora(26, "verde", 'z', 32.0);
        Ejercicio2Lavadora lavadora4 = new Ejercicio2Lavadora(28, "azul", '4', 12.0);
        
        Ejercicio2Televisor tele1 = new Ejercicio2Televisor(29, "negro", 'a', 12.0, true);
        Ejercicio2Televisor tele2 = new Ejercicio2Televisor(32, "blanco", 'c', 32.0);
        Ejercicio2Televisor tele3 = new Ejercicio2Televisor(42, "rojo", 'e', 45.0,true);
        Ejercicio2Televisor tele4 = new Ejercicio2Televisor(59, "verde", 'a', 19.0);
        
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(lavadora4);
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(tele3);
        electrodomesticos.add(tele4);
        
        
        
        for (Ejercicio2Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            precioTotal = precioTotal + electrodomestico.getPrecio();
            System.out.println(electrodomestico);
            if (electrodomestico instanceof Ejercicio2Lavadora) {
                preciolavadora = preciolavadora + electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Ejercicio2Televisor) {
                precioTelevisor = precioTelevisor + electrodomestico.getPrecio();
            }
        }
        
        System.out.println(precioTotal);
        System.out.println(preciolavadora);
        System.out.println(precioTelevisor);



        

        
        
        
        
        
        
        

        
                
    }
}
