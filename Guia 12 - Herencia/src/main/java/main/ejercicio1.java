/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Ejercicio1Caballo;
import entidades.Ejercicio1Gato;
import entidades.Ejercicio1Perro;
import java.util.ArrayList;
import superEntidades.Ejercicio1Animal;

/**
 *
 * @author fedmo
 */
public class ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Ejercicio1Animal> lista = new ArrayList();
//        Ejercicio1Animal a = new Ejercicio1Animal();
        Ejercicio1Animal b = new Ejercicio1Perro("Sombra", "Hueso",8, "Labrador");
        Ejercicio1Animal c = new Ejercicio1Gato("Anubis", "Alimento balanceado",1, "Gato");
        Ejercicio1Animal d = new Ejercicio1Caballo("Llanero", "Pasto",14, "Lobuno");
        
        lista.add(d);
        lista.add(b);
        lista.add(c);
        
        for (Ejercicio1Animal animalito : lista) {
            animalito.alimentacion();
        }

    }
}
