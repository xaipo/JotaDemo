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
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author User
 */
public final class txtParsing {

    ArrayList<String> lstAdministrativos = new ArrayList<>();
    public ArrayList<Administrativo> lstAdministrativosObj = new ArrayList<>();

    ArrayList<String> lstAlumnos = new ArrayList<>();
    public ArrayList<Alumno> lstAlumnosObj = new ArrayList<>();

    ArrayList<String> lstCatalogos = new ArrayList<>();
    public ArrayList<Catalogo> lstCatalogosObj = new ArrayList<>();

    ArrayList<String> lstDocentes = new ArrayList<>();
    public ArrayList<Docente> lstDocentesObj = new ArrayList<>();

    ArrayList<String> lstEscenarios = new ArrayList<>();
    public ArrayList<Escenario> lstEscenariosObj = new ArrayList<>();

    ArrayList<String> lstInstituciones = new ArrayList<>();
    public ArrayList<Institucion> lstInstitucionesObj = new ArrayList<>();

    ArrayList<String> lstItemCatalogos = new ArrayList<>();
    public ArrayList<ItemCatalogo> lstItemsCatalogosObj = new ArrayList<>();

    ArrayList<String> lstLogAuditorias = new ArrayList<>();
    public ArrayList<LogAuditoria> lstLogAudioriasObj = new ArrayList<>();

    ArrayList<String> lstPrestamos = new ArrayList<>();
    public ArrayList<Prestamo> lstPrestamosObj = new ArrayList<>();

    public static int indexItemCatalogo = 0;

