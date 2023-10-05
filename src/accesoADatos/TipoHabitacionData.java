/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Huesped;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
        String sql="UPDATE tipohabitacion SET cantPersonas=?,cantCamas=?,tipoDeCama=?,precio=? WHERE idTipoHabitacion=?" ;
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1,tHab.getCantPersonas());
             ps.setInt(2, tHab.getCantCamas());
             ps.setString(3, tHab.getTipoCama());
             ps.setDouble(4, tHab.getPrecio());
             ps.setInt(5, tHab.getIdTipoHabitacion());

             int exito = ps.executeUpdate();

             if (exito == 1) {
                 JOptionPane.showMessageDialog(null, "Modificacion exitosa");
             } else {
                 JOptionPane.showMessageDialog(null, "El tipo de habitacion no existe ");
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
        String sql="UPDATE tipohabitacion SET precio=? WHERE idTipoHabitacion=?";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql);
            
             ps.setDouble(1, tHab.getPrecio());
             ps.setInt(2, tHab.getIdTipoHabitacion());

             int exito = ps.executeUpdate();

             if (exito == 1) {
                 JOptionPane.showMessageDialog(null, "Modificacion exitosa");
             } else {
                 JOptionPane.showMessageDialog(null, "No se pudo hacer la modificacion solicitada");
             }
    
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion");
         }
        
    }
    public void eliminarTipoHabitacion(int idTipoH){
        String sql = "UPDATE tipohabitacion SET estado = 0 WHERE idTipoHabitacion = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idTipoH);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el tipo de habitacion solicitado.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion"+ex.getMessage());
        }
    }
      public List<TipoHabitacion> listarTipoHabitacion(){
       String sql="SELECT idTipoHabitacion,cantPersonas,cantCamas,tipoDeCama,precio,estado FROM tipohabitacion";

       ArrayList<TipoHabitacion> thabitacion = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
              TipoHabitacion tipoHab=new TipoHabitacion();
               tipoHab.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
              tipoHab.setCantPersonas(rs.getInt("cantPersonas"));
              tipoHab.setCantCamas(rs.getInt("cantCamas"));
               tipoHab.setTipoCama(rs.getString("tipoDeCama"));
               tipoHab.setPrecio(rs.getDouble("precio"));
              tipoHab.setEstado(rs.getBoolean("estado"));
            
               
             thabitacion.add(tipoHab);
                }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla tipo de habitacion"+ex.getMessage());
        }
        
        return thabitacion;
}
               
    
    


  
    
    
    
    
    
            
    
}//------------------fin-------------------
