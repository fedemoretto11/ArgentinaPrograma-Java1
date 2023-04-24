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
public class Persona {
    
    private String nombre;
    private String estadoCivil;
    private int edad;
    

    // Constructores
    public Persona(){
        
    };
    
    public Persona(String nombre, String estadoCivil, int edad) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }
    
    //Para mostrar atributos (Metodos de consulta)
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public int getEdad() {
        return edad;
    }
    
    
    
    
    
    // Para establecer atributos (Metodos modificadores)
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    

}
