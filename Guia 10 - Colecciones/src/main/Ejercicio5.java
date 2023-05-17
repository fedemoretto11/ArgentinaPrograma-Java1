/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Pais;
import java.util.HashSet;
import service.paisesService;

/**
 *
 * @author fedmo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        paisesService servicio = new paisesService();
        HashSet<Pais> onu = new HashSet();
        
        servicio.crearPais(onu);
        servicio.imprimirPais(onu);
        
        System.out.println(onu.toString());
    }
    
 
}
