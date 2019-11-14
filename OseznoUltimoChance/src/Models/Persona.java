/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author daguaman
 */
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    int intPersona;
    String strIdentificacion;
    String strNombres;
    String chrTipo;

    public Persona(int intPersona, String strIdentificacion, String strNombres, String strTipo) {
        this.intPersona = intPersona;
        this.strIdentificacion = strIdentificacion;
        this.strNombres = strNombres;
        this.chrTipo = strTipo;
    }

    public int getIntPersona() {
        return intPersona;
    }

    public void setIntPersona(int intPersona) {
        this.intPersona = intPersona;
    }

    public String getStrIdentificacion() {
        return strIdentificacion;
    }

    public String getChrTipo() {
        return chrTipo;
    }

    public void setChrTipo(String chrTipo) {
        this.chrTipo = chrTipo;
    }

    public void setStrIdentificacion(String strIdentificacion) {
        this.strIdentificacion = strIdentificacion;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }
    
    
}
