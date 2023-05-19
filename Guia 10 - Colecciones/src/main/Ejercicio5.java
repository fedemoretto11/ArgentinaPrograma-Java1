/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Pais;
import java.util.HashSet;
import java.util.TreeSet;
import service.paisesService;

/**
 *
 * @author fedmo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        paisesService servicio = new paisesService();
        TreeSet<Pais> onu = new TreeSet();
        
        servicio.crearPais(onu);
        servicio.imprimirPais(onu);
        servicio.eliminarPais(onu);
        servicio.eliminarPais(onu);

        
    }
    
 
}
