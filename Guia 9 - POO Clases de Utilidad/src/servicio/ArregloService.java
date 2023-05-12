/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;

/**
 *
 * @author fedmo
 */
public class ArregloService {

    public double[] inicializarA(double[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = Math.round((Math.random() * 10) * 100.0) / 100.0;
        }
        return array;
    }
    
    public void mostrar(double[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
        System.out.println("----------");
    }
    
    public double[] ordenar(double[] array){
        double[] nuevoArray = new double[array.length];
        Arrays.sort(array);
        return array;
    }
    
    public double[] ordenarB(double[] array){
        double[] nuevoArray = new double[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[array.length - 1 - i];
        }
        return nuevoArray;
    }
    
    public double[] inicializarB(double[] array1, double[] array2){
        for (int i = 0; i <= 9; i++){
            array2[i] = array1[i];
        }        
        Arrays.fill(array2,10,array2.length,0.5);
        
        return array2;
    }
}
