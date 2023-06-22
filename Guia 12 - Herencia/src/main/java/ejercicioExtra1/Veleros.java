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
public class Veleros extends Barco {
    protected Integer mastiles;

    
    // Constructores
    
    public Veleros() {
    }

    public Veleros(Integer mastiles, Integer matricula, Integer eslora, Date añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }
    
    
    // Getters and Setters

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    
    // To String

    @Override
    public String toString() {
        return super.toString() + "Veleros{" + "mastiles=" + mastiles + '}';
    }
    
    
    
    
}
