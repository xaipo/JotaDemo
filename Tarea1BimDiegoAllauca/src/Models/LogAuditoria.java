/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author User
 */
public class LogAuditoria {
    int intAuditoria;
    String strFecha;
    String strHora;
    String Usuario;
    String strAccion;

    public LogAuditoria() {
    }

    public LogAuditoria(int intAuditoria, String strFecha, String strHora, String Usuario, String strAccion) {
        this.intAuditoria = intAuditoria;
        this.strFecha = strFecha;
        this.strHora = strHora;
        this.Usuario = Usuario;
        this.strAccion = strAccion;
    }

    public int getIntAuditoria() {
        return intAuditoria;
    }

    public void setIntAuditoria(int intAuditoria) {
        this.intAuditoria = intAuditoria;
    }

    public String getStrFecha() {
        return strFecha;
    }

    public void setStrFecha(String strFecha) {
        this.strFecha = strFecha;
    }

    public String getStrHora() {
        return strHora;
    }

    public void setStrHora(String strHora) {
        this.strHora = strHora;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getStrAccion() {
        return strAccion;
    }

    public void setStrAccion(String strAccion) {
        this.strAccion = strAccion;
    }

}
