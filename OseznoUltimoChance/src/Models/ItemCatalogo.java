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
public class ItemCatalogo {

    int idItemCatalogo;
    String descripcionItemC;
    int estadoItemC;
    String idCatalogo;

    public ItemCatalogo() {
    }

    public ItemCatalogo(int idItemCatalogo, String descripcionItemC, int estadoItemC, String idCatalogo) {
        this.idItemCatalogo = idItemCatalogo;
        this.descripcionItemC = descripcionItemC;
        this.estadoItemC = estadoItemC;
        this.idCatalogo = idCatalogo;
    }

    public int getIdItemCatalogo() {
        return idItemCatalogo;
    }

    public void setIdItemCatalogo(int idItemCatalogo) {
        this.idItemCatalogo = idItemCatalogo;
    }

    public String getDescripcionItemC() {
        return descripcionItemC;
    }

    public void setDescripcionItemC(String descripcionItemC) {
        this.descripcionItemC = descripcionItemC;
    }

    public int getEstadoItemC() {
        return estadoItemC;
    }

    public void setEstadoItemC(int estadoItemC) {
        this.estadoItemC = estadoItemC;
    }

    public String getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(String idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

}
