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
        System.out.println("Ingrese el numero de DNI: ");
        long dni = sc.nextLong();
        char letra = 'a';
        int resto = (int) dni % 23;
        while(letra == 'a')
        switch (resto){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                System.out.println("Letra no encontrada");
                letra = 'a';
                break;
        }
        
        return new Nif(dni,letra);

    }
    
    public void mostrar(Nif nif){
        System.out.println("Numero NIF: "+nif.getDni()+ "-"+nif.getLetter());
        System.out.println(nif.getDni() % 23);
    }


    
}
