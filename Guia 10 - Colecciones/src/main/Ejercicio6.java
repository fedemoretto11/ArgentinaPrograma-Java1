/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.HashMap;
import java.util.Scanner;
import service.productosService;

/**
 *
 * @author fedmo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, Double> mapaProductos = new HashMap();
        productosService empresa = new productosService();
        
        menu(empresa, mapaProductos);
    }
    
    
    public static void menu(productosService empresa, HashMap<String, Double> mapaProductos){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        int opcion;
        
        
        while(!salir){
            System.out.println("===== BIENVENIDOS =====");
            System.out.println("Menu");
            System.out.println("1 - Agregar Producto");
            System.out.println("2 - Ver Productos");
            System.out.println("3 - Modificar Precio");
            System.out.println("4 - Eliminar Producto");
            System.out.println("5 - Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    empresa.agregarProducto(mapaProductos);
                    break;
                case 2:
                    empresa.imprimirProductos(mapaProductos);
                    break;
                case 3:
                    empresa.modificarPrecio(mapaProductos);
                    break;
                case 4:
                    empresa.eliminarProducto(mapaProductos);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrse una opcion valida: ");
                    opcion = sc.nextInt();
                    break;
            }
        }
        
        
    }
}
