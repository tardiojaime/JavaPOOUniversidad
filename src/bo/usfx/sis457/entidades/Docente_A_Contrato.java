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
public class Docente_A_Contrato extends Docente{
    String Numero_de_contrato;

    public Docente_A_Contrato(String Numero_de_contrato, int Años_de_experiencia, String Titulo, String Asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(Años_de_experiencia, Titulo, Asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.Numero_de_contrato = Numero_de_contrato;
    }

    public String getNumero_de_contrato() {
        return Numero_de_contrato;
    }

    public void setNumero_de_contrato(String Numero_de_contrato) {
        this.Numero_de_contrato = Numero_de_contrato;
    }

    @Override
    public String toString() {
        return "Docente_A_Contrato{" 
                + "Numero_de_contrato=" + this.Numero_de_contrato
                + ", Años_de_experiencia=" + this.Años_de_experiencia
                + ", Titulo=" + this.Titulo
                + ", Asignatura=" + this.Asignaturas
                + ", Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", Años_de_experiencia=" + this.Años_de_experiencia
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)+'}';
    }
}
