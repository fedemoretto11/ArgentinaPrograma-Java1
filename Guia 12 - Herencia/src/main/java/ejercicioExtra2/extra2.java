/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra2;

import java.util.ArrayList;

/**
 *
 * @author fedmo
 */
public class extra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        int techado = 0;
        int abierto = 0;
        Polideportivo poli1 = new Polideportivo("Poli 1", true, 45, 7, 50);
        Polideportivo poli2 = new Polideportivo("Poli 2", false, 50, 1, 70);
        EdificioDeOficina ofi1 = new EdificioDeOficina(12, 6, 5, 20, 36, 12);
        EdificioDeOficina ofi2 = new EdificioDeOficina(8, 4, 2, 25, 9, 30);

        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(ofi1);
        edificios.add(ofi2);

        for (Edificio edificio : edificios) {
            System.out.println("");
            System.out.println(edificio.calcularSuperficie() + " m2");
            System.out.println(edificio.calcularVolumen() + " m3");
            if (edificio instanceof EdificioDeOficina) {
                ((EdificioDeOficina) edificio).cantPersonas();
            }
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).getTechado() == true) {
                    techado = techado + 1;
                } else if (((Polideportivo) edificio).getTechado() == false) {
                    abierto = abierto + 1;
                }
                System.out.println("Abierto: " + abierto + "\nTechado: " + techado);
            }

        }

    }
}
