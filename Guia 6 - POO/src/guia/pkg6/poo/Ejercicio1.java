/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro();
        Libro libro2 = new Libro(12343, 1987, "Harry Potter", "Rowling");
        
        System.out.println("Ingrese el titulo del libro: ");
        libro1.setTitulo(sc.nextLine());
        System.out.println("Ingrese el autor del libro: ");
        libro1.setAutor(sc.nextLine());
        System.out.println("Ingrese el ISBN del libro: ");
        libro1.setIsbn(sc.nextInt());
        System.out.println("Ingrese el numero de paginas del libro: ");
        libro1.setPaginas(sc.nextInt());
        
        System.out.println("**************");
        System.out.println("Nombre: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Numero de paginas: " + libro1.getPaginas());
        System.out.println("**************");
        System.out.println("Nombre: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("ISBN: " + libro2.getIsbn());
        System.out.println("Numero de paginas: " + libro2.getPaginas());
        System.out.println("**************");

    }
}
