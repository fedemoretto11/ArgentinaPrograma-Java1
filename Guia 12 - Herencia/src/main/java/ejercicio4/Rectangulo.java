/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author fedmo
 */
public class Rectangulo implements calculosFormas {
    
    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
        
        
    @Override
    public void calcularArea() {
        System.out.println("Area rectangulo = " + base * altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro rectangulo = " + (base + altura) * 2);
    }
    
}


// Área rectángulo: base * altura  
// Perímetro rectángulo: (base + altura) * 2.