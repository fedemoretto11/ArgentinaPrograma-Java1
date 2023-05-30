/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fedmo
 */
public class Ejercicio3Baraja {
    private Integer num;
    private String palo;
    private ArrayList<Ejercicio3Baraja> salieron = new ArrayList();

    public Ejercicio3Baraja() {
    }

    public Ejercicio3Baraja(Integer num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public ArrayList<Ejercicio3Baraja> getSalieron() {
        return salieron;
    }
    
    

    @Override
    public String toString() {
        return "\n" + num + " de " + palo;
    }

    
    
    
    
    // METODOS
    
    public void crearBaraja(ArrayList<Ejercicio3Baraja> baraja){
        for (int i = 1; i <= 12; i++) {
            if(i != 8 && i != 9){
                baraja.add(new Ejercicio3Baraja(i,"Espada"));
                baraja.add(new Ejercicio3Baraja(i,"Basto"));
                baraja.add(new Ejercicio3Baraja(i,"Copa"));
                baraja.add(new Ejercicio3Baraja(i,"Oro"));
            }
        }
    }
    
    public void barajar(ArrayList<Ejercicio3Baraja> baraja){
        Collections.shuffle(baraja);
    }
    
    public Ejercicio3Baraja siguienteCarta(ArrayList<Ejercicio3Baraja> baraja) {
        Ejercicio3Baraja carta = baraja.get(0);
        salieron.add(carta);
        baraja.remove(0);
        return baraja.get(0);
    }
    
    public int cartasDisponibles(ArrayList<Ejercicio3Baraja> baraja){
        return baraja.size();
    }
    
    public void darCartas(ArrayList<Ejercicio3Baraja> baraja, int cartas){
        if (baraja.size() - cartas < 0) {
            System.out.println("Cartas insuficientes");
        } else {
            for (int i = 0; i < cartas; i++) {
                Ejercicio3Baraja carta = baraja.get(0);
                salieron.add(carta);
                baraja.remove(0);
            }
        }
    }
    
    public void cartasMonton(){
        System.out.println(salieron);
    }
    
    public void mostrarBaraja(ArrayList<Ejercicio3Baraja> baraja) {
        System.out.println(baraja);
    }
    
    
    
}
