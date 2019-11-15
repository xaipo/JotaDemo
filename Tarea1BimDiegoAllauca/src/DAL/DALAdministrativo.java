/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.Administrativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DALAdministrativo extends Conexion {

    public boolean CreateAdministrativo(Administrativo adm) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO administrativo (strIdentificacion, strNombres, chrTipo, strDependencia) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, adm.getStrIdentificacion());
            ps.setString(2, adm.getStrNombres());
            ps.setString(3, adm.getChrTipo());
            ps.setString(4, adm.getStrDependencia());
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.getMessage();
                retorno = false;
            }
        }
        return retorno;
    }
    
    public ResultSet GetAdministrativos() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM administrativo";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
        return rs;
    }
    
    public ResultSet SearchAdministrativo(String strusIden) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM administrativo WHERE stridentificacion=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, strusIden);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
        return rs;
    }
    
    public boolean UpdateAdministrativo(Administrativo adm){
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "UPDATE administrativo SET strNombres = ?, chrTipo = ?, strDependencia = ? WHERE strIdentificacion = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, adm.getStrNombres());
            ps.setString(2, adm.getChrTipo());
            ps.setString(3, adm.getStrDependencia());
            ps.setString(4, adm.getStrIdentificacion());
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.getMessage();
                retorno = false;
            }
        }
        return retorno;
    }
    
    public boolean DeleteAdministrativo(String iden){
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "DELETE FROM administrativo WHERE strIdentificacion = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, iden);
            ps.execute();
            retorno = true;
        } catch (Exception e) {
            retorno = false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.getMessage();
                retorno = false;
            }
        }
        return retorno;
    }

}
