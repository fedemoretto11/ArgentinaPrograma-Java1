package main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fedmo
 */
public class EjercicioEjemplo1 {
    public static void main(String[] args) {
        
        
        
        System.out.println("=====ARRAY LIST=====");
        // Crear ArrayList
        ArrayList<Integer> numerosArrayList = new ArrayList();
        
        // Asignarle valor a las ArrayList
        int x = 20;
        numerosArrayList.add(x);
        numerosArrayList.add(10);
        numerosArrayList.add(15);
        numerosArrayList.add(20);
        numerosArrayList.add(5);
        numerosArrayList.add(8);
        
        // Recorrer con iterator
        Iterator iterator = numerosArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " iterador ");
        }
        // Imprime todo, la salida es todo entre corchetes
        System.out.println("Original " + numerosArrayList);
        
        // Sirve para ordernar
        Collections.sort(numerosArrayList);
        
        System.out.println("Ordenados: " + numerosArrayList);


        // Imprimir con forEach
        for (Integer numero : numerosArrayList) {
            System.out.println("numerosArrayList: " + numero);
        }
        System.out.println("");
        System.out.println("");

        
        
        
        
        
        
        
        
        System.out.println("=====CONJUNTOS=====");
        
        // Crear Conjunto
        HashSet<Integer> numerosConjuntos = new HashSet();
        
        // Asginarle valor al conjunto
        int y = 20;
        numerosConjuntos.add(y);
        numerosConjuntos.add(10);
        numerosConjuntos.add(15);
        numerosConjuntos.add(20);
        numerosConjuntos.add(5);
        numerosConjuntos.remove(20);
        numerosConjuntos.add(8);
        numerosConjuntos.add(2);
        numerosConjuntos.add(1);
        numerosConjuntos.add(7);
       
        
        // Recorrer con iterator
        // Aca vemos que para que se pueda eliminar un valor hay que asignarle un tipo al iterador, sino te quedan tipos disintos ya que sin asignarle uno queda como tipo Objeto y no Integer como este caso, por lo tanto a la hora de eliminar son incopatibles
        Iterator<Integer> it = numerosConjuntos.iterator();
        
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
//            System.out.println(it.next() + " numero con iterador");
        }
        
        // Imprime todo, la salida es todo entre corchetes
        System.out.println("Original " + numerosConjuntos);
        
        // Para ordenar
        ArrayList<Integer> conjutnoLista = new ArrayList(numerosConjuntos);
        Collections.sort(conjutnoLista);
        
        System.out.println("Ordenados " + conjutnoLista);

        // Recorrer con un forEach
        for (Integer numero2 : numerosConjuntos) {
            System.out.println("numerosConjuntos: " + numero2);
        }
        
        System.out.println("");
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("====MAPS====");
        
        // Creacion de un Map (seria un objeto en JS)
        
        HashMap<Integer, String> alumnos = new HashMap();
        
        // Asignarle valor al map, siempre key y valor
        int dni = 38437001;
        String nombre = "Federico";
        alumnos.put(dni, nombre);
        alumnos.put(38437002, "Martin");
        alumnos.put(38437003, "Pedro");
        alumnos.put(38437004, "Pepe");
        alumnos.put(38437005, "Juan");
        alumnos.put(38437006, "Rama");
        alumnos.remove(38437005);
        
        // Imprime todo, la salida es todo entre corchetes
        System.out.println(alumnos);
        
        
        
        // Recorrer con un For Each, se utiliza el metodo Entry
        for(Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + "\nNombre: " + entry.getValue() + "\n");
        }
        
        
        
    }
}
