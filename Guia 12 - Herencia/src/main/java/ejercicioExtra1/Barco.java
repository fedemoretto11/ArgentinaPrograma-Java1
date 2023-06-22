/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra1;

import java.util.Date;

/**
 *
 * @author fedmo
 */
public abstract class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected Date añoFabricacion;

    
    
    // Constuctores
    
    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Date añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }
    
    
    // Getters and Setters

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
    // To String

    @Override
    public String toString() {
        return "\n--matricula: " + matricula + "\n--eslora: " + eslora + "\n--añoFabricacion: " + añoFabricacion;
    }
    
    
    
    
}
