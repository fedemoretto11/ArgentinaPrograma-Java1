/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author fedmo
 */
public class Empleado {
    private String nombre;
    private int edad;
    private int salario;

    
    // Constructores
    
    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    
    
    // Getter

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    
    // Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    // Metodos
    
    public double calcular_aumento() {   
        return edad >= 30 ? salario * 1.3 : salario * 1.05;
    }
    
    
    
    

    
}

