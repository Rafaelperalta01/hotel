/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class TipoHabitacionData {
     private Connection con= null;

    public TipoHabitacionData() {
        
            con=Conexion.getConexion();
    }
    
    public void guardarTipoHabitacion( TipoHabitacion tHab){
        
        String sql="INSERT INTO tipohabitacion (cantPersonas,cantCamas,tipoDeCama,precio)"
                + "VALUES (?,?,?,?) ";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1,tHab.getCantPersonas());
             ps.setInt(2, tHab.getCantCamas());
             ps.setString(3, tHab.getTipoCama());
             ps.setDouble(4,tHab.getPrecio());
             
             ps.executeUpdate();
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
                 tHab.setIdTipoHabitacion(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"Tipo de habitacion cargada");
             }
                 ps.close();
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion");
         }
       
    
    
    }
    public void modificarTipoDeHabitacion(TipoHabitacion tHab){
        String sql="UPDATE tipohabitacion SET cantPersonas=?,cantCamas=?,tipoDeCama=?,precio=?";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1,tHab.getCantPersonas());
             ps.setInt(2, tHab.getCantCamas());
             ps.setString(3, tHab.getTipoCama());
             ps.setDouble(4, tHab.getPrecio());

             int exito = ps.executeUpdate();

             if (exito == 1) {
                 JOptionPane.showMessageDialog(null, "Modificcion exitosa");
             } else {
                 JOptionPane.showMessageDialog(null, "no se que escribir aca");
             }
    
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion");
         }
        
    }
    public void buscarTipoHabPorId( int id){
        String sql="SELECT idTipoHabitacion,cantPersonas,cantCamas,tipoDeCama,precio FROM tipohabitacion";
        
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, id);
             
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
                 TipoHabitacion tipoHab=new TipoHabitacion();
                 
                 tipoHab.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                 tipoHab.setCantPersonas(rs.getInt("cantPersonas"));
                 tipoHab.setCantCamas(rs.getInt("cantCamas"));
                 tipoHab.setTipoCama(rs.getString("tipoDeCama"));
                 tipoHab.setPrecio(rs.getDouble("precio"));
                 
             }else{
                JOptionPane.showMessageDialog(null,"No existe el tipo de habitacion con el id proporcionado");
            } 
            
            ps.close();
             
             
             
             
         } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion");
         }
    }
   
     public void modificarPrecioTipoDeHabitacion(TipoHabitacion tHab){
        String sql="UPDATE tipohabitacion SET precio=?";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
            
             ps.setDouble(1, tHab.getPrecio());

             int exito = ps.executeUpdate();

             if (exito == 1) {
                 JOptionPane.showMessageDialog(null, "Modificcion exitosa");
             } else {
                 JOptionPane.showMessageDialog(null, "no se que escribir aca");
             }
    
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion");
         }
        
    }
    
    
    


  
    
    
    
    
    
            
    
}//------------------fin-------------------
