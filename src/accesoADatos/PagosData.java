
package accesoADatos;


import entidades.Pagos;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class PagosData {
    
    
    private Connection con= null;
    ReservaData rdata=new ReservaData();

    public PagosData() {
        
        con=Conexion.getConexion();
        
    }
    
    
    public void guardarpagos (Pagos pago){
       String sql= " INSERT INTO pagos (idReserva,importeTotal,tipoComprobante,fechaEmision,medioPago)"
               + "VALUES (?,?,?,?,?)";
       try {
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           
           ps.setInt(1, pago.getIdReserva().getIdReserva());
           ps.setDouble(2, pago.getImporteTotal());
           ps.setString(3, pago.getTipoComprobante());
           ps.setDate(4, pago.getFechaEmision());
           ps.setString(5, pago.getMedioPago());
          
           
           ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
                 if (rs.next()){
                pago.setIdPagos(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Pago EXITOSO");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pagos (m.guardar)"+ ex.getMessage());
        }
        
    }
    
     public void eliminarPago(int id){
          String sql = "DELETE FROM pagos WHERE idPagos = ?";
      PreparedStatement ps = null;
      
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el pago");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pagos (m.eliminar) " +ex.getMessage());
        }
   }
     public void modificarPago(Pagos pago) {

        String sql = "UPDATE productoservicio SET idReserva=?,imporTotal=?,tipoComprobante=?,fechaEmision=?,medioPago=? WHERE idPagos = ?";
        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdReserva().getIdReserva());
            ps.setDouble(2, pago.getImporteTotal());
            ps.setString(3, pago.getTipoComprobante());
            ps.setDate(4, pago.getFechaEmision());
            ps.setString(5, pago.getMedioPago());
            ps.setInt(6, pago.getIdPagos());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Dicho pago no se ha encontrado ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pagos (m.modificar) " + ex.getMessage());
        }
    }
      public Pagos buscarPagoPorId(int id){// no se si la vamos a usar 
          Pagos pagos=null;
        String sql = "SELECT * FROM pagos WHERE idPagos=?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               pagos=new Pagos();
             
               pagos.setIdPagos(id);
               pagos.setIdReserva((Reserva)rs.getObject("idReserva"));
               pagos.setImporteTotal(rs.getDouble("importeTotal"));
               pagos.setTipoComprobante(rs.getString("tipoComprobante"));
               pagos.setFechaEmision(rs.getDate("fechaEmision"));
               pagos.setMedioPago(rs.getString("medioPago"));
               
               }else{
                JOptionPane.showMessageDialog(null,"No existe el Pago");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pagos (m.buscarpago)"+ex.getMessage());
        }
        return pagos;
    }
    
     public List<Pagos> listarPagos(){
       String sql="SELECT * FROM pagos";// "SELECT * FROM huesped ";

       ArrayList<Pagos> listapagos = new ArrayList<>();
       
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Pagos pagos = new Pagos();
               pagos.setIdPagos(rs.getInt("idPagos"));
               pagos.setIdReserva((Reserva)rs.getObject("idReserva"));
               pagos.setImporteTotal(rs.getDouble("importeTotal"));
               pagos.setTipoComprobante(rs.getString("tipoComprobante"));
               pagos.setFechaEmision(rs.getDate("fechaEmision"));
               pagos.setMedioPago(rs.getString("medioPago"));
               
                   
               
               listapagos.add(pagos);
                }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pagos (m. listar)"+ex.getMessage());
        }
        
        return listapagos;
}
               
           
      
     
    
    
    
}
