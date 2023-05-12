/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class EstudiantesService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiantes crearEstudiante(){
        System.out.println("===== Entrada de datos =====");
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nota obtenida: ");
        float nota = sc.nextFloat();
        while(nota > 10 || nota < 0){
            System.out.println("Nota invalida, ingrese nuevamnete: ");
            nota = sc.nextFloat();
        }
        sc.nextLine();
        
        return new Estudiantes(nombre, nota);
    }
    
    public Estudiantes[] cargarAlumnos(Estudiantes[] vector){
        for (int i = 0; i < vector.length; i++){
            vector[i] = crearEstudiante();
        }
        
        return vector;
    }
    
    public void imprimirNotas(Estudiantes[] vector){
        System.out.println("----- Notas alumnos -----");
        for (int i = 0; i < vector.length; i++){
            System.out.println(" Alumno " + (i + 1));
            System.out.println("Nombre alumno: " + vector[i].getNombre());
            System.out.println("Nota alumno: " + vector[i].getNota());
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
    
    public float promedio(Estudiantes[] vector){
        float sumaNotas = 0;
        for (int i = 0; i < vector.length; i++) {
            sumaNotas += vector[i].getNota();
        }  
        return sumaNotas / vector.length;
        
    }
    
    public Estudiantes[] mayorPromedio(Estudiantes[] vector){
        int cantidad = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota() > promedio(vector))
                cantidad++;
        }
        
        Estudiantes[] mayorPromedio = new Estudiantes[cantidad];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota() > promedio(vector)){
                mayorPromedio[i] = vector[i];
            }
        }
        return mayorPromedio;
    }
    
    
}
