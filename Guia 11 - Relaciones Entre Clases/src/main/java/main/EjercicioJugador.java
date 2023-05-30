/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidades.JugadorEquipo;
import entidades.JugadorJugador;

/**
 *
 * @author fedmo
 */
public class EjercicioJugador {
    public static void main(String[] args) {
        JugadorEquipo equipo = new JugadorEquipo();
        
        JugadorJugador jugador1 = new JugadorJugador("Federico", "Moretto", "Delantero", 11);
        JugadorJugador jugador2 = new JugadorJugador("Liones", "Messi", "Delantero", 10);
        JugadorJugador jugador3 = new JugadorJugador("Cristian", "Romero", "Defensor", 24);
        
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        
        equipo.mostrarJugadores();
        System.out.println(equipo);



        
        
    }
}
