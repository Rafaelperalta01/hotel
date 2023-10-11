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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class ReservaData {
     private Connection con= null;

    public ReservaData() {
        con=Conexion.getConexion();
    }
         
    public void buscarReservaPorHuesped(int dni){
        Reserva reserva= null;
        Habitacion habitacion = null;
        String sql = "SELECT * FROM reserva WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               reserva = new Reserva();
               habitacion = new Habitacion();
               reserva.setIdReserva(rs.getInt("idReserva"));
               reserva.setIdHabitacion((Habitacion)rs.getObject("idTipoHabitacion"));
               reserva.setIdHuesped((Huesped)rs.getObject("idHuesped"));
               reserva.setIdUsuarios((Usuarios)rs.getObject("idUsuario"));
               reserva.setImporteTotal(rs.getDouble("precio"));
               reserva.setEstado(rs.getBoolean("estado"));
               }else{
                JOptionPane.showMessageDialog(null,"No existe el huesped");
            } 
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Huesped"+ex.getMessage());
        }
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
                JOptionPane.showMessageDialog(null, "Reserva guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva"+ex.getMessage());
        }
    }
    
    public void cancelarReserva(int idReserva){
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
    
    public void buscarReservaPorFecha(){
        
    }
    
    public void modificarReserva(){
        
    }
    
    
    
    
}//------------------fin-------------------
