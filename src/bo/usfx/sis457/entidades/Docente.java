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
 * @author Marcelo
 */
public class Docente extends Persona {
    protected int Años_de_experiencia;
    protected String Titulo;
    String Asignaturas;

    public Docente(int Años_de_experiencia, String Titulo, String Asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Años_de_experiencia = Años_de_experiencia;
        this.Titulo = Titulo;
        this.Asignaturas = Asignaturas;
    }


    public Docente() {
        this.Años_de_experiencia =0;
    }

    public int getAños_de_experiencia() {
        return Años_de_experiencia;
    }

    public void setAños_de_experiencia(int Años_de_experiencia) {
        this.Años_de_experiencia = Años_de_experiencia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + ", Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo 
                + ", Años_de_experiencia=" + this.Años_de_experiencia
                + ", Asignaturas=" + this.Asignaturas + '}';
    }
    
}
