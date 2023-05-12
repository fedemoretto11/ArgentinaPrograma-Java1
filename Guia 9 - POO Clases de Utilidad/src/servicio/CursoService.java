/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import entidades.Curso;
import java.util.Arrays;
/**
 *
 * @author fedmo
 */
public class CursoService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public String[] crearAlumnos(){
        String[] alumnos = new String[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            alumnos[i] = sc.nextLine();
        }
        return alumnos;
    }
    
    public void mostrarAlumno(Curso curso) {
        System.out.println(Arrays.toString(curso.getAlumnos()));
        
    }
    
    public Curso crearCurso(){
        System.out.println("-----Creador de curso-----");
        System.out.println("Nombre del curso: ");
        String nombreCurso = sc.nextLine();
        System.out.println("Ingrese las horas por dia: ");
        int horasPorDia = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de dias por semana: ");
        int diasPorSemana = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el turno: ");
        String turno = sc.nextLine();
        System.out.println("Ingrese el precio por hora: ");
        int precioPorHora = sc.nextInt();
        sc.nextLine();
        
        
        return new Curso(nombreCurso, horasPorDia, diasPorSemana, turno, precioPorHora, crearAlumnos());
    }
    
    
    
    public int cantidadAlumnos(Curso curso){
        int cantidad = 0;
        for(int i = 0; i < 5; i++){
            if (!curso.getAlumnos()[i].equals("")){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    
    
    public double calcularGanancia(Curso curso){
        // ganancia = horas * precio x hora * alumnos * dias
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * cantidadAlumnos(curso) * curso.getCantidadDiasPorSemana();
    }
}
