/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Nif;
import servicio.NifService;

/**
 *
 * @author fedmo
 */
public class Extra2 {
    public static void main(String[] args) {
        NifService anses = new NifService();
        Nif nif1 = anses.crearNif();
        anses.mostrar(nif1);
        
        
    }
}
