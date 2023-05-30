/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Ejercicio2Juego {
    private ArrayList<Ejercicio2Jugador> jugadores = new ArrayList();
    private Ejercicio2RevolverDeAgua revolver;

    public Ejercicio2Juego() {
    }

    public Ejercicio2Juego(Ejercicio2RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Ejercicio2Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Ejercicio2Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Ejercicio2RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(Ejercicio2RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    // METODOS
    
    public void llenarJuego(ArrayList<Ejercicio2Jugador> player ,Ejercicio2RevolverDeAgua revo){
        jugadores = player;
        revolver = revo;
    }
    
    public boolean ronda(int i){
        boolean juegoSigue = true;
        jugadores.get(i).disparo(revolver);
        if (jugadores.get(i).isMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;
    }

    @Override
    public String toString() {
        return "Ejercicio2Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    
    
}
