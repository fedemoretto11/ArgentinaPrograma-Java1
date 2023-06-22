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
public class Ejercicio2Lavadora extends Ejercicio2Electrodomestico {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    protected Integer carga;
    
    
    // Constructores

    public Ejercicio2Lavadora() {
    }

    public Ejercicio2Lavadora(Integer carga, String color, Character consumoEnergetico, Double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    
    // Getters and Setters

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    
    // To String

    @Override
    public String toString() {
        return super.toString() + "Ejercicio2Lavadora{" + "carga=" + carga + '}';
    }

    
    // Metodos
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        setCarga(sc.nextInt());
        sc.nextLine();
        precioFinal();
    }
    
    
    
    
    @Override   // Chequear si es necesario el override en estos casos
    public void precioFinal(){
        super.precioFinal();
        if (getCarga() > 30){
            setPrecio(getPrecio() + 500);
        }
    }
    
}
