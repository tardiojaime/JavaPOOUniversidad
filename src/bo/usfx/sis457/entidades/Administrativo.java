/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona {
  private String Cargo;
 private String Lugar_Trabajo;
private Calendar Fecha_de_ingreseo; 

    public Administrativo(String Cargo, String Lugar_Trabajo, Calendar Fecha_de_ingreseo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = Cargo;
        this.Lugar_Trabajo = Lugar_Trabajo;
        this.Fecha_de_ingreseo = Fecha_de_ingreseo;
    }

    public Administrativo(String Cargo, String Lugar_Trabajo, Calendar Fecha_de_ingreseo) {
        this.Cargo = Cargo;
        this.Lugar_Trabajo = Lugar_Trabajo;
        this.Fecha_de_ingreseo = Fecha_de_ingreseo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugar_Trabajo() {
        return Lugar_Trabajo;
    }

    public void setLugar_Trabajo(String Lugar_Trabajo) {
        this.Lugar_Trabajo = Lugar_Trabajo;
    }

    public Calendar getFecha_de_ingreseo() {
        return Fecha_de_ingreseo;
    }

    public void setFecha_de_ingreseo(Calendar Fecha_de_ingreseo) {
        this.Fecha_de_ingreseo = Fecha_de_ingreseo;
    }
  @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.Cargo
                + ", Lugar_Trabajo=" + this.Lugar_Trabajo
                + ", Fecha_de_ingreso=" + Utilitarios.getFechaCalendario(this.Fecha_de_ingreseo) + '}';
    }
}
