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
public final class txtParsing {

    ArrayList<String> lstAdministrativos = new ArrayList<>();
    public ArrayList<Administrativo> lstAdministrativosObj = new ArrayList<>();
    
    ArrayList<String> lstAlumnos = new ArrayList<>();
    ArrayList<String> lstCatalogos = new ArrayList<>();
    ArrayList<String> lstDocentes = new ArrayList<>();
    ArrayList<String> lstEscenarios = new ArrayList<>();
    ArrayList<String> lstInstituciones = new ArrayList<>();
    ArrayList<String> lstItemCatalogos = new ArrayList<>();
    ArrayList<String> lstPersonas = new ArrayList<>();
    ArrayList<String> lstPrestamos = new ArrayList<>();

    public static int indexItemCatalogo = 0;

    public ArrayList readDataAdministrativo() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Aministrativo.txt"))) {
            // read line by line
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstAdministrativos.add(i, line);
                i++;
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return lstAdministrativos;
    }

    public boolean writeDataAdministrativo(Catalogo cat) {
        try {
            String newLine = "\nidCatalogo:" + cat.getIdCatalogo() + ", descripcionCat:" + cat.getDescripcionCat() + ", estadoCat:" + cat.getEstadoCat() + ";";
            Files.write(Paths.get("./src/DataBase/Catalogo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public ArrayList<Administrativo> getLstAdministrativos() {
        
        for (String line : lstAdministrativos) {
            Administrativo adm = new Administrativo();
            String[] vecCampos = line.split(";");
            
            String[] vec = (vecCampos[0].split(","));
            
            adm.setIntPersona(Integer.parseInt(vec[0].split(":")[1].trim()));
            adm.setStrIdentificacion(vec[1].split(":")[1].trim());
            adm.setStrNombres(vec[2].split(":")[1].trim());
            adm.setChrTipo(vec[3].split(":")[1].trim());
            adm.setStrDependencia(vec[4].split(":")[1].trim());
            adm.setPass(vec[5].split(":")[1].trim());
            lstAdministrativosObj.add(adm);
        }
        return lstAdministrativosObj;
    }

    public txtParsing() {
        this.readDataAdministrativo();
        this.getLstAdministrativos();
    }
}
