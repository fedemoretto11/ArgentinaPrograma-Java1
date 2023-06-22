package ejercicioExtra4;

import java.util.Date;
import java.util.Scanner;

public class Empleado extends Persona {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Date anioIncorporacion;
    private Integer numeroDespacho;
    
    
    // Constructores

    public Empleado() {
    }

    public Empleado(Integer anioIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = new Date(anioIncorporacion - 1900,1,1);
        this.numeroDespacho = numeroDespacho;
    }
    
    
    // Getters and Setters

    public Date getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Date anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "anioIncorporacion=" + (anioIncorporacion.getYear() + 1900) + ", numeroDespacho=" + numeroDespacho + '}';
    }
    
    
    // Metodos
    
    
    public void reasignarDespacho(){
        System.out.println("Diga el nuevo numero de despacho: ");
        setNumeroDespacho(sc.nextInt());
    }
}
