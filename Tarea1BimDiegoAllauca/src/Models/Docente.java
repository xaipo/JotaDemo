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
public class Docente extends Persona{
    private static final long serialVersionUID = 1L;
    String strDepartamento;

    public Docente(String strDepartamento, int intPersona, String strIdentificacion, String strNombres, String strTipo) {
        super(intPersona, strIdentificacion, strNombres, strTipo);
        this.strDepartamento = strDepartamento;
    }

    public Docente() {
    }

    public String getStrDepartamento() {
        return strDepartamento;
    }

    public void setStrDepartamento(String strDepartamento) {
        this.strDepartamento = strDepartamento;
    }
}
