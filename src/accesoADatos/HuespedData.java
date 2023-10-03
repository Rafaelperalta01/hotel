
package accesoADatos;

import entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HuespedData {
     private Connection con= null;

    public HuespedData() {
           con = Conexion.getConexion();
           
    } 
   public void guardarHuesped (Huesped huesped){
       String sql= " INSERT INTO huesped (nombre,apellido,dni,domicilio, correo,celular,estado)"
               + "VALUES (?,?,?,?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, huesped.getNombre());
           ps.setString(2, huesped.getApellido());
           ps.setInt(3, huesped.getDni());
           ps.setString(4, huesped.getDomicilio());
           ps.setString(5, huesped.getCorreo());
           ps.setString(6, huesped.getCelular());
           ps.setBoolean(7, huesped.isEstado());
           
           ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
                 if (rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped Guardado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped"+ ex.getMessage());
        }
        
    }
   
   public void modificarHuesped(Huesped huesped){
    String sql = " UPDATE huesped SET nombre = ?, apellido= ?, dni= ?, domicilio = ?, correo = ?, celular = ? WHERE idHuesped = ?";
    PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
           ps.setString(2, huesped.getApellido());
           ps.setInt(3, huesped.getDni());
           ps.setString(4, huesped.getDomicilio());
           ps.setString(5, huesped.getCorreo());
           ps.setString(6, huesped.getCelular());
           ps.setInt(7, huesped.getIdHuesped());
        
        
        int exito = ps.executeUpdate();

    if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "El Huesped no existe");
    }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped"+ex.getMessage());    
    }
    }
   public void eliminarHuesped(int dni){
        String sql = "UPDATE huesped SET estado = 0 WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el huesped.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped"+ex.getMessage());
        }
    }
   
   public Huesped buscarHuespedPorDni(int dni){
    
    Huesped huesped= null;
    String sql = "SELECT idHuesped,nombre, apellido, dni, domicilio, correo, celular FROM huesped WHERE dni=?";
    PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               huesped = new Huesped();
               huesped.setIdHuesped(rs.getInt("idHuesped"));
               huesped.setDni(rs.getInt("dni"));
               
               huesped.setNombre(rs.getString("nombre"));
               huesped.setApellido(rs.getString("apellido"));
               huesped.setDomicilio(rs.getString("domicilio"));
               huesped.setCorreo(rs.getString("correo"));
               huesped.setCelular(rs.getString("celular"));
               }else{
                JOptionPane.showMessageDialog(null,"No existe el huesped");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped"+ex.getMessage());
        }
        
        return huesped; 
   }
               
   public List<Huesped> listarHuesped(){
       String sql="SELECT (idHuesped,nombre,apellido,dni,domicilio, correo,celular,estado)"
               + "FROM huesped";
       ArrayList<Huesped> huesped = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Huesped hues = new Huesped();
               hues.setIdHuesped(rs.getInt("idHuesped"));
               hues.setNombre(rs.getString("nombre"));
               hues.setApellido(rs.getString("apellido"));
               hues.setDni(rs.getInt("dni"));
               hues.setDomicilio(rs.getString("domicilio"));
               hues.setCorreo(rs.getString("correo"));
               hues.setCelular(rs.getString("celular"));
               hues.setEstado(rs.getBoolean("estado"));
               
               huesped.add(hues);
                }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped"+ex.getMessage());
        }
        
        return huesped;
}
               
           
           
       
       
   
   

   
   
       
   
           
           
           
  
     
     

}
