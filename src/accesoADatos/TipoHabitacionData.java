/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import java.sql.Connection;

/**
 *
 * @author Pc
 */
public class TipoHabitacionData {
     private Connection con= null;

    public TipoHabitacionData() {
        
            con=Conexion.getConexion();
    }
     
    
}//------------------fin-------------------
