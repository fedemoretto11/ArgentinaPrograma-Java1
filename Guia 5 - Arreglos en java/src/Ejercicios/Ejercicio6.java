/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int n = input.nextInt();
        int[][] cuadrado = new int[n][n];
        System.out.println("Ingrese los valores del cuadrado: ");

        // Llenar el cuadrado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = input.nextInt();
            }
        }

        // Suma de la primera fila para comparar
        int sumaFila = 0;
        for (int j = 0; j < n; j++) {
            sumaFila += cuadrado[0][j];
        }

        // Validación de filas
        boolean filasCorrectas = true;
        for (int i = 1; i < n; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < n; j++) {
                sumaFilaActual += cuadrado[i][j];
            }
            if (sumaFilaActual != sumaFila) {
                filasCorrectas = false;
                break;
            }
        }

        // Validación de columnas
        boolean columnasCorrectas = true;
        for (int j = 0; j < n; j++) {
            int sumaColumnaActual = 0;
            for (int i = 0; i < n; i++) {
                sumaColumnaActual += cuadrado[i][j];
            }
            if (sumaColumnaActual != sumaFila) {
                columnasCorrectas = false;
                break;
            }
        }

        // Validación de la diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += cuadrado[i][i];
        }
        boolean diagonalPrincipalCorrecta = (sumaDiagonalPrincipal == sumaFila);

        // Validación de la diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += cuadrado[i][n - i - 1];
        }
        boolean diagonalSecundariaCorrecta = (sumaDiagonalSecundaria == sumaFila);

        // Mostrar resultado
        if (filasCorrectas && columnasCorrectas && diagonalPrincipalCorrecta && diagonalSecundariaCorrecta) {
            System.out.println("El cuadrado ingresado es un cuadrado mágico.");
        } else {
            System.out.println("El cuadrado ingresado NO es un cuadrado mágico.");
        }
        input.close();
    }

}
