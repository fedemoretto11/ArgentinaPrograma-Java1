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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese las columnas: ");
        int columnas = leer.nextInt();

        String[][] matrix  = new String[filas][columnas];
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == filas - 1){
                    matrix[i][j] = "*";
                }
                else if (j == 0 || j == (columnas - 1)){
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = " ";
                }
            
            }
        System.out.println();
        }
        
        
        
        
        // Imprimir matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }
    
}
