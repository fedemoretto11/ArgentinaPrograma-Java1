/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;
import java.util.Date;
import servicio.FechaService;
/**
 *
 * @author fedmo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        Date nacimiento = fecha.fechaNacimiento();
        Date fechaActual = fecha.fechaActual();

//        System.out.println(nacimiento);
        System.out.println(fechaActual);
        System.out.println(fecha.diferencia(nacimiento, fechaActual));
    }
}
