/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class NifService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Nif crearNif(){   
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Ingrese el numero de DNI: ");
        long dni = sc.nextLong();
        int resto = (int) dni % 23;
        char letra = letras[resto];
        return new Nif(dni,letra);
    }
    
    public void mostrar(Nif nif){
        System.out.println("Numero NIF: "+nif.getDni()+ "-"+nif.getLetter());
        System.out.println(nif.getDni() % 23);
    }
  
}
