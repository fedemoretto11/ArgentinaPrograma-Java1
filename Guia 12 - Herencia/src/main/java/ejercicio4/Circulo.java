/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author fedmo
 */
public class Circulo implements calculosFormas{
    protected Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area circulo = " + PI * (radio * radio));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro circulo = " + PI * (radio * 2));
    }
    
    
}




// Área Circulo: PI * radio ^ 2 
// Perímetro Circulo: PI * diámetro.