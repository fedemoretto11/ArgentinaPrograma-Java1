/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioExtra1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fedmo
 */
public class Alquiler {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private Integer documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;
    
    
    // Constructores

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    
    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return "Alquiler: \n" + "-Nombre: " + nombre + "\n-Documento: " + documento + "\n-Fecha Alquiler: " + fechaAlquiler + "\n-Fecha devolucion: " + fechaDevolucion + "\n-Posicion amarre: " + posicionAmarre + "\n-Barco: " + barco;
    }
    
    
    // Metodos
    
    public void completarInfo(Barco barco){
        System.out.println("===== Ingreso de datos =====");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su DNI: ");
        documento = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la fecha de inicio de alquiler: ");
        int diaAlquiler = sc.nextInt();
        int mesAlquiler = sc.nextInt();
        int añoAlquiler = sc.nextInt();
        fechaAlquiler = new Date(añoAlquiler - 1900, mesAlquiler - 1, diaAlquiler);
        System.out.println("Ingrese la fecha de inicio de devolucion: ");
        int diaDevolcuion = sc.nextInt();
        int mesDevolcuion = sc.nextInt();
        int añoDevolcuion = sc.nextInt();
        sc.nextLine();
        fechaDevolucion = new Date(añoDevolcuion - 1900, mesDevolcuion - 1, diaDevolcuion);
        System.out.println("Indique la posicion de Amarre: ");
        posicionAmarre = sc.nextLine();
        System.out.println("Elija el barco a alquilar: ");
        setBarco(barco);

    }
    
    public void calcularAlquiler(){
        long dias = (fechaDevolucion.getTime() - fechaAlquiler.getTime()) / 86400000;
        int valorModulo = barco.getEslora() * 10;
        long costoAlquiler = 0;
        
        if (barco instanceof Veleros) {
            Veleros velero = (Veleros) barco;
            valorModulo = valorModulo + velero.getMastiles();
            costoAlquiler = dias * valorModulo;
        }
        
        if (barco instanceof BarcoMotor) {
            BarcoMotor barcoMotor = (BarcoMotor) barco;
            valorModulo = valorModulo + barcoMotor.getCaballosFuerza();
            costoAlquiler = dias * valorModulo;
        }
        
        if (barco instanceof YateLujo) {
            YateLujo yateLujo = (YateLujo) barco;
            valorModulo = valorModulo + yateLujo.getCaballosFuerza() + yateLujo.getCamatores();
            costoAlquiler = dias * valorModulo;   
        }
        
        System.out.println(costoAlquiler);
    }
    
    
}

