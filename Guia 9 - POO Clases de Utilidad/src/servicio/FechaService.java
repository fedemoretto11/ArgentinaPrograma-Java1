/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class FechaService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento en forma numerica");
        System.out.println("Dia: ");
        int dia = sc.nextInt();
        System.out.println("Mes: ");
        int mes = sc.nextInt();
        System.out.println("Año: ");
        int año = sc.nextInt();
        
        return new Date(año - 1900, mes - 1, dia);
    }
    
    public Date fechaActual(){     
        return new Date();
    }
    
    public int diferencia(Date nacimiento, Date actual){
        int edad = actual.getYear() - nacimiento.getYear();
        
        if (actual.getMonth() - nacimiento.getMonth() < 0){
            edad--;
        }
        else if (actual.getMonth() - nacimiento.getMonth() == 0 && actual.getDate() - nacimiento.getDate() < 0){
            edad--;
        }
        return edad;
    }
}
