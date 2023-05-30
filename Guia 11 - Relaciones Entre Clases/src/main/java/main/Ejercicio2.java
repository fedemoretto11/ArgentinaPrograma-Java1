package main;

import entidades.Ejercicio2Juego;
import entidades.Ejercicio2Jugador;
import entidades.Ejercicio2RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fedmo
 */
public class Ejercicio2 {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ArrayList<Ejercicio2Jugador> jugadores = new ArrayList();
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantJugadores = sc.nextInt();
        if (cantJugadores < 1 || cantJugadores > 6) {
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            Ejercicio2Jugador jugador = new Ejercicio2Jugador(i + 1);
            jugadores.add(jugador);
        }
        
        System.out.println("Inicar juego: ");
        Ejercicio2RevolverDeAgua r = new Ejercicio2RevolverDeAgua();
        r.llenarRevolver();
        
        System.out.println("Revolver cargado. Se da inicio al juego");
        Ejercicio2Juego juego = new Ejercicio2Juego();
        juego.llenarJuego(jugadores, r);
        
        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {
            if (turno == (cantJugadores)){
                turno = 0;
            }
            System.out.println("El " + juego.getJugadores().get(turno).getNombre() + " tira");
            juegoSigue = juego.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + juego.getJugadores().get(turno).getNombre() + " zafa");
            } else {
                System.out.println("El " + juego.getJugadores().get(turno).getNombre() + " fue mojado");
                System.out.println("GAME OVER");
            }
            turno++;
        }
        System.out.println("");
        sc.close();
    }
    
}
