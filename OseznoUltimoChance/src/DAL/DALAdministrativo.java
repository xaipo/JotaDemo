/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.Administrativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class DALAdministrativo extends Conexion{
    
    
        public boolean CreateAdministrativo(Administrativo adm) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean retorno = false;
        String sql = "INSERT INTO usuarios (Identificacion, Telefono, Username, Pass, Correo, Estado) VALUES (?,?,?,?,?,?,?)";
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
    
}
