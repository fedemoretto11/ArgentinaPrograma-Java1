package ejercicioExtra4;

import java.util.Scanner;

public class Profesores extends Persona {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String departamento;
    
    
    // Constructores

    public Profesores() {
    }

    public Profesores(String departamento, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }
    
    
    // Getters and Setters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "departamento=" + departamento + '}';
    }
    
    
    // Metodos
    
    public void nuevoDepartamento(){
        System.out.println("Mencione el departamento al que quiero reasignarse: ");
        setDepartamento(sc.nextLine());
    }
    
}
