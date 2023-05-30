/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.PersonaDNI;
import entidades.PersonaPersona;

/**
 *
 * @author fedmo
 */
public class EjercicioPersona {

    public static void main(String[] args) {
        PersonaDNI documento = new PersonaDNI();
        documento.setSerie('A');
        documento.setNumero(38437001);
        PersonaPersona persona1 = new PersonaPersona();
        persona1.setNombre("Federico");
        persona1.setApellido("Moretto");
        persona1.setDocumento(documento);
        
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("DNI: " + persona1.getDocumento().getSerie() + "-" + persona1.getDocumento().getNumero());




    }
}
