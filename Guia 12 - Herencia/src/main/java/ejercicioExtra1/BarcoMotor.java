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
public class BarcoMotor extends Barco {
    protected Integer caballosFuerza;
    
    // Constructores

    public BarcoMotor() {
    }

    public BarcoMotor(Integer caballosFuerza, Integer matricula, Integer eslora, Date añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.caballosFuerza = caballosFuerza;
    }
    
    
    // Getter and Setter

    public Integer getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(Integer caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "BarcoMotor{" + "caballosFuerza=" + caballosFuerza + '}';
    }
    
    
    
}
