/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author fedmo
 */
public class Extra3Cuotas {
    private Integer numeroCuota;
    private Double montoTotalCuota;
    private Boolean estaPaga;
    private Date fechaVencimiento;
    private String formaDePago;
    
    
    // Constructos

    public Extra3Cuotas() {
    }

    public Extra3Cuotas(Integer numeroCuota, Double montoTotalCuota, Boolean estaPaga, Date fechaVencimiento, String formaDePago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPaga = estaPaga;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }
    
    
}


