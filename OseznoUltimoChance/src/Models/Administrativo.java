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
public class Administrativo extends Persona{
    private static final long serialVersionUID = 1L;
    String strDependencia;

    public Administrativo(String strDependencia, int intPersona, String strIdentificacion, String strNombres, String strTipo) {
        super(intPersona, strIdentificacion, strNombres, strTipo);
        this.strDependencia = strDependencia;
    }

    

    public String getStrDependencia() {
        return strDependencia;
    }

    public void setStrDependencia(String strDependencia) {
        this.strDependencia = strDependencia;
    }
    
}
