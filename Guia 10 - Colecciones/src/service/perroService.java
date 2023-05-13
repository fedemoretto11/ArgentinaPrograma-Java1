/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class perroService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    
    public Perro crearPerro(){
        System.out.println("");
        System.out.println("=====Creador de Perros :| =====");
        System.out.println("Ingrese la raza de perro: ");
        String raza = sc.nextLine();
        
        return new Perro(raza);
    }
    
    public ArrayList agregarPerro(ArrayList<Perro> array){
        boolean salir = false;
        String rta;
    
        while (!salir) {    
            System.out.println("Ingrese una raza de perro: ");
            Perro perro = crearPerro();
            array.add(perro);
            
            System.out.println("Desea salir? (s/n) ");
            rta = sc.nextLine();
            
            while (!rta.toLowerCase().equals("s") && !rta.toLowerCase().equals("n")) {
                System.out.println("Caracter invalido, ingrese nuevamente si desea salir: ");
                rta = sc.nextLine();
            }
            salir = rta.equals("s"); 
        }
        return array;
    }
    
    public void mostrarLista(ArrayList<Perro> array){
        for(Perro dogui : array){
            System.out.println("Raza de perro => " + dogui.getRaza());
        }
    }
    
    

    public void eliminarPerro(ArrayList<Perro> perros) {
        Iterator<Perro> contador = perros.iterator();
        System.out.println("===== Eliminador de perros :| (turbio) =====");
        System.out.println("Ingrese una raza de Perro a Eliminar: ");
        String eliminado = sc.nextLine();
        boolean elimino = false;
        
        while (contador.hasNext()) {
            if (contador.next().getRaza().equals(eliminado)) {
                System.out.println("Perro eliminado (sigue turbio) => " + eliminado);
                contador.remove();
                elimino = true;
            }
        }
        
        if(!elimino) System.out.println("El perro no se ha encontrado");

        perros.sort(Perro.compararRaza);
    }
    
    

}
