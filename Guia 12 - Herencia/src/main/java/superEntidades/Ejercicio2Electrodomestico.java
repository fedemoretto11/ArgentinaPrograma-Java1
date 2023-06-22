/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superEntidades;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio2Electrodomestico {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    protected Double precio = 1000.00;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    
    // Constructores
    
    public Ejercicio2Electrodomestico() {
    }

    public Ejercicio2Electrodomestico(String color, Character consumoEnergetico, Double peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    
    // Getters and Setters

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
    // To String
    
    @Override
    public String toString() {
        return "Ejercicio2Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }


    
    
    // Metodos
    protected void comprobarConsumoEnergetica(char letra){
        switch (letra){
            case 'a':
            case 'A':
                setConsumoEnergetico('A');
                break;
            case 'b':
            case 'B':
                setConsumoEnergetico('B');
                break;
            case 'c':
            case 'C':
                setConsumoEnergetico('C');
                break;
            case 'd':
            case 'D':
                setConsumoEnergetico('D');
                break;
            case 'e':
            case 'E':
                setConsumoEnergetico('E');
                break;
            default:
                setConsumoEnergetico('F');
                break;
        }
    }
    
    
    protected void comprobarColor(String color){
        switch (color.toLowerCase()){
            case "negro":
                setColor("Negro");
                break;
            case "rojo":
                setColor("Rojo");
                break;
            case "azul":
                setColor("Azul");
                break;
            case "gris":
                setColor("Gris");
                break;
            default:
                setColor("Blanco");
                break;
        }
    }
    
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el color: ");
        String color = sc.nextLine();
        setColor(color);
        comprobarColor(color);
        System.out.println("Ingrese el consumo: ");
        char consumo = sc.nextLine().charAt(0);
        setConsumoEnergetico(consumo);
        comprobarConsumoEnergetica(consumo);
        System.out.println("Ingrese el peso: ");
        setPeso(sc.nextDouble());
        sc.nextLine();
    }
    

    public void precioFinal(){
        double peso = getPeso();
        switch (getConsumoEnergetico()){
            case 'a':
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'b':
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'c':
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'd':
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'e':
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'f':
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
        }
        if (peso >= 1 && peso < 20){
            setPrecio(getPrecio() + 100);
        }
        else if (peso >= 20 && peso < 50){
            setPrecio(getPrecio() + 500);
        }
        else if (peso >= 50 && peso < 80){
            setPrecio(getPrecio() + 800);
        } else {
            setPrecio(getPrecio() + 1000);
        } 
    }
}
