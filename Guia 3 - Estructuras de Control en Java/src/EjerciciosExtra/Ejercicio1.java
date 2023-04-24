/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dias;
        int horas;
        int minutos;
        System.out.println("Ingrese un tiempo en minutos: ");
        int minutosIngresados = leer.nextInt();
        
        dias = minutosIngresados / 1440;
        horas = (minutosIngresados % 1440) / 60;
        minutos = (minutosIngresados % 1440) % 60;
        
        
        System.out.println("Los minutos ingresados equivalen a: " + dias + " dias, " + horas + " horas y " + minutos + " minutos");
        System.out.println("");
        
        
        
    }
}
