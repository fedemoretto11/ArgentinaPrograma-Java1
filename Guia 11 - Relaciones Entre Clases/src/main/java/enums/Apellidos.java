/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author fedmo
 */
public enum Apellidos {
    RAMIREZ("Ramirez"),
    MORETTO("Moretto"),
    PAULSEN("Paulsen"),
    ALBAITERO("Albaitero"),
    GARCIA("Garcia"),
    PARUOLO("Paruolo");
    
    
    private String apellido;
    
    private Apellidos(String apellido){
        this.apellido = apellido;
        
    }

    public String getApellido() {
        return apellido;
    }

    
    
}
