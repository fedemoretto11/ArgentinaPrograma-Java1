/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra4;

import java.util.ArrayList;

/**
 *
 * @author fedmo
 */
public class ejercicioExtra4 {

    public static void main(String[] args) {

        Service servicio = new Service();
        ArrayList<Persona> personal = new ArrayList();

        Empleado empleado1 = new Empleado(2023, 100, "Julian", "Alvarez", 40425672, "Soltero");
        Estudiantes estudiante1 = new Estudiantes("Lengua", "Esteban", "Quito", 42567543, "Soltero");
        PersonalDeServicio serv = new PersonalDeServicio("Biblioteca", "Julieta", "Awada", 24567123, "Casado");
        Empleado empleado2 = new Empleado(2023, 100, "Ramiro", "Alvarez", 40425672, "Casado");
        Profesores profesor1 = new Profesores("Exactas", "Jeremias", "Franciscano", 23432234, "Soltero");

        personal.add(empleado1);
        personal.add(estudiante1);
        personal.add(serv);
        personal.add(profesor1);
        personal.add(empleado2);

        for (Persona persona : personal) {
            System.out.println(persona.toString());
        }
        
//        servicio.reasignarDespacho(personal);
//        servicio.cambiarDepartamento(personal);
        servicio.cambiarSeccion(personal);

        


        for (Persona persona : personal) {
            System.out.println(persona.toString());
        }

    }
}
