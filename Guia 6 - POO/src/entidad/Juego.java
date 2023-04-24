/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Juego {
    private int intentosMaximos;
    private int ganadasJugador1;
    private int ganadasJugador2;

    public Juego(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
        this.ganadasJugador1 = 0;
        this.ganadasJugador2 = 0;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Jugador 1, elige un número entre 1 y 100:");
            int numeroAdivinar = scanner.nextInt();
            int intentosRestantes = intentosMaximos;

            System.out.println("Jugador 2, tienes " + intentosRestantes + " intentos para adivinar el número.");

            while (intentosRestantes > 0) {
                System.out.println("Introduce tu intento:");
                int intento = scanner.nextInt();

                if (intento == numeroAdivinar) {
                    System.out.println("¡Correcto! Has adivinado el número en " + (intentosMaximos - intentosRestantes + 1) + " intentos.");
                    ganadasJugador2++;
                    break;
                } else if (intento < numeroAdivinar) {
                    System.out.println("El número a adivinar es más alto.");
                } else {
                    System.out.println("El número a adivinar es más bajo.");
                }

                intentosRestantes--;
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            }

            if (intentosRestantes == 0) {
                System.out.println("Lo siento, no has adivinado el número. El número a adivinar era " + numeroAdivinar + ".");
                ganadasJugador1++;
            }

            System.out.println("¿Quieres jugar otra vez? (s/n)");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("El juego ha terminado. Jugador 1 ha ganado " + ganadasJugador1 + " veces y Jugador 2 ha ganado " + ganadasJugador2 + " veces.");
    }
}

