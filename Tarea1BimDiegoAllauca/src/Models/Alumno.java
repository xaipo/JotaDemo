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
    String fechaNacimiento;
    String chrTipo;
    int intCiclo;

    public Alumno(String strTitulacion, int intCiclo, int intPersona, String strIdentificacion, String strNombres, String strTipo, String fechaNacimiento,String chrTipo) {
        super(intPersona, strIdentificacion, strNombres, strTipo);
        this.strTitulacion = strTitulacion;
         this.fechaNacimiento = fechaNacimiento;
        this.intCiclo = intCiclo;
        this.chrTipo = chrTipo;
    }

    public Alumno() {
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

     public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getchrTipo() {
        return chrTipo;
    }
    
    public void setIntCiclo(int intCiclo) {
        this.intCiclo = intCiclo;
    }
}
