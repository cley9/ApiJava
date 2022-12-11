/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cley
 */
public class mysql {

    public static Connection conection() {

        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/dbauser";
//    String driver="com.mysql2.jdbc.Driver";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "root";
        String contrasena = "";
        String port = "3306";
        String dba = "dbauser";
        try {
            Class.forName(driver);
            String cadena = "jdbc:mysql://localhost/dbauser?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            con = DriverManager.getConnection(cadena, usuario, contrasena);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
            return con;
        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        return con;
    }
}
