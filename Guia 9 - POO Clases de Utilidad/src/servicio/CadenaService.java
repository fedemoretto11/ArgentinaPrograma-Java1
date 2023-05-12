/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cadena;

/**
 *
 * @author fedmo
 */
public class CadenaService {
    
    
    public int mostrarVocales(Cadena cadena){
        int vocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }
        }
        return vocales;
    }
    
    public String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--){
            fraseInvertida += cadena.getFrase().charAt(i);
        }
        return fraseInvertida;
    }
    
    public void vecesRepetido(Cadena cadena, char letra){
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().toLowerCase().charAt(i) == letra) {
            contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces en la frase.");
    }
        
    public void compararLongitud(Cadena cadena, Cadena cadena2){
        if (cadena.getLongitud() > cadena2.getLongitud()){
            System.out.println("La frase 1 (" + cadena.getFrase() + ") es mas larga que la cadena 2 (" + cadena2.getFrase() + ") por " + (cadena.getLongitud() - cadena2.getLongitud()) + " caracteres");
        } 
        else if (cadena2.getLongitud() > cadena.getLongitud()) {
            System.out.println("La frase 2 (" + cadena2.getFrase() + ") es mas larga que la cadena 1 (" + cadena.getFrase() + ") por " + (cadena2.getLongitud() - cadena.getLongitud()) + " caracteres");
        } else {
            System.out.println("La frases tienen la misma longitud");
        }
    }
    
    public String unirFrases(Cadena cadena, Cadena cadena2) {
        return cadena.getFrase() + cadena2.getFrase();
    }
        
    public String reemplazar(Cadena cadena, char letra) {
        String reemplazo = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().toLowerCase().charAt(i) == 'a') {
                reemplazo += letra;
            } else {
                reemplazo += cadena.getFrase().charAt(i);
            }
        }
        return reemplazo;
    }
    
    public boolean  contiene(Cadena cadena, char letra){
        return cadena.getFrase().toLowerCase().contains(String.valueOf(letra));
    }
}
