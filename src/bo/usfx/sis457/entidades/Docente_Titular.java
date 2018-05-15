/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author MC
 */
public class Docente_Titular extends Docente {
    String Examen_de_competencia;

    public Docente_Titular(String Examen_de_competencia, int Años_de_experiencia, String Titulo, String Asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(Años_de_experiencia, Titulo, Asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.Examen_de_competencia = Examen_de_competencia;
    }
    public String getExamen_de_competencia() {
        return Examen_de_competencia;
    }

    public void setExamen_de_competencia(String Examen_de_competencia) {
        this.Examen_de_competencia = Examen_de_competencia;
    }
    @Override
     public String toString() {
        return "Docente_Titular{" 
                + " Id=" + this.Id 
                + ", Examen_de_competencia=" + this.Examen_de_competencia
                + ", Años_de_experiencia=" + this.Años_de_experiencia
                + ", Titulo=" + this.Titulo
                + ", Asignatura=" + this.Asignaturas
                
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)+'}';
    }
}
