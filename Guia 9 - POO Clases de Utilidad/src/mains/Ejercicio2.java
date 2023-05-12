/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;
import entidades.ParDeNumeros;
import servicio.ParDeNumerosService;
/**
 *
 * @author fedmo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        ParDeNumerosService ruleta = new ParDeNumerosService();
        ParDeNumeros numeros = new ParDeNumeros();
        
        ruleta.mostrarValores(numeros);
        System.out.println("El numero mayor es: " + ruleta.devolverMayor(numeros));
        System.out.println("Resultado potencia: " + ruleta.calcularPotencia(numeros));
        System.out.println("Resultado raiz: " + ruleta.calculaRaiz(numeros));

    }
    
    
    
}
