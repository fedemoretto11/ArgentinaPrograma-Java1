/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.Ejercicio3Baraja;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio3 {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Ejercicio3Baraja mazo = new Ejercicio3Baraja();
        ArrayList<Ejercicio3Baraja> baraja1 = new ArrayList();

        mazo.crearBaraja(baraja1);
        mazo.barajar(baraja1);
        
        mazo.mostrarBaraja(baraja1);
        System.out.println(mazo.cartasDisponibles(baraja1));      
        
        System.out.println("Ingrese las cartas a repartir: ");
        int cartas = sc.nextInt();
        mazo.darCartas(baraja1, cartas);
        System.out.println("Se reparten las cartas");
        System.out.println("");
        mazo.mostrarBaraja(baraja1);
        mazo.cartasMonton();
        System.out.println("Se reparte una carta extra");
        System.out.println("");
        mazo.siguienteCarta(baraja1);
        mazo.mostrarBaraja(baraja1);
        mazo.cartasMonton();
        System.out.println("Se reparte una carta extra");
        System.out.println("");
        mazo.siguienteCarta(baraja1);
        mazo.mostrarBaraja(baraja1);
        mazo.cartasMonton();






    }
}
