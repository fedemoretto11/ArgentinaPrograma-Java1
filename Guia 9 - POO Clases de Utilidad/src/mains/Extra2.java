/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Ahorcado;
import servicio.AhorcadoService;

/**
 *
 * @author fedmo
 */
public class Extra2 {
    public static void main(String[] args) {

        AhorcadoService casino = new AhorcadoService();
        Ahorcado juego1 = casino.crearJuego();
        
        casino.juego(juego1);
 
    }
}
