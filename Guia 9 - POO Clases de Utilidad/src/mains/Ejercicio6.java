/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Curso;
import servicio.CursoService;

/**
 *
 * @author fedmo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        CursoService preceptoria = new CursoService();
        Curso curso1 = preceptoria.crearCurso();
        preceptoria.mostrarAlumno(curso1);
        System.out.println("El costo de la clase es de: $" + preceptoria.calcularGanancia(curso1));

        
        
    }
}
