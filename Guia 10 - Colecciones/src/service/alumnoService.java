/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class alumnoService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Alumnos crearAlumno(){
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("===== CREADOR DE ALUMNOS =====");
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nota 1 del alumno: ");
        notas.add(validarNota());
        System.out.println("Ingrese la nota 2 del alumno: ");
        notas.add(validarNota());
        System.out.println("Ingrese la nota 3 del alumno: ");
        notas.add(validarNota());
        return new Alumnos(nombre, notas);
    }
    
    public void crearAlumnoLoop(ArrayList<Alumnos> arrayList){
        boolean salir = false;
        String rta;
        do {
            arrayList.add(crearAlumno());
          
            System.out.println("Desea cargar otro alumno? (s/n)");
            salir = !validarRta().equals("s");  
        } while (!salir);
        System.out.println("Saliendo...");
    }
    
    
    public void notaFinal(ArrayList<Alumnos> arrayList) {
        Iterator<Alumnos> it = arrayList.iterator();
        String nombre;
        System.out.println("===== Calculadora de promedios =====");
        System.out.println("Lista alumnos: ");
        imprimirNombre(arrayList);
        System.out.println("Ingrese el nombre del Alumno: ");
        nombre = sc.nextLine().toLowerCase();
        while (it.hasNext()) {
            Alumnos alumno = it.next();
            if (nombre.equals(alumno.getNombre().toLowerCase())) {
                System.out.println("El promedio del alumno es " + calcularPromedio(alumno.getNotas()));
                break;
            } else {
                System.out.println("Alumno no encontrado...");
            }
        }  
    }
    
    public double calcularPromedio(ArrayList<Integer> notas){
        int sumaNotas = 0;
        for(Integer nota : notas){
            sumaNotas += nota;
        }
        System.out.println(sumaNotas);
        System.out.println(notas.size());
        return sumaNotas / notas.size();
    }
    
    public void imprimirNombre(ArrayList<Alumnos> arrayList){
        for(Alumnos alumno : arrayList){
            System.out.println("- " + alumno.getNombre());
        }
    }

    public int validarNota(){
        int nota = sc.nextInt();
        while(nota < 0 || nota > 10 ) {
            System.out.println("Nota invalida ingrese nuevamente");
            nota = sc.nextInt();
        }
        sc.nextLine();
        return nota;
    }
    
    public String validarRta(){
        String rta;
        rta = sc.nextLine();
        while (!rta.toLowerCase().equals("s") && !rta.toLowerCase().equals("n")) {
            System.out.println("Caracter invalido, ingrese nuevamente si desea cargar otro alumno: ");
            rta = sc.nextLine();
        }
        
        return rta;
    }
}
