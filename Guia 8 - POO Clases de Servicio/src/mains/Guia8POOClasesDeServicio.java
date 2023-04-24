/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mains;

import entidades.Persona;
import servicio.PersonaService;

/**
 *
 * @author fedmo
 */
public class Guia8POOClasesDeServicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService p = new PersonaService();
        Persona p1 = p.crearPersona();
        p.mostrarPersona(p1);
        
        
        
    }
    
}
