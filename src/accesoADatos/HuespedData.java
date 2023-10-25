
package accesoADatos;

import entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HuespedData {
     private Connection con= null;

    public HuespedData() {
           con = Conexion.getConexion();
           
    } 
   public void guardarHuesped (Huesped huesped){
       String sql= " INSERT INTO huesped (nombre,apellido,tipoDocumento,numeroDocumento,domicilio, correo,celular,estado)"
               + "VALUES (?,?,?,?,?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
           ps.setString(1, huesped.getNombre());
           ps.setString(2, huesped.getApellido());
           ps.setString(3, huesped.getTipoDocumento());
           ps.setString(4, huesped.getNumeroDocumento());
           ps.setString(5, huesped.getDomicilio());
           ps.setString(6, huesped.getCorreo());
           ps.setInt(7, huesped.getCelular());
           ps.setBoolean(8, huesped.isEstado());
           
           ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
                 if (rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped Guardado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped (m.guardar)"+ ex.getMessage());
        }
        
    }
   
   public void modificarHuesped(Huesped huesped){
    String sql = " UPDATE huesped SET nombre = ?, apellido= ?, tipoDocumento=?, numeroDocumento=?, domicilio = ?, correo = ?, celular = ? WHERE idHuesped = ?";
    PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
           ps.setString(2, huesped.getApellido());
           ps.setString(3, huesped.getTipoDocumento());
           ps.setString(4, huesped.getNumeroDocumento());
           ps.setString(5, huesped.getDomicilio());
           ps.setString(6, huesped.getCorreo());
           ps.setInt(7, huesped.getCelular());
           ps.setInt(8, huesped.getIdHuesped());
        
        
        int exito = ps.executeUpdate();

    if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "El Huesped no existe????");
    }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped (m.modificar)"+ex.getMessage());    
    }
    }
   public void eliminarHuesped(String numeroDocumento){
        String sql = "UPDATE huesped SET estado = 0 WHERE numeroDocumento = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroDocumento);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el huesped.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped (m.eliminar)"+ex.getMessage());
        }
    }
   public Huesped buscarHuespedPorDni(String numeroDocumento){
    //RAFAAAAA
    Huesped huesped= null;
    String sql = "SELECT idHuesped,nombre, apellido, tipoDocumento, numeroDocumento, domicilio, correo, celular FROM huesped WHERE numeroDocumento=?";
    PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, numeroDocumento);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               huesped = new Huesped();
               huesped.setIdHuesped(rs.getInt("idHuesped"));
             
               
               huesped.setNombre(rs.getString("nombre"));
               huesped.setApellido(rs.getString("apellido"));
               
               huesped.setTipoDocumento(rs.getString("tipoDocumento"));
               huesped.setNumeroDocumento(rs.getString("numeroDocumento"));
               huesped.setDomicilio(rs.getString("domicilio"));
               huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
               }else{
              //  JOptionPane.showMessageDialog(null,"No existe el huesped");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped (m. buscarxdni)"+ex.getMessage());
        }
        
        return huesped; 
   }
   public Huesped buscarHuespedPorId(int id){
    
    Huesped huesped= null;
    String sql = "SELECT idHuesped,nombre, apellido, tipoDocumento,numeroDocumento, domicilio, correo, celular FROM huesped WHERE idHuesped=?";
    PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(id);
                huesped.setTipoDocumento(rs.getString("tipoDocumento"));
                huesped.setNumeroDocumento(rs.getString("numeroDocumento"));

                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                 huesped.setCelular(rs.getInt("celular"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el huesped");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped (m. buscarxid)"+ex.getMessage());
        }
        
        return huesped; 
   }
               
   public List<Huesped> listarHuesped(){
       String sql="SELECT idHuesped,nombre,apellido,tipoDocumento,numeroDocumento,domicilio, correo,celular,estado FROM huesped";// "SELECT * FROM huesped ";

       ArrayList<Huesped> huesped = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Huesped hues = new Huesped();
               hues.setIdHuesped(rs.getInt("idHuesped"));
               hues.setNombre(rs.getString("nombre"));
               hues.setApellido(rs.getString("apellido"));
               hues.setTipoDocumento(rs.getString("tipoDocumento"));
               hues.setNumeroDocumento(rs.getString("numeroDocumento"));
               hues.setDomicilio(rs.getString("domicilio"));
               hues.setCorreo(rs.getString("correo"));
                hues.setCelular(rs.getInt("celular"));
               hues.setEstado(rs.getBoolean("estado"));

               huesped.add(hues);
           }

           ps.close();

       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped (m. listar)" + ex.getMessage());
       }

        return huesped;
}
               
   public List<Huesped> listarHuespedporDni(String dni) {

        List<Huesped> huesped = new ArrayList<Huesped>();
        String sql = "SELECT * FROM huesped "
                + " WHERE numeroDocumento =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                     Huesped hues = new Huesped();
               hues.setIdHuesped(rs.getInt("idHuesped"));
               hues.setNombre(rs.getString("nombre"));
               hues.setApellido(rs.getString("apellido"));
               hues.setTipoDocumento(rs.getString("tipoDocumento"));
               hues.setNumeroDocumento(rs.getString("numeroDocumento"));
               hues.setDomicilio(rs.getString("domicilio"));
               hues.setCorreo(rs.getString("correo"));
              
               hues.setCelular(rs.getInt("celular"));
               hues.setEstado(rs.getBoolean("estado"));

               huesped.add(hues);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped " + ex.getMessage());
        }

        return huesped;

    }            
   public void modificarEstadoHuesped(String numeroDocumento){
        String sql = "UPDATE huesped SET estado = 1 WHERE numeroDocumento = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroDocumento);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se modifico el huesped.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla huesped (m.eliminar)"+ex.getMessage());
        }
    }
