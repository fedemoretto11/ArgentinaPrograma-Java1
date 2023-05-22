/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class productosService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Productos crearProducto(){
        System.out.println("===== CREADOR DE PRODUCTOS =====");
        System.out.println("Ingrese el producto: ");
        String producto = sc.nextLine();
        System.out.println("Ingrese el precio: ");
        Double precio = sc.nextDouble();
        sc.nextLine();      
        return new Productos(producto, precio);
    }
    
    public void agregarProducto(HashMap<String, Double> productos){
        boolean salir   = false;
        String rta;
        
        do {
        Productos producto = crearProducto();
        String nombreProducto = producto.getNombre();
        Double precioProducto = producto.getPrecio();
        productos.put(nombreProducto, precioProducto);
        System.out.println("Desea ingresar otro producto? (s/n)");
        salir = !validarRta().equals("s"); 
        } while (!salir);
    }
    
    public String validarRta(){
        String rta;
        rta = sc.nextLine();
        while (!rta.toLowerCase().equals("s") && !rta.toLowerCase().equals("n")) {
            System.out.println("Caracter invalido, ingrese nuevamente si desea cargar otro producto: ");
            rta = sc.nextLine();
        }
        
        return rta;
    }
    
    public void imprimirProductos(HashMap<String, Double> productos){
        System.out.println("--- LISTA DE PRODUCTOS ---");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String producto = entry.getKey();
            Double precio = entry.getValue();
            System.out.println("Producto: " + producto);
            System.out.println("Precio: $" + precio);
            System.out.println("");
        }
    }
    
    public void modificarPrecio(HashMap<String, Double> productos){
        System.out.println("===== MODIFICADOR DE PRECIOS =====");
        System.out.println("Indique el producto a modificar el precio");
        String producto = sc.nextLine();
        System.out.println("Indique el nuevo precio");
        Double precio = sc.nextDouble();
        sc.nextLine();
        productos.put(producto,precio);      
        
    }
    
    public void eliminarProducto(HashMap<String, Double> productos){
        System.out.println("===== ELIMINAR PRODUCTO =====");
        System.out.println("Ingrese el producto a eliminar");
        String producto = sc.nextLine();
        productos.remove(producto);
    }
}
