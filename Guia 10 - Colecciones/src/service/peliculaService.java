/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class peliculaService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPelicula(ArrayList<Pelicula> arrayList) {
        int peli = 0;
        
        do {
        System.out.println("===== INGRESO DE FILMS =====");
        System.out.println("Ingrese el nombre de la pelicula: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nombre del Director de la pelicula: ");
        String director = sc.nextLine();
        System.out.println("Ingrese la duracion en horas de la pelicula: ");
        int duracion = sc.nextInt();
        
        System.out.println("Desea ingresar otra peli? (1 = si / 0 = no)");
        peli = sc.nextInt();
        sc.nextLine();
        
        arrayList.add(new Pelicula(nombre, director, duracion));
        } while (peli == 1);
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> arrayList) {
        System.out.println("");
        System.out.println("===== CARTELERA =====");
        System.out.println("Hay " + arrayList.size() + " peliculas en cartelera");
        for (Pelicula peli : arrayList) {
            System.out.println(peli.getTitulo());
        }
    }
    
    public void mostrarMayorHora(ArrayList<Pelicula> arrayList) {
        System.out.println("");
        System.out.println("===== Pelis largas =====");
        for (Pelicula peli : arrayList) {
            if (peli.getDuracion() > 1) {
                System.out.println("La pelicula " + peli.getTitulo() + " dura mas de una hora");
            }
        }
    }
    
    public void ordenMayorMenor(ArrayList<Pelicula> arrayList) {
        arrayList.sort(Pelicula.duracionMayor);
    }
    
    public void ordenMenorMayor(ArrayList<Pelicula> arrayList) {
        arrayList.sort(Pelicula.duracionMenor);
    }
    
    
}

