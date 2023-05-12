/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import servicio.ArregloService;

/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        ArregloService arreglador = new ArregloService();
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        arreglador.inicializarA(arregloA);
        arreglador.mostrar(arregloA);
        arreglador.ordenar(arregloA);
        arreglador.inicializarB(arregloA, arregloB);
        arreglador.mostrar(arregloA);
        arreglador.mostrar(arregloB);

        
    }

    
}
