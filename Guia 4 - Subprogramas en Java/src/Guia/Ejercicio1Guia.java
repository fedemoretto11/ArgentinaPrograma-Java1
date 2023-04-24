/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio1Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase para codificar: ");
        String frase = sc.nextLine();

        String codificado = codificador(frase);
        System.out.println(codificado);
        sc.close();
        


    }

    public static String codificador(String frase) {
        String fraseCodificada = "";
        for(int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            switch (letra) {
                case 'a':
                    fraseCodificada = fraseCodificada + "@";
                    break;
                case 'e':
                    fraseCodificada = fraseCodificada + "#";
                    break;
                case 'i':
                    fraseCodificada = fraseCodificada + "$";
                    break;
                case 'o':
                    fraseCodificada = fraseCodificada + "%";
                    break;
                case 'u':
                    fraseCodificada = fraseCodificada + "*";
                    break;
                default:
                    fraseCodificada = fraseCodificada + letra;
                    break;
            }
        }

        return fraseCodificada;

    }
    
}






