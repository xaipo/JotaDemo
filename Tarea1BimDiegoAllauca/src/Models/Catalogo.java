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
public class Catalogo {
    String idCatalogo;
    String descripcionCat;
    int estadoCat;

    public Catalogo() {
    }

    public Catalogo(String idCatalogo, String descripcionCat, int estadoCat) {
        this.idCatalogo = idCatalogo;
        this.descripcionCat = descripcionCat;
        this.estadoCat = estadoCat;
    }

    public String getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(String idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getDescripcionCat() {
        return descripcionCat;
    }

    public void setDescripcionCat(String descripcionCat) {
        this.descripcionCat = descripcionCat;
    }

    public int getEstadoCat() {
        return estadoCat;
    }

    public void setEstadoCat(int estadoCat) {
        this.estadoCat = estadoCat;
    }
    
    
}
