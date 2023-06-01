/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author fedmo
 */
public class Ejercicio1Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño;
    private boolean adoptado;
    private ArrayList<Ejercicio1Perro> disponibles = new ArrayList();
    private ArrayList<Ejercicio1Perro> adoptados = new ArrayList();

    
    // Constructor
    public Ejercicio1Perro() {
    }

    public Ejercicio1Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.adoptado = false;
    }

    
    // Getter Setter
    
    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public ArrayList<Ejercicio1Perro> getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(ArrayList<Ejercicio1Perro> disponibles) {
        this.disponibles = disponibles;
    }

    public ArrayList<Ejercicio1Perro> getAdoptados() {
        return adoptados;
    }

    public void setAdoptados(Ejercicio1Perro perro) {
        adoptados.add(perro);
    }
    
    

    @Override
    public String toString() {
        return "   Nombre: " + nombre + " // Raza: " + raza + " // Edad: " + edad + " // Tamaño: " + tamaño + " // Adoptado: " + adoptado;
    }
    
    
    
    public void crearPerro(String nombre, String raza, Integer edad, String tamaño){
        disponibles.add(new Ejercicio1Perro(nombre, raza, edad, tamaño));
    }
    
    public void mostarPerros(){
        if (disponibles.size() > 0){
            System.out.println("Lista de Perros listos para adoptar: ");
            for (Ejercicio1Perro disponible : disponibles) {
                System.out.println(disponible);
            }            
        } else {
            System.out.println("No hay perros para adoptar");
        }

    }
    
    public void mostarAdoptados(){
        if (adoptados.size() > 0) {
            System.out.println("Lista de Perros adoptados: ");
                for (Ejercicio1Perro adoptado : adoptados) {
                System.out.println(adoptado);
            }
        }
        else {
            System.out.println("No hay perros adoptados");
        }
        
    }
}
