/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Conexion {
    public static final String tblusuarios ="usuarios";
    public  static final String tblpacientes="pacientes";
    public static final String tblpagos="pagos";
    public static Connection  getConnection(){
        Connection conn =null;
        try {
            String url = "jdbc:mysql://192.168.0.10/";
            String dbName= "clinica";
            String userName = "rooot";
            String password = "root";
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXION -> ERROR -> "+e);
        }
        return conn;
    }
    
}
