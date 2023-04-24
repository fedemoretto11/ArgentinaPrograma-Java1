/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Rectangulo {
    private int base;
    private int altura;

    
    // Constructores
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    
    // Getter
    
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    
    // Setter
    
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    // Metodos

    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        setBase(sc.nextInt());
        System.out.println("Ingrese la alutra");
        setAltura(sc.nextInt());
    }
    
    public double calcularSuperficie(){
        return base * altura;
    }
    
    public double calcularPerimeto(){
        return (base * altura) * 2;
    }
    
}