public List<Huesped> listarHuespedEstadoTrue(){
       String sql="SELECT idHuesped,nombre,apellido,tipoDocumento,numeroDocumento,domicilio, correo,celular,estado FROM huesped  WHERE estado=1";// "SELECT * FROM huesped ";

       ArrayList<Huesped> huesped = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Huesped hues = new Huesped();
               hues.setIdHuesped(rs.getInt("idHuesped"));
               hues.setNombre(rs.getString("nombre"));
               hues.setApellido(rs.getString("apellido"));
               hues.setTipoDocumento(rs.getString("tipoDocumento"));
               hues.setNumeroDocumento(rs.getString("numeroDocumento"));
               hues.setDomicilio(rs.getString("domicilio"));
               hues.setCorreo(rs.getString("correo"));
                hues.setCelular(rs.getInt("celular"));
               hues.setEstado(rs.getBoolean("estado"));

               huesped.add(hues);
           }

           ps.close();

       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped (m. listar)" + ex.getMessage());
       }

        return huesped;
}
  public List<Huesped> listarHuespedporDniHuespedEstadoTrue(String dni) {

        List<Huesped> huesped = new ArrayList<Huesped>();
        String sql = "SELECT * FROM huesped "
                + " WHERE numeroDocumento =? AND estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                     Huesped hues = new Huesped();
               hues.setIdHuesped(rs.getInt("idHuesped"));
               hues.setNombre(rs.getString("nombre"));
               hues.setApellido(rs.getString("apellido"));
               hues.setTipoDocumento(rs.getString("tipoDocumento"));
               hues.setNumeroDocumento(rs.getString("numeroDocumento"));
               hues.setDomicilio(rs.getString("domicilio"));
               hues.setCorreo(rs.getString("correo"));
              
               hues.setCelular(rs.getInt("celular"));
               hues.setEstado(rs.getBoolean("estado"));

               huesped.add(hues);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener incripciones" + ex.getMessage());
        }

        return huesped;

    }            



}//------------------fin-------------------
