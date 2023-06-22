package ejercicioExtra4;

import java.util.Scanner;

public class PersonalDeServicio extends Persona {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String Seccion;
    
    
    // Constructores

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String Seccion, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.Seccion = Seccion;
    }
    
    
    // Getters and Setters

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "PersonalDeServicio{" + "Seccion=" + Seccion + '}';
    }
    
    
    // Metodos
    
    public void trasladoPersonal(){
        System.out.println("Diga la nueva area: ");
        setSeccion(sc.nextLine());
    }
    
}
