/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.Nombres;
import enums.Apellidos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author fedmo
 */
public class Extra4Simulador {
    Random random = new Random();
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Extra4Alumno> listaAlumnos = new ArrayList();
    ArrayList<Extra4Voto> listaVotos = new ArrayList();

    
    
    public String generadorNombreCompleto(){
        Nombres[] nombres = Nombres.values();
        Apellidos[] apellidos = Apellidos.values();
        String nombreCompleto;
        return nombres[random.nextInt(nombres.length)].getNombre() + " " + apellidos[random.nextInt(apellidos.length)].getApellido();
    }
    
    public Integer generadorDNI(){
        return random.nextInt(90000000) + 10000000;
    }
    
    public void crearAlumno(){
        System.out.println("Cuantos alumnos desea generar? ");
        Integer alumnos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < alumnos; i++) {
            listaAlumnos.add(new Extra4Alumno(generadorNombreCompleto(), generadorDNI(),0));
        }      
    }
    
    public void imprimirAlumnos(){
        for (Extra4Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
    
    public void votacion(){
        Iterator<Extra4Alumno> it = listaAlumnos.iterator();
        imprimirAlumnos();
        System.out.println("Ingrese el alumno que va a votar: ");
        String votante = sc.nextLine();

        while (it.hasNext()) {
            Extra4Alumno alumno = it.next();
            if(alumno.getNombreCompleto().toLowerCase().equals(votante.toLowerCase())){
                listaVotos.add(new Extra4Voto(alumno));
            }
        }
        
        System.out.println("Ingrese el alumno al que desea votar: ");
        
        
        
        System.out.println(listaVotos);
        
    }
}
