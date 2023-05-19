/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author fedmo
 */
public class paisesService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPais(TreeSet<Pais> paises){
        boolean salir  = false;
        String rta;
        
        do {
        System.out.println("Diga un pais para ingresar: ");
        String nombrePais = sc.nextLine();
        
        Pais nuevoPais = new Pais();
        nuevoPais.setNombre(nombrePais);
        
        paises.add(nuevoPais);
        
        System.out.println("Desea ingresar otro pais? (s/n)");
        salir = !validarRta().equals("s"); 
        } while (!salir);
        
    }
     
    public void imprimirPais(TreeSet<Pais> paises) {
        for (Pais p : paises) {
            System.out.println("-" + p.getNombre());
        }
    }

    public void eliminarPais(TreeSet<Pais> paises) {
        System.out.println("Ingrese el pais a borrar: ");
        String nombrePais = sc.nextLine();
        boolean paisEncontrado = false;
        Iterator<Pais> it  = paises.iterator();
        
        while (it.hasNext()) {
        Pais p = it.next();
        if (p.getNombre().equals(nombrePais)) {
            it.remove();
            paisEncontrado = true;
            break;
            }
        }
        if (paisEncontrado) {
            System.out.println("Pais eliminado correctamente.");
        } else {
            System.out.println("Pais no encontrado.");
        }
        
    }
    
    public String validarRta(){
        String rta;
        rta = sc.nextLine();
        while (!rta.toLowerCase().equals("s") && !rta.toLowerCase().equals("n")) {
            System.out.println("Caracter invalido, ingrese nuevamente si desea cargar otro alumno: ");
            rta = sc.nextLine();
        }
        
        return rta;
    }
    
   
    
    
}
