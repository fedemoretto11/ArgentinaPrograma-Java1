/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Ejercicio2RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Ejercicio2RevolverDeAgua() {
    }

    public Ejercicio2RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Ejercicio2RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    // Metodos
    
    public void llenarRevolver(){
        setPosicionActual((int) (Math.random () * 7) + 1);
        setPosicionAgua((int) (Math.random () * 7) + 1);
    }
    
    public boolean mojar(){
        return getPosicionActual() == getPosicionAgua(); 
    }
    
    public void siguienteChorro(){
        if (getPosicionActual() == 7) {
            setPosicionActual(0);
        } else {
            setPosicionActual(getPosicionActual() + 1);
        }
    }
}
