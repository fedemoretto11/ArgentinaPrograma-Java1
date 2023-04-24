/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cafetera;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fedmo
 */
public class CafeteraServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        System.out.println("-----Crear Cafetera-----");

        System.out.println("Ingrese la capacidad maxima: ");
        int capacidadMaxima = sc.nextInt();

        System.out.println("Ingrese la capacidad actual: ");
        int capacidadActual = sc.nextInt();

        return new Cafetera(capacidadMaxima, capacidadActual);
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La capacidad actual es " + cafetera.getCapacidadActual());

    }
    
    
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Indique el tamaño de la taza");
        int taza = sc.nextInt();
        
        if (cafetera.getCapacidadActual() - taza >= 0) {
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() - taza);
            System.out.println("Taza llena");
        } else {
            System.out.println("La taza se lleno con " + cafetera.getCapacidadActual() + " ml de cafe");
            cafetera.setCapacidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(0);
        System.out.println("Cafetera vacia");
    }


    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad a agregar a la cafetera");
        int ingreso = sc.nextInt();

        if (cafetera.getCapacidadActual() + ingreso <= cafetera.getCapacidadMaxima()) {
            System.out.println("Contenido agregado exitosamente");
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() + ingreso);
        } else if (cafetera.getCapacidadActual() == cafetera.getCapacidadMaxima()) {
            System.out.println("Cafetera llena, no puede ingresas mas");
        } else {
            System.out.println("Usted pudo ingresar parte solamente " + (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual()));
            cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        }

    }

}
