/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Cadena;
import servicio.CadenaService;

/**
 *
 * @author fedmo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CadenaService cs = new CadenaService();
        Cadena cadena1 = new Cadena("Hola soy Fede");
        Cadena cadena2 = new Cadena("Hola soy Maria");
        System.out.println("La frase tiene " + cs.mostrarVocales(cadena1) + " vocales");
        System.out.println("La frase al reves es: " + cs.invertirFrase(cadena1));
        cs.vecesRepetido(cadena1, 'e');
        cs.compararLongitud(cadena1, cadena2);
        System.out.println(cs.unirFrases(cadena1, cadena2));
        System.out.println(cs.reemplazar(cadena2, 'z'));
        System.out.println(cs.contiene(cadena2, 'f'));
    }
}
