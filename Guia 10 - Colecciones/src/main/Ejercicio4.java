/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Pelicula;
import java.util.ArrayList;
import service.peliculaService;

/**
 *
 * @author fedmo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        peliculaService servicio = new peliculaService();
        
        ArrayList<Pelicula> cine = new ArrayList();
        servicio.crearPelicula(cine);
        servicio.mostrarPeliculas(cine);
        servicio.mostrarMayorHora(cine);
        
        servicio.ordenMayorMenor(cine);
        servicio.mostrarPeliculasDuracion(cine);
        
        servicio.ordenMenorMayor(cine);
        servicio.mostrarPeliculasDuracion(cine);
        
        servicio.ordenDirector(cine);
        servicio.mostrarPeliculasDirector(cine);
        
        servicio.ordenTitulo(cine);
        servicio.mostrarPeliculasDirector(cine);

        
    }
}
