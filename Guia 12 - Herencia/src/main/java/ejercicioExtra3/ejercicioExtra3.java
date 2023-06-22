/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra3;

import java.util.ArrayList;


/**
 *
 * @author fedmo
 */
public class ejercicioExtra3 {
    public static void main(String[] args) {
        
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        
        Hotel4Estrellas hotel4 = new Hotel4Estrellas('A',"PipiCucu",43, 123, 246, 9, "Alto Hotel","Av. Siempreviva 742", "Sprigfield", "Homero");
        Hotel5Estrellas hotel5 = new Hotel5Estrellas(2,2,2,'A',"PipiCucu",43, 123, 246, 9, "Bajo Hotel","Av. Siempreviva 742", "Sprigfield", "Homero");
        Residencia resi = new Residencia(12,false,true,true,425,"La Residencia Feliz", "Uruguay 14", "Punta Arenas", "Ramon");
        Camping camp = new Camping(20, 8, true, false, 220, "Tu Camping ATR", "El lago 19", "Gualeguay", "Esteban");
        

        
        
        alojamientos.add(hotel4);
        alojamientos.add(hotel5);
        alojamientos.add(resi);
        alojamientos.add(camp);

        
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
            System.out.println("");
        }

        
    }
}


