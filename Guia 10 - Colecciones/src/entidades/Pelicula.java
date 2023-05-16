/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author fedmo
 */
public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;

    
    // Constructor 
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }
    
    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    public static Comparator<Pelicula> duracionMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p2.getDuracion(),p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> duracionMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p1.getDuracion(),p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
    public static Comparator<Pelicula> ordenTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    

   
    
    
    
}
