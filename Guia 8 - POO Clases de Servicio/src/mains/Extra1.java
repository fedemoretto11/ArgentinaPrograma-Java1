/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Raices;
import servicio.RaicesServicio;

/**
 *
 * @author fedmo
 */
public class Extra1 {
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        Raices raiz1 = rs.crearRaiz();
        rs.calcular(raiz1);
    }
}
