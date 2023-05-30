/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author fedmo
 */
public class JugadorEquipo {
    private ArrayList<JugadorJugador> jugadores;
    
    public JugadorEquipo() {
        jugadores = new ArrayList();
    }
    
    public void agregarJugador(JugadorJugador jugador){
        jugadores.add(jugador);
    }
    
    public void mostrarJugadores(){
        for(JugadorJugador jugador : jugadores){
             System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Apellido: " + jugador.getApellido());
            System.out.println("Posición: " + jugador.getPosicion());
            System.out.println("Número: " + jugador.getNumero());
            System.out.println("------------------------");
        }
    }

    @Override
    public String toString() {
        return "JugadorEquipo{" + "jugadores=" + jugadores + '}';
    }
    
}



