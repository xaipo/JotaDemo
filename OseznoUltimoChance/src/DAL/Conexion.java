/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Conexion {

    private final String base = "Rio_Contable";
    private final String usuario = "sa";
    private final String clave = "E@sysoft";

    private Connection con = null;

    public Connection getConexion()  {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = (Connection) DriverManager.getConnection(this.url, this.usuario, this.clave);
            con = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=" + base, usuario, clave);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
