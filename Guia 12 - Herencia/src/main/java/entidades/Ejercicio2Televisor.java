/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;
import superEntidades.Ejercicio2Electrodomestico;

/**
 *
 * @author fedmo
 */
public class Ejercicio2Televisor extends Ejercicio2Electrodomestico{
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private Integer resolucion;
    private Boolean sintonizadorTdt = false;
    
    
    // Constructores

    public Ejercicio2Televisor() {
    }

    public Ejercicio2Televisor(Integer resolucion, String color, Character consumoEnergetico, Double peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
    }
    
    public Ejercicio2Televisor(Integer resolucion, String color, Character consumoEnergetico, Double peso, Boolean sintonizadorTdt) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    
    
    
    // Getters and Setters

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(Boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    
    // To String

    @Override
    public String toString() {
        return super.toString() + "Ejercicio2Televisor{" + "resolucion=" + resolucion + ", sintonizadorTdt=" + sintonizadorTdt + '}';
    }
    
    
    // Metodos
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion: ");
        setResolucion(sc.nextInt());
        sc.nextLine();
        System.out.println("Tiene sintonizador: si/no");
        String sintonizador = sc.nextLine();
        if(sintonizador.toLowerCase().equals("si")) {
            setSintonizadorTdt(true);
        }
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (getResolucion() > 40){
            setPrecio(getPrecio() * 1.3);
        }
        if(getSintonizadorTdt()) {
            setPrecio(getPrecio() + 500);
        }
        
    }
    

    
    
    
}
