/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author fedmo
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(5.0, 2.0);
        Circulo circ = new Circulo(1.5);
        
        rec.calcularArea();
        rec.calcularPerimetro();
        circ.calcularArea();
        circ.calcularPerimetro();
        
        
    }
}
