/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author fedmo
 */
public class Extra4Voto {
    private Extra4Alumno alumno;
    private ArrayList<Extra4Alumno> alumnosVotados;
    
    // Constructores

    public Extra4Voto() {
    }

    public Extra4Voto(Extra4Alumno alumno) {
        this.alumno = alumno;

    }
    
    
    // Getters and Setters

    public Extra4Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Extra4Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Extra4Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Extra4Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
    
    // ToString

    @Override
    public String toString() {
        return "Extra4Voto: " + "Datos alumn    o: [" + alumno + "] -- Alumnos Votados:" + alumnosVotados;
    }
    
    
    
    
}
