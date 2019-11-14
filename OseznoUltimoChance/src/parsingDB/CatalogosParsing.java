/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsingDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import Models.*;
import java.io.FileWriter;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author User
 */
public final class CatalogosParsing {

    ArrayList<String> lstCatalagos = new ArrayList<>();
    ArrayList<String> lstItemCatalagos = new ArrayList<>();
    public static int indexItemCatalogo = 0;

    public ArrayList readDataCat() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Catalogo.txt"))) {
            // read line by line
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstCatalagos.add(i, line);
                i++;
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return lstCatalagos;
    }

    public ArrayList readDataItemCat() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Item-Catalogo.txt"))) {
            // read line by line
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstItemCatalagos.add(i, line);
                i++;
            }
            indexItemCatalogo = i + 1;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return lstItemCatalagos;
    }

    public boolean writeDataCat(Catalogo cat) {
        try {
            String newLine = "\nidCatalogo:" + cat.getIdCatalogo() + ", descripcionCat:" + cat.getDescripcionCat() + ", estadoCat:" + cat.getEstadoCat() + ";";
            Files.write(Paths.get("./src/DataBase/Catalogo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataCatE(ItemCatalogo ic) {
        try {
            //idCatalogo:estados, idItemCatalogo:1, descripcionItemC:Activo, estadoItemC:1;
            String newLine = "\nidCatalogo:" + ic.getIdCatalogo() + ", idItemCatalogo:" + ic.getIdItemCatalogo() + ", descripcionItemC:" + ic.getDescripcionItemC() + ", estadoItemC:" + ic.getEstadoItemC() + ":";
            Files.write(Paths.get("./src/DataBase/Item-Catalogo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public CatalogosParsing() {
        this.readDataCat();
        this.readDataItemCat();
    }

    public String getEstados() {
        String estadoName = lstCatalagos.get(0);
        return estadoName;
    }

    public ArrayList<ItemCatalogo> getElementos(String catalogName) {
        ArrayList<ItemCatalogo> lstItemCatalagosResp = new ArrayList<>();
        ItemCatalogo itemCatalogo = new ItemCatalogo();
        for (String var : lstItemCatalagos) {
            itemCatalogo = CatalogosFormatter.readCatalogE(var);
            if (itemCatalogo.getIdCatalogo().trim().equalsIgnoreCase(catalogName.trim())) {
                lstItemCatalagosResp.add(itemCatalogo);
            }
        }
        return lstItemCatalagosResp;
    }

    public ArrayList<Catalogo> getCatalogos() {
        ArrayList<Catalogo> lstCatalagosResp = new ArrayList<>();
        Catalogo catalogo = new Catalogo();
        for (String var : lstCatalagos) {
            catalogo = CatalogosFormatter.readCatalog(var);
            lstCatalagosResp.add(catalogo);
        }
        return lstCatalagosResp;
    }

    public String getSexos() {
        String sexoName = lstCatalagos.get(1);
        return sexoName;
    }
}
