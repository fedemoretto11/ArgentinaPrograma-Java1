/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Alumnos;
import java.util.ArrayList;
import service.alumnoService;

/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        alumnoService preceptoria = new alumnoService();
        
        ArrayList<Alumnos> curso = new ArrayList();
        
        preceptoria.crearAlumnoLoop(curso);
        preceptoria.notaFinal(curso);
    }
}
