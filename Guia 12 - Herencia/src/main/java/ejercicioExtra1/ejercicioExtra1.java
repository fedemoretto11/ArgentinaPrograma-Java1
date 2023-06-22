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
public class ejercicioExtra1 {
    public static void main(String[] args) {
        Veleros velero1 = new Veleros(4, 12435, 12, new Date(98,12,12));
        BarcoMotor motor1 = new BarcoMotor(350,12546, 9, new Date(94,6,4));
        YateLujo lujo1 = new YateLujo(8, 1200, 83463, 23, new Date(112,9,12));
        Alquiler alquiler1 = new Alquiler();
        
        alquiler1.completarInfo(lujo1);
        System.out.println(alquiler1);
        alquiler1.calcularAlquiler();
        
        
        

    }
}


//velero => Integer mastiles, Integer matricula, Integer eslora, Date añoFabricacion
//motor => Integer caballosFuerza, Integer matricula, Integer eslora, Date añoFabricacion
//lujo => Integer camatores, Integer caballosFuerza, Integer matricula, Integer eslora, Date añoFabricacion