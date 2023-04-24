/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.poo;

import entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Extra5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        // Empleado creado con constructor con parametro
        Empleado empleado1 = new Empleado("Federico", 28, 100000);
        
        // Empleado creado con constructor sin parametro

        Empleado empleado2 = new Empleado();
        System.out.println("Diga el nombre del empleado 2: ");
        empleado2.setNombre(sc.nextLine());
        System.out.println("Diga la edad del empleado 2: ");
        empleado2.setEdad(sc.nextInt());
        System.out.println("Diga el salario del empleado 2: ");
        empleado2.setSalario(sc.nextInt());
        
        
        System.out.println("El empleado " + empleado1.getNombre() + " estara cobrando: " + empleado1.calcular_aumento());
        System.out.println("El empleado " + empleado2.getNombre() + " estara cobrando: " + empleado2.calcular_aumento());

        sc.close();
    }
}
