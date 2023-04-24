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
public class Libro {
    
    private int isbn;
    private int paginas;
    private String titulo;
    private String autor;

    // Constructor vacio
    public Libro() {
    }

    //Constructor incializado
    public Libro(int isbn, int paginas, String titulo, String autor) {
        this.isbn = isbn;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
    }
        
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


}
