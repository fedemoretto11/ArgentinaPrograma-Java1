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
    private int duracion;

    
    // Constructor 
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
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

    public int getDuracion() {
        return duracion;
    }
    
    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    public static Comparator<Pelicula> duracionMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p2.getDuracion(),p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> duracionMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p1.getDuracion(),p2.getDuracion());
        }
    };
    

   
    
    
    
}
