/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import entidades.Ejercicio1Perro;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio1Persona {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Ejercicio1Perro perro;


    
    // Constructor
    public Ejercicio1Persona() {
    }

    public Ejercicio1Persona(String nombre, String apellido, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;

    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Ejercicio1Perro getPerro() {
        return perro;
    }

    public void setPerro(Ejercicio1Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", \n   perro=" + perro + '}';
    }
    
    
    public void adoptarPerro(Ejercicio1Perro perro){
        System.out.println("Hola " + nombre + ". Que perrito deseas adoptar de los disponibles??");
        perro.mostarPerros();
        String adoptar = sc.nextLine();
        Iterator<Ejercicio1Perro> it = perro.getDisponibles().iterator();
        while(it.hasNext()) {
            Ejercicio1Perro perrito = it.next();
                if(adoptar.toLowerCase().equals(perrito.getNombre().toLowerCase())) {
                    perrito.setAdoptado(true);
                    setPerro(perrito);
                    perro.setAdoptados(perrito);
                    it.remove();
                }
        }
    }
    
    

}
