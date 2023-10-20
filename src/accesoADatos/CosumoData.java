

package accesoADatos;

import entidades.Consumo;
import entidades.Huesped;
import entidades.ProductoServicio;
import entidades.Reserva;
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

public class CosumoData {
     private Connection con= null;
     ReservaData reserva = new ReservaData();
     ProductoServicioData prod = new ProductoServicioData();

    public CosumoData() {
           con = Conexion.getConexion();
           
    } 
   public void guardarConsumo(Consumo consumo){
       String sql= " INSERT INTO consumo (idReserva,idProductoServicio,unidades,costoTotal,estado)"
               + "VALUES (?,?,?,?,?)";
       
       double precio = consumo.getIdProductoServicio().getPrecioVenta();
       int cant = consumo.getUnidades();
       double total = precio * cant;
       consumo.setCostoTotal(total);
       
       try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, consumo.getIdReserva().getIdReserva());
           ps.setInt(2, consumo.getIdProductoServicio().getIdProductoServicio());
           ps.setInt(3, consumo.getUnidades());
           ps.setDouble(4, consumo.getCostoTotal());
           ps.setBoolean(5, consumo.isEstado());
           
           ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
                 if (rs.next()){
               consumo.setIdCosumo(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Consumo Guardado");
            }
                 ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Consumo"+ ex.getMessage());
        }
        
    }
   
   public void modificarUnidadesCosumidas(Consumo consumo){// solo puedo modificar las unidades 
    String sql = " UPDATE consumo SET unidades=? WHERE idConsumo = ?";
    
    
  
    PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
            ps.setInt(1, consumo.getUnidades());
            ps.setInt(2, consumo.getIdConsumo());
        
        
        int exito = ps.executeUpdate();

    if (exito == 1) {
        JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Dicho consumo no se encuentra registrado");
    }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Consumo"+ex.getMessage());    
    }
    }
   public void eliminarConsumo(int idConsumo)
   {
        String sql = "UPDATE huesped SET estado = 0 WHERE idConsumo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idConsumo);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el consumo.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Consumo"+ex.getMessage());
        }
    }
   
   public Consumo buscarConsumoPorId(int idConsumo){
    
   Consumo consumo= null;
    String sql = "SELECT *  FROM consumo WHERE idConsumo=?" ;
    PreparedStatement ps = null;
    
   
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, idConsumo);
            
            ResultSet rs = ps.executeQuery();
       //      reserva.setIdHabitacion((Habitacion)rs.getObject("idTipoHabitacion"));
            if(rs.next()){
              consumo = new Consumo();
              consumo.setIdCosumo(idConsumo);
              consumo.setIdReserva(reserva.buscarReservaPorHuesped(rs.getInt("idReserva")));
              consumo.setIdProductoServicio(prod.buscarProductoServicioId(rs.getInt("idProductoServicio")));
              consumo.setUnidades(rs.getInt("unidades"));
              consumo.setCostoTotal(rs.getDouble("costoTotal"));
              consumo.setEstado(rs.getBoolean("estado"));
              
                
               }else{
                JOptionPane.showMessageDialog(null,"Dicho consumo no se encuentra registrado");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Consumo"+ex.getMessage());
        }
        
        return consumo; 
   }
               
   public List<Consumo> listarConsumo(){
       String sql="SELECT * from consumo";

       ArrayList<Consumo> consumo = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Consumo consu = new Consumo();
          
               consu.setIdCosumo(rs.getInt("idConsumo"));
               consu.setIdReserva(reserva.buscarReservaPorHuesped(rs.getInt("idReserva")));
               consu.setIdProductoServicio(prod.buscarProductoServicioId(rs.getInt("idProductoServicio")));
               consu.setUnidades(rs.getInt("unidades"));
               consu.setCostoTotal(rs.getDouble("costoTotal"));
               consu.setEstado(rs.getBoolean("estado"));
               
               consumo.add(consu);
                }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Consumo"+ex.getMessage());
        }
        
        return consumo;
}
               
           
      
     

}//------------------fin-------------------
