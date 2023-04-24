/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author fedmo
 */
public class Cancion {
    private String titulo;
    private String autor;

    // Constructores
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    
    // Getters
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    
    // Setters
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
}
