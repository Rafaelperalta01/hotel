/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.Usuarios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class ReservaData {
     private Connection con= null;
     HabitacionData habitacion = new HabitacionData();
     HuespedData huesped = new HuespedData();
     UsuariosData usuario = new UsuariosData();
     

    public ReservaData() {
        con=Conexion.getConexion();
    }
         
    public Reserva buscarReservaPorHuesped(int id){
        Reserva reserva= null;
        
        String sql = "SELECT * FROM reserva WHERE idHuesped=?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               reserva = new Reserva();
               reserva.setIdReserva(rs.getInt("idReserva"));
               reserva.setIdHabitacion(habitacion.buscarHabitacionId(rs.getInt("idHabitacion")));
               reserva.setIdHuesped(huesped.buscarHuespedPorId(rs.getInt("idHuesped")));
               reserva.setIdUsuarios(usuario.obtenerUsuarioId(rs.getInt("idUsuario")));              
               reserva.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
               reserva.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());              
               reserva.setImporteTotal(rs.getDouble("ImporteTotal"));
               reserva.setEstado(rs.getBoolean("estado"));
               
               }else{
                JOptionPane.showMessageDialog(null,"No existe la Reserva");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Reserva"+ex.getMessage());
        }
        return reserva;
    }
    
    public void crearReserva(Reserva reserva){
        
        PreparedStatement ps = null;
        String sql = "INSERT INTO reserva(idHabitacion, idHuesped, idUsuario, fechaEntrada, fechaSalida, ImporteTotal, cantPersonas, estado) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,reserva.getIdHabitacion().getIdHabitacion());
            ps.setInt(2,reserva.getIdHuesped().getIdHuesped());
            ps.setInt(3,reserva.getIdUsuarios().getIdUsuario());
            ps.setDate(4,Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(5,Date.valueOf(reserva.getFechaSalida()));
            ps.setDouble(6, reserva.getImporteTotal());
            ps.setInt(7, reserva.getCantPersonas());
            ps.setBoolean(8, reserva.isEstado());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Reserva guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
    }
     public Reserva buscarReservaId(int id){
        Reserva reserva= null;
        
        String sql = "SELECT * FROM reserva WHERE idReserva=?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               reserva = new Reserva();
               reserva.setIdReserva(id);
               reserva.setIdHabitacion(habitacion.buscarHabitacionId(rs.getInt("idHabitacion")));
               reserva.setIdHuesped(huesped.buscarHuespedPorId(rs.getInt("idHuesped")));
               reserva.setIdUsuarios(usuario.obtenerUsuarioId(rs.getInt("idUsuario")));              
               reserva.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
               reserva.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());   
               reserva.setCheckIn(rs.getDate("checkIn") != null ? rs.getDate("checkIn").toLocalDate() : null);
               reserva.setImporteTotal(rs.getDouble("ImporteTotal"));
               reserva.setEstado(rs.getBoolean("estado"));
               
               }else{
                JOptionPane.showMessageDialog(null,"No existe la Reserva");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Reserva"+ex.getMessage());
        }
        return reserva;
     }
     
    public void eliminarReserva(int idReserva){
        PreparedStatement ps = null;
        String sql = "DELETE FROM reserva WHERE idReserva = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }
            ps.close();
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla reserva");
        }
        
    }
     public void modificarReserva(Reserva reserva){
      // no se si tiene sentdo modificar   
         String sql = "UPDATE reserva SET idHabitacion =?,"
                 + "idHuesped=?,idUsuario=?,fechaEntrada=?,fechaSalida=?,ImporteTotal=?,"
                 + "cantPersonas=?,estado=? WHERE idReserva=?";
        
    }
    public void cancelarReserva(int id){
        
        String sql="UPDATE `reserva` SET estado=false WHERE idReserva = ?";
        PreparedStatement ps = null;
        
         try {
             ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             
             int fila = ps.executeUpdate();
             if (fila >0){
             //JOptionPane.showMessageDialog(null, "Reserva Cancelada");            
             }
             ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla reserva"+ ex.getMessage());
         }
        
    }
    
   public ArrayList<Reserva> listarReserva(){
   
       ArrayList<Reserva> reserva = new ArrayList<>();
       String sql = "SELECT * FROM reserva WHERE estado = true AND checkIn IS NOT NULL " +
               "UNION " +
               "SELECT * FROM reserva WHERE estado = true AND checkIn IS NULL";
       PreparedStatement ps = null;
       ResultSet rs =null;
       
         try {
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             
             while (rs.next()){
                 Reserva res = new Reserva();
                 res.setIdReserva(rs.getInt("idReserva"));                
                 res.setIdHabitacion(habitacion.buscarHabitacionId(rs.getInt("idHabitacion")));               
                 res.setIdHuesped(huesped.buscarHuespedPorId(rs.getInt("idHuesped")));
                 res.setIdUsuarios(usuario.obtenerUsuarioId(rs.getInt("idUsuario")));
                 res.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                 res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                 res.setCheckIn(rs.getDate("checkIn") != null ? rs.getDate("checkIn").toLocalDate() : null);
                 res.setImporteTotal(rs.getDouble("ImporteTotal"));
                 res.setCantPersonas(rs.getInt("cantPersonas"));
                 
                 reserva.add(res);                 
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla reserva"+ ex.getMessage());
         }
   
         return reserva;  
   }
   
    public void modificarCheckInReserva(int reserva,LocalDate check) {

        String sql = "UPDATE reserva SET checkIn =? WHERE idReserva =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(check));
            ps.setInt(2, reserva);

            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "check-in realizado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla reserva" + ex.getMessage());
        }
     }
    
     public void modificarCheckOutReserva(int reserva,LocalDate check) {

        String sql = "UPDATE reserva SET checkOut =? WHERE idReserva =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(check));
            ps.setInt(2, reserva);

            int fila = ps.executeUpdate();
            if (fila > 0) {
                //JOptionPane.showMessageDialog(null, "check-Out realizado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla reserva" + ex.getMessage());
        }   
     }
}//------------------fin-------------------
