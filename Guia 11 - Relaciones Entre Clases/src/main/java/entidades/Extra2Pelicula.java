/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Extra2Pelicula {
    private String titulo;
    private Double duracion;
    private Integer edadMinima;
    private String Director;
    
    // Constructores

    public Extra2Pelicula() {
    }

    public Extra2Pelicula(String titulo, Double duracion, Integer edadMinima, String Director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.Director = Director;
    }
    
    // Getter and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Extra2Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", Director=" + Director + '}';
    }
    
    
}
