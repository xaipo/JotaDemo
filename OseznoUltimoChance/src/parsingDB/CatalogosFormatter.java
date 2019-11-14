/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsingDB;

import Models.*;

/**
 *
 * @author User
 */
public class CatalogosFormatter {

    public static Catalogo readCatalog(String line) {
        Catalogo catalogo = new Catalogo();
        String[] vecAux = line.split(";");
        String[] vec = vecAux[0].split(",");
        catalogo.setIdCatalogo(vec[0].split(":")[1].trim());
        catalogo.setDescripcionCat(vec[1].split(":")[1].trim());
        String aux = vec[2].split(":")[1].trim();
        catalogo.setEstadoCat(Integer.parseInt(aux));
        return catalogo;
    }

    public static ItemCatalogo readCatalogE(String line) {
        ItemCatalogo itemCatalogo = new ItemCatalogo();
        String[] vecAux = line.split(";");
        String[] vec = vecAux[0].split(",");
        itemCatalogo.setIdItemCatalogo(Integer.parseInt(vec[1].split(":")[1].trim()));
        itemCatalogo.setDescripcionItemC(vec[2].split(":")[1].trim());
        itemCatalogo.setEstadoItemC(Integer.parseInt(vec[3].split(":")[1].trim()));
        itemCatalogo.setIdCatalogo(vec[0].split(":")[1].trim());
        return itemCatalogo;
    }

}
