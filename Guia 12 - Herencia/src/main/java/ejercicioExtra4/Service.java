/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Service {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private void mostrarElementos(ArrayList<Persona> personal){
        for (int i = 0; i < personal.size(); i++) {
            System.out.println((i + 1) + ". " + personal.get(i).getNombre() + " // " + personal.get(i).getDni());
        }
    }
    
    public void cargarEmpleado(ArrayList<Persona> personal) {
        System.out.println("===== Ingreso de Empleado =====");
        System.out.println("Ingrese el año de ingreso: ");
        Integer ingreso = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de despacho: ");
        Integer despacho = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el numero de DNI: ");
        Integer dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado civil: ");
        String estadoCivil = sc.nextLine();
        personal.add(new Empleado(ingreso, despacho, nombre, apellido, dni, estadoCivil));
    }
    
    public void cargarEstudiante(ArrayList<Persona> personal){
        System.out.println("===== Ingreso de Estudiante =====");
        System.out.println("Ingrese el curso: ");
        String curso = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el numero de DNI: ");
        Integer dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado civil: ");
        String estadoCivil = sc.nextLine();
        personal.add(new Estudiantes(curso, nombre, apellido, dni, estadoCivil));
    }
    
    public void cargarPersonalServicio(ArrayList<Persona> personal) {
        System.out.println("===== Ingreso de Personal de Servicio =====");
        System.out.println("Ingrese la seccion: ");
        String seccion = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el numero de DNI: ");
        Integer dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado civil: ");
        String estadoCivil = sc.nextLine();
        personal.add(new PersonalDeServicio(seccion, nombre, apellido, dni, estadoCivil));
    }
    
    public void cargarProfesor(ArrayList<Persona> personal){
        System.out.println("===== Ingreso de Profesor =====");
        System.out.println("Ingrese el departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el numero de DNI: ");
        Integer dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado civil: ");
        String estadoCivil = sc.nextLine();
        personal.add(new Profesores(departamento, nombre, apellido, dni, estadoCivil));
    }
    
    public void cambioEstadoCivil(ArrayList<Persona> personal){
        System.out.println("A quien desea modificarle el estado civil? ");
        mostrarElementos(personal);
        Integer opcion = sc.nextInt();
        sc.nextLine();
        
        if(opcion > 0 && opcion <= personal.size()){
            Persona personaSeleccionada = personal.get(opcion - 1);
            System.out.println("Estado civil actual: " + personaSeleccionada.getEstadoCivil());
            System.out.println("Ingrese el nuevo estado civil:");
            String nuevoEstadoCivil = sc.nextLine();
            personaSeleccionada.setEstadoCivil(nuevoEstadoCivil);
            System.out.println("Estado civil modificado exitosamente.");
        } else {
            System.out.println("Opcion no valida");
        }

    }
    
    public void reasignarDespacho(ArrayList<Persona> personal){
        System.out.println("");
        System.out.println("=== Cambio de Seccion ===");
        System.out.println("A quien desea modificarle el Despacho? ");
        for (Persona persona : personal) {
            if (persona instanceof Empleado) {
                System.out.println((personal.indexOf(persona) + 1) + ". " + persona.getNombre());
            }
        }
        Integer opcion = sc.nextInt();
        sc.nextLine();
        Empleado empleadoSeleccionado = (Empleado) personal.get(opcion - 1);
        System.out.println("Despacho actual: " + empleadoSeleccionado.getNumeroDespacho());
        System.out.println("Ingrese el nuevo despacho:");
        Integer nuevoDespacho = sc.nextInt();
        sc.nextLine();
        empleadoSeleccionado.setNumeroDespacho(nuevoDespacho);
        System.out.println("Despacho modificado exitosamente.");


    }
    
    public void cambiarDepartamento(ArrayList<Persona> personal){
        System.out.println("");
        System.out.println("=== Cambio de Departamento ===");
        System.out.println("A quien desea modificarle el Departamento? ");
        for (Persona persona : personal) {
            if (persona instanceof Profesores) {
                System.out.println((personal.indexOf(persona) + 1) + ". " + persona.getNombre());
            }
        }
        Integer opcion = sc.nextInt();
        sc.nextLine();
        Profesores profesorSeleccionado = (Profesores) personal.get(opcion - 1);
        System.out.println("Despacho actual: " + profesorSeleccionado.getDepartamento());
        System.out.println("Ingrese el nuevo despacho:");
        String nuevoDepartamento = sc.nextLine();
        profesorSeleccionado.setDepartamento(nuevoDepartamento);
        System.out.println("Departamento modificado exitosamente.");
    }
    
    public void cambiarSeccion(ArrayList<Persona> personal) {
        System.out.println("");
        System.out.println("=== Cambio de Seccion ===");
        System.out.println("A quien desea modificarle la Seccion? ");
        for (Persona persona : personal) {
            if (persona instanceof PersonalDeServicio) {
                System.out.println((personal.indexOf(persona) + 1) + ". " + persona.getNombre());
            }
        }
        Integer opcion = sc.nextInt();
        sc.nextLine();
        PersonalDeServicio personalSeleccionado = (PersonalDeServicio) personal.get(opcion - 1);
        System.out.println("Despacho actual: " + personalSeleccionado.getSeccion());
        System.out.println("Ingrese el nuevo despacho:");
        String nuevaSeccion = sc.nextLine();
        personalSeleccionado.setSeccion(nuevaSeccion);
        System.out.println("Seccion modificada exitosamente.");
    }
 
}
