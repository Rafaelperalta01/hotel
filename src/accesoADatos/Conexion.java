/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo 320
 */
public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="hotel";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        if(connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");//invoco el driver
                connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);//
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se cargaron los drivers");
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo conectar con la Base de datos");
            }
        }
        return connection;
    }
}
