/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.ParDeNumeros;

/**
 *
 * @author fedmo
 */
public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros numeros){
        System.out.println("Numero 1: " + numeros.getNum1());
        System.out.println("Numero 2: " + numeros.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros numeros) {
        return numeros.getNum1() > numeros.getNum2() 
                ? numeros.getNum1() 
                : numeros.getNum2();
    }
    
    public double calcularPotencia(ParDeNumeros numeros){  
        return numeros.getNum1() >= numeros.getNum2() 
            ? Math.pow(Math.round(numeros.getNum1()), Math.round(numeros.getNum2())) 
            : Math.pow(Math.round(numeros.getNum2()), Math.round(numeros.getNum1()));
    }
    
    public double calculaRaiz(ParDeNumeros numeros){
        return numeros.getNum1() >= numeros.getNum2()
                ? Math.sqrt(Math.abs(numeros.getNum2()))
                : Math.sqrt(Math.abs(numeros.getNum1()));
    }
}