    public void readDataAll() {

        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Administrativo.txt"))) {
         // read line by line
         String line;
         int i = 0;
         while ((line = br.readLine()) != null) {
         lstAdministrativos.add(i, line);
         i++;
         }
         br.reset();
         br.close();
            
         } catch (IOException e) {
         System.err.format("IOException: %s%n", e);
         }
        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Alumno.txt"))) {
            // read line by line
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstAlumnos.add(i, line);
                i++;
            }
            br.reset();
            br.close();

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        
        try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/DataBase/Catalogo.txt"))) {
            // read line by line
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstCatalogos.add(i, line);
                i++;
            }
            br.reset();
            br.close();

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        
        Path pathToFile = Paths.get("src", "DataBase","Docente.txt");

        try (BufferedReader br3 = Files.newBufferedReader(pathToFile)) {
            String line;
            int i = 0;
            while ((line = br3.readLine()) != null) {
                lstDocentes.add(i, line);
                i++;
            }
            br3.close();
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
        }

        Path pathToFile2 = Paths.get("src", "DataBase","Escenarios.txt");
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile2)) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstEscenarios.add(i, line);
                i++;
            }
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
        }
        
        Path pathToFile3 = Paths.get("src", "DataBase","Institucion.txt");

        try (BufferedReader br7 = Files.newBufferedReader(pathToFile3)) {
            String line;
            int i = 0;
            while ((line = br7.readLine()) != null) {
                lstInstituciones.add(i, line);
                i++;
            }
            br7.close();
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
        }
        
        Path pathToFile6 = Paths.get("src", "DataBase","ItemCatalogoNew.txt");

        try (BufferedReader br7 = Files.newBufferedReader(pathToFile6)) {
            String line;
            int i = 0;
            while ((line = br7.readLine()) != null) {
                lstItemCatalogos.add(i, line);
                i++;
            }
            br7.close();
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
        }

        Path pathToFile4 = Paths.get("src", "DataBase","Log-Auditoria.txt");
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile4)) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstLogAuditorias.add(i, line);
                i++;
            }
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
        }

        Path pathToFile5 = Paths.get("src", "DataBase","Prestamos.txt");
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile5)) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lstPrestamos.add(i, line);
                i++;
            }
        } catch (Exception ex) {
            System.err.format("IOException: %s%n", ex);
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

    public ArrayList<Alumno> getLstAlumnos() {
        for (String line : lstAlumnos) {
            Alumno alm = new Alumno();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            alm.setIntPersona(Integer.parseInt(vec[0].split(":")[1].trim()));
            alm.setStrIdentificacion(vec[1].split(":")[1].trim());
            alm.setStrNombres(vec[2].split(":")[1].trim());
            alm.setChrTipo(vec[3].split(":")[1].trim());
            alm.setStrTitulacion(vec[4].split(":")[1].trim());
            alm.setIntCiclo(Integer.parseInt(vec[5].split(":")[1].trim()));
            lstAlumnosObj.add(alm);
        }
        return lstAlumnosObj;
    }

    public ArrayList<Catalogo> getLstCatalogos() {
        for (String line : lstCatalogos) {
            Catalogo cat = new Catalogo();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            cat.setIdCatalogo(vec[0].split(":")[1].trim());
            cat.setDescripcionCat(vec[1].split(":")[1].trim());
            cat.setEstadoCat(Integer.parseInt(vec[2].split(":")[1].trim()));
            lstCatalogosObj.add(cat);
        }
        return lstCatalogosObj;
    }

    public ArrayList<Docente> getLstDocentes() {
        for (String line : lstDocentes) {
            Docente doc = new Docente();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            doc.setIntPersona(Integer.parseInt(vec[0].split(":")[1].trim()));
            doc.setStrIdentificacion(vec[1].split(":")[1].trim());
            doc.setStrNombres(vec[2].split(":")[1].trim());
            doc.setChrTipo(vec[3].split(":")[1].trim());
            doc.setStrDepartamento(vec[4].split(":")[1].trim());
            lstDocentesObj.add(doc);
        }
        return lstDocentesObj;
    }

    public ArrayList<Escenario> getLstEscensarios() {
        for (String line : lstEscenarios) {
            Escenario esc = new Escenario();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            esc.setIntEscenario(Integer.parseInt(vec[0].split(":")[1].trim()));
            esc.setStrNombre(vec[1].split(":")[1].trim());
            lstEscenariosObj.add(esc);
        }
        return lstEscenariosObj;
    }

    public ArrayList<Institucion> getLstInstituciones() {
        for (String line : lstInstituciones) {
            Institucion ins = new Institucion();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            ins.setIntIdinstitucion(Integer.parseInt(vec[0].split(":")[1].trim()));
            ins.setStrCodigo(vec[1].split(":")[1].trim());
            ins.setStrNombre(vec[2].split(":")[1].trim());
            ins.setStrDireccion(vec[3].split(":")[1].trim());
            ins.setStrDireccion(vec[4].split(":")[1].trim());
            ins.setStrCiudad(vec[5].split(":")[1].trim());
            lstInstitucionesObj.add(ins);
        }
        return lstInstitucionesObj;
    }

    public ArrayList<ItemCatalogo> getLstItemsCatalogos() {
        for (String line : lstItemCatalogos) {
            ItemCatalogo item = new ItemCatalogo();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            item.setIdCatalogo(vec[0].split(":")[1].trim());
            item.setIdItemCatalogo(Integer.parseInt(vec[1].split(":")[1].trim()));
            item.setDescripcionItemC(vec[2].split(":")[1].trim());
            item.setEstadoItemC(Integer.parseInt(vec[3].split(":")[1].trim()));
            lstItemsCatalogosObj.add(item);
        }
        return lstItemsCatalogosObj;
    }

    public ArrayList<LogAuditoria> getLstLogAuditorias() {
        for (String line : lstLogAuditorias) {
            LogAuditoria log = new LogAuditoria();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            log.setIntAuditoria(Integer.parseInt(vec[0].split(":")[1].trim()));
            log.setStrFecha(vec[1].split(":")[1].trim());
            log.setStrHora(vec[2].split(":")[1].trim());
            log.setUsuario(vec[3].split(":")[1].trim());
            log.setStrAccion(vec[4].split(":")[1].trim());
            lstLogAudioriasObj.add(log);
        }
        return lstLogAudioriasObj;
    }

    public ArrayList<Prestamo> getLstPrestamos() {
        for (String line : lstPrestamos) {
            Prestamo pre = new Prestamo();
            String[] vecCampos = line.split(";");
            String[] vec = (vecCampos[0].split(","));

            pre.setUsuario(vec[0].split(":")[1].trim());
            pre.setEscenario(vec[1].split(":")[1].trim());
            pre.setActor(vec[2].split(":")[1].trim());
            lstPrestamosObj.add(pre);
        }
        return lstPrestamosObj;
    }

    public boolean writeDataAdministrativos(Administrativo adm) {
        try {
            String newLine = "\nintPersona: " + adm.getIntPersona() + ", strIdentificacion: " + adm.getStrIdentificacion() + ", strNombres: " + adm.getStrNombres() + ", chrTipo: " + adm.getChrTipo() + ", strDependencia: " + adm.getStrDependencia() + ", pass: " + adm.getPass() + ";";
            Files.write(Paths.get("./src/DataBase/Administrativo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataAlumnos(Alumno alm) {
        try {
            String newLine = "\nintPersona:" + alm.getIntPersona() + ", strIdentificacion: " + alm.getStrIdentificacion() + ", strNombres: " + alm.getStrNombres() + ", chrTipo: " + alm.getChrTipo() + ", strTitulacion: " + alm.getStrTitulacion() + ", intCiclo: " + alm.getIntCiclo() + ";";
            Files.write(Paths.get("./src/DataBase/Alumno.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataCatalogos(Catalogo cat) {
        try {
            String newLine = "\nidCatalogo: " + cat.getIdCatalogo() + ", descripcionCat: " + cat.getDescripcionCat() + ", estadoCat: " + cat.getEstadoCat() + ";";
            Files.write(Paths.get("./src/DataBase/Catalogo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataDocentes(Docente doc) {
        try {
            String newLine = "\nintPersona:" + doc.getIntPersona() + ", strIdentificacion: " + doc.getStrIdentificacion() + ", strNombres: " + doc.getStrNombres() + ", chrTipo: " + doc.getChrTipo() + ", strDepartamento: " + doc.getStrDepartamento() + ";";
            Files.write(Paths.get("./src/DataBase/Docente.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataEscenarios(Escenario esc) {
        try {
            String newLine = "\nintEscenario: " + esc.getIntEscenario() + ", strNombre: " + esc.getStrNombre() + ";";
            Files.write(Paths.get("./src/DataBase/Escenarios.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataInstituciones(Institucion ins) {
        try {
            String newLine = "\nintIdinstitucion: " + ins.getIntIdinstitucion() + ", strCodigo: " + ins.getStrCodigo() + ", strNombre: " + ins.getStrNombre() + ", strDireccion: " + ins.getStrDireccion() + ", strCiudad: " + ins.getStrCiudad() + ";";
            Files.write(Paths.get("./src/DataBase/Institucion.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataItemCatalogos(ItemCatalogo cat) {
        try {
            String newLine = "\nIdCatalogo:" + cat.getIdCatalogo() + ", idItemCatalogo: " + cat.getIdItemCatalogo() + ", descripcionItemC: " + cat.getDescripcionItemC() + ", estadoItemC: " + cat.getEstadoItemC() + ";";
            Files.write(Paths.get("./src/DataBase/ItemCatalogo.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataLogAuditorias(LogAuditoria log) {
        try {
            String newLine = "\nintAuditoria:" + log.getIntAuditoria() + ", strFecha: " + log.getStrFecha() + ", strHora: " + log.getStrHora() + ", usuario: " + log.getUsuario() + ", strAccion: " + log.getStrAccion() + ";";
            Files.write(Paths.get("./src/DataBase/Log-Auditoria.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public boolean writeDataPrestamos(Prestamo pre) {
        try {
            String newLine = "\nusuario:" + pre.getUsuario() + ", escenario: " + pre.getEscenario() + ", actor: " + pre.getActor() + ";";
            Files.write(Paths.get("./src/DataBase/Prestamos.txt"), newLine.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return false;
        }
    }

    public txtParsing(String op) {
        this.readDataAll();
        if (op.equals("adm")) {
         this.getLstAdministrativos();
         }
         if (op.equals("alm")) {
         this.getLstAlumnos();
         }
         this.getLstCatalogos();
         if (op.equals("doc")) {
         this.getLstDocentes();
         }
         if (op.equals("esc")) {
         this.getLstEscensarios();
         }
         if (op.equals("ins")) {
         this.getLstInstituciones();
         }
         this.getLstItemsCatalogos();
         if (op.equals("log")) {
         this.getLstLogAuditorias();
         }
         if (op.equals("Pre")) {
         this.getLstPrestamos();
         }
    }
}
