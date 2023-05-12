package main;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import service.perroService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fedmo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        perroService veterinaria = new perroService();
        ArrayList<Perro> razaPerros = new ArrayList();
        
        veterinaria.agregarPerro(razaPerros);
        veterinaria.mostrarLista(razaPerros);
        
    }
    
}
