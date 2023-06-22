/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra2;

/**
 *
 * @author fedmo
 */
public class EdificioDeOficina extends Edificio {
    private Integer cantidadOficinas;
    private Integer cantidadPersonasOficina;
    private Integer pisos;

    
    // Constructores

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(Integer cantidadOficinas, Integer cantidadPersonasOficina, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.cantidadOficinas = cantidadOficinas;
        this.cantidadPersonasOficina = cantidadPersonasOficina;
        this.pisos = pisos;
    }
    
    
    // Getters and Setters

    public Integer getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(Integer cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    public Integer getCantidadPersonasOficina() {
        return cantidadPersonasOficina;
    }

    public void setCantidadPersonasOficina(Integer cantidadPersonasOficina) {
        this.cantidadPersonasOficina = cantidadPersonasOficina;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return super.toString() + "EdificioDeOficina{" + "cantidadOficinas=" + cantidadOficinas + ", cantidadPersonasOficina=" + cantidadPersonasOficina + ", pisos=" + pisos + '}';
    }
    
    
    
    
    // Metodos

    @Override
    public Integer calcularSuperficie() {
        return super.alto * super.ancho * pisos;
    }

    @Override
    public Integer calcularVolumen() {
        return super.alto * super.ancho * super.largo * pisos;
    }
    
    public void cantPersonas(){
        Integer personasPorPiso = cantidadOficinas * cantidadPersonasOficina;
        Integer personasEdificio = personasPorPiso * pisos;  
        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en el edificio: " + personasEdificio);

    }
    
    

}
