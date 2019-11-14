/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author daguaman
 */
public class Alumno extends Persona{
    private static final long serialVersionUID = 1L;
    String strTitulacion;
    int intCiclo;

    public Alumno(String strTitulacion, int intCiclo, int intPersona, String strIdentificacion, String strNombres, String strTipo) {
        super(intPersona, strIdentificacion, strNombres, strTipo);
        this.strTitulacion = strTitulacion;
        this.intCiclo = intCiclo;
    }

    public String getStrTitulacion() {
        return strTitulacion;
    }

    public void setStrTitulacion(String strTitulacion) {
        this.strTitulacion = strTitulacion;
    }

    public int getIntCiclo() {
        return intCiclo;
    }

    public void setIntCiclo(int intCiclo) {
        this.intCiclo = intCiclo;
    }
}
