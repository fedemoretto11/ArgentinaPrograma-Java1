/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author fedmo
 */
public class AhorcadoService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    
    // CARGAR PALABRA AL VECTOR
    
    public char[] cargarPalabra(){
        System.out.println("Ingrese una palabra a adivinar: ");
        String palabra = sc.nextLine().toLowerCase();
        
        char[] palabraSeparada = new char[palabra.length()];
        for(int i = 0; i < palabra.length(); i++){
            palabraSeparada[i] = palabra.charAt(i);
        }
        
        return palabraSeparada;
    }
    
    
    
    // CREAR JUEGO UTILIZANDO METODO cargarPalabra()
    
    public Ahorcado crearJuego(){
        char[] palabra = cargarPalabra();
        System.out.println("Ingrese la cantidad de jugadas maximas: ");
        int jugadas = sc.nextInt();
        sc.nextLine();
        return new Ahorcado(palabra, 0, jugadas);
    }
    
    
    
    // DEVUELVE LONGITUD PALABRA
    
    public int longitud(Ahorcado juego){
        return juego.getPalabra().length;
    }
    
    
    
    // BUSCA SI LA LETRA ESTA NO NO EN LA PALABRA (NO DEVUELVE NADA)
    
    public void buscar(Ahorcado juego, char letra){
        char[] palabra = juego.getPalabra();
        boolean letraEncontrada = false;
        for(int i = 0; i < palabra.length; i++) {
            if (Character.toLowerCase(palabra[i]) == Character.toLowerCase(letra)){
                letraEncontrada = true;
            }
        }
        if(letraEncontrada){
            System.out.println("Letra encontrada");
        } else {
            System.out.println("Letra no encontrada");
        }
    }
    
    
    
    // BUSCA SI LA LETRA ESTA NO NO EN LA PALABRA (DEVUELVE BOOLEAN)
    
    public boolean encontradas(Ahorcado juego, char letra) {
        char[] palabra = juego.getPalabra();
        boolean letraEncontrada = false;
        
        for(int i = 0; i < palabra.length; i++) {
            if (Character.toLowerCase(palabra[i]) == Character.toLowerCase(letra)){
                juego.setletrasEncontradas(juego.getLetrasEncontradas() + 1);
                letraEncontrada = true;
            }
        }
        
        return letraEncontrada;
    }
    
    
    
    // RESTA CANTIDAD DE INTENTOS RESTANTES POR CADA FALLO
    
    public int intentos(Ahorcado juego, char letra){
        if(encontradas(juego, letra) == false){
            juego.setJugadasMaximass(juego.getJugadasMaximas() - 1);
        }
        return juego.getJugadasMaximas();
    }
  
    
    
    // MUESTRA RESULTADO PROVISORIO (CON ASTERISCOS EN LETRAS NO ACERTADAS)
    
    public void mostrar(Ahorcado juego, char letra){
        char[] palabra = juego.getPalabra();
        char[] palabraMostrar = new char[longitud(juego)];
        
        
        for (int i = 0; i < longitud(juego); i++){
            if(encontradas(juego,  letra) == false){
                palabraMostrar[i] = '*';
                
            } else {
                palabraMostrar[i] = palabra[i];
            }
        }
        
        System.out.println(new String(palabraMostrar));
        
    }
    
    
    
    
    // COMPILA TODO EL JUEGO
    
    public void juego(Ahorcado juego){
        char letraBuscar;
        int intentos;
        int ronda = 1;
        
        do {
            System.out.println("-----Ronda " + ronda + "-----");
            System.out.println("Ingrese una letra a buscar: ");
            letraBuscar = sc.next().charAt(0);
            
            buscar(juego, letraBuscar);
            intentos = intentos(juego,letraBuscar);
            System.out.println("Intentos restantes: " + intentos);
            
            System.out.println("Letras encontradas: " + juego.getLetrasEncontradas() + " // Letras restantes: " + (longitud(juego) - juego.getLetrasEncontradas()));
            
            mostrar(juego,letraBuscar);
            
            ronda++;
            System.out.println("");
            if (juego.getLetrasEncontradas() == longitud(juego)){
                System.out.println("Ha descubierto la palabra!");
                System.out.println("-----Resultados-----");
                System.out.println("Palabra: " + new String(juego.getPalabra()).toUpperCase());
                break;
                
            }
            
        } while(intentos > 0);
    }
    
    
    
}
