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
public class Prestamo {
   String usuario;
   String escenario;
   String actor;

    public Prestamo() {
    }

    public Prestamo(String usuario, String escenario, String actor) {
        this.usuario = usuario;
        this.escenario = escenario;
        this.actor = actor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
   
   
}
