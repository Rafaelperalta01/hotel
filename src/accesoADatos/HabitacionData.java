
package accesoADatos;

import java.sql.Connection;


public class HabitacionData {
     private Connection con= null;

    public HabitacionData() {
        con=Conexion.getConexion();
    }
    
    
    
}//------------------fin-------------------
