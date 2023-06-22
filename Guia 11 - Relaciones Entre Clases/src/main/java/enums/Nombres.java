package enums;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author fedmo
 */
public enum Nombres {
    JUAN("Juan"),
    FEDERICO("Federico"),
    MARIA("Maria"),
    MICAELA("Micaela"),
    EMILIANO("Emiliano"),
    PEDRO("Pedro");
    
    
    private String nombre;
    
    private Nombres(String nombre){
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
