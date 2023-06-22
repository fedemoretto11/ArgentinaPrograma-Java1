/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author fedmo
 */
public class Extra3Vehiculos {
    private String marca;
    private String modelo;
    private Integer año;
    private Integer numeroMotor;
    private Integer chasis;
    private String color;
    private String tipo;
    
    // Constructor 

    public Extra3Vehiculos() {
    }

    public Extra3Vehiculos(String marca, String modelo, Integer año, Integer numeroMotor, Integer chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }
    
    
}

