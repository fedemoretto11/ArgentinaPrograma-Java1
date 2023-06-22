package ejercicioExtra4;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes extends Persona {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String curso;
    
    
    // Constructores

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }
    
    
    // Getters and Setters

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "Estudiantes{" + "curso=" + curso + '}';
    }
    
    
    // Metodos
    
    public void nuevoEstudiante(ArrayList<Persona> personas) {
        System.out.println("Diga el curso: ");
        String curso = sc.nextLine();
        System.out.println("Diga el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Diga el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Diga el DNI: ");
        Integer dni = sc.nextInt();
        sc.nextLine();
        System.out.println("Diga el estado civil: ");
        String estadoCivil = sc.nextLine();
        
        personas.add(new Estudiantes(curso, nombre, apellido, dni, estadoCivil));
        
    }
}
