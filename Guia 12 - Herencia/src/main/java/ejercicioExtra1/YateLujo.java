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
public final class YateLujo extends BarcoMotor {
    protected Integer camatores;
    
    
    // Constructores

    public YateLujo() {
    }

    public YateLujo(Integer camatores, Integer caballosFuerza, Integer matricula, Integer eslora, Date añoFabricacion) {
        super(caballosFuerza, matricula, eslora, añoFabricacion);
        this.camatores = camatores;
    }
    
    
    // Getter and Setter

    public Integer getCamatores() {
        return camatores;
    }

    public void setCamatores(Integer camatores) {
        this.camatores = camatores;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return super.toString() + "YateLujo{" + "camatores=" + camatores + '}';
    }
    
    
}
