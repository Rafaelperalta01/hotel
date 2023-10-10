
package accesoADatos;

import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class HabitacionData {
     private Connection con= null;

    public HabitacionData() {
        con=Conexion.getConexion();
    }
    public void guardarHabitacion(Habitacion hab) {

        String sql = "INSERT INTO habitacion (idTipoHabitacion, numHabitacion, piso, estado) VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, hab.getIdTipoHabitacion().getIdTipoHabitacion());
            ps.setInt(2, hab.getNumHabitacion());
            ps.setInt(3, hab.getPiso());
            ps.setBoolean(4, hab.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                hab.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó un Habitación con éxito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }
    }

    public void Alta_o_Baja_Habitacion(int numH, boolean estado) {
        // este método solo modifica el estado si la habitación está ocupada(1), libre(0)

        String sql = "UPDATE habitacion SET estado = ? WHERE numHabitacion = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, numH);

            int fila = ps.executeUpdate();

            if (fila == 1){
                JOptionPane.showMessageDialog(null, "Se realizo la modificación.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion" + ex.getMessage());
        }
    }
    
//     public void Baja_Habitacion(int numH) {
//        // este método solo modifica el estado si la habitación está ocupada(1), libre(0)
//
//        String sql = "UPDATE habitacion SET estado = 0 WHERE numHabitacion = ? ";
//        PreparedStatement ps = null;
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, numH);
//
//            int fila = ps.executeUpdate();
//
//            if (fila == 1) {
//                JOptionPane.showMessageDialog(null, "La habitación está vacía.");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion" + ex.getMessage());
//        }
//    }
//    
    public void modificarHabitacion(Habitacion hab) {
        
        String sql = "UPDATE habitacion SET idTipoHabitacion = ?, numHabitacion = ?, piso = ? WHERE idHabitacion = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, hab.getIdTipoHabitacion().getIdTipoHabitacion());
            ps.setInt(2, hab.getNumHabitacion());
            ps.setInt(3, hab.getPiso());
            ps.setInt(4, hab.getIdHabitacion());
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la habitación exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitación no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla habitacion "+ex.getMessage());
        }
    }
    
    public void modificarCategoriaHabitacion(TipoHabitacion hab, int a , int b) {
        // modifica en la base de datos el tipo de habitacion de muchas habitaciones continuas
        // ejemplo, modificar la categoria de las habitaciones del 100 al 150
        // la numhabitacion a siempre debe ser menor que la numhabitacion b
        
        String sql = "UPDATE habitacion SET idTipoHabitacion = ? WHERE numHabitacion BETWEEN ? AND ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, hab.getIdTipoHabitacion());
            ps.setInt(2, a);
            ps.setInt(3, b);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la categoría de las habitaciones .");
            } else {
                JOptionPane.showMessageDialog(null, "La habitación no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla habitacion "+ex.getMessage());
        }
    }
    
    public Habitacion buscarHabitacion(int nroHab) {
        //busca una habitacion por el numero de la habitacion
        Habitacion hab = null;
        String sql = "SELECT * FROM habitacion WHERE numHabitacion = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, nroHab);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setIdTipoHabitacion((TipoHabitacion)rs.getObject("idTipoHabitacion"));
                hab.setNumHabitacion(rs.getInt("numHabitacion"));
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No habitación no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }
         return hab;
    }
    
    public ArrayList<Habitacion> listarHabitacion() {
        // lista todas las habitaciones de la base de datos
        
        ArrayList<Habitacion> hab = new ArrayList<>();
        TipoHabitacionData idata = new TipoHabitacionData();
        String sql = "SELECT * FROM habitacion";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipo = idata.buscarTipoHabPorId(h.getIdTipoHabitacion().getIdTipoHabitacion());          
                h.setIdTipoHabitacion(tipo);              
                h.setNumHabitacion(rs.getInt("numHabitacion"));
                h.setPiso(rs.getInt("piso"));
                h.setEstado(rs.getBoolean("estado"));
                hab.add(h);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }

        return hab;
    }
    
    public ArrayList<Habitacion> listarHabitacion_X_estado(boolean estado) {
        // lista todas las habitaciones de la base de datos segun si estan disponibles 

        ArrayList<Habitacion> hab = new ArrayList<>();
        TipoHabitacionData idata = new TipoHabitacionData();
        String sql = "SELECT * FROM habitacion WHERE estado = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipo = idata.buscarTipoHabPorId(h.getIdTipoHabitacion().getIdTipoHabitacion());          
                h.setIdTipoHabitacion(tipo);  
                h.setNumHabitacion(rs.getInt("numHabitacion"));
                h.setPiso(rs.getInt("piso"));
                h.setEstado(rs.getBoolean("estado"));

                hab.add(h);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }

        return hab;
    }
    
    public ArrayList<Habitacion> listarHabitacion_X_piso(int piso) {
        // lista por número de piso

        ArrayList<Habitacion> hab = new ArrayList<>();
        TipoHabitacionData idata = new TipoHabitacionData();
        String sql = "SELECT * FROM habitacion WHERE piso = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, piso);

            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipo = idata.buscarTipoHabPorId(h.getIdTipoHabitacion().getIdTipoHabitacion());          
                h.setIdTipoHabitacion(tipo);  
                h.setNumHabitacion(rs.getInt("numHabitacion"));
                h.setPiso(rs.getInt("piso"));
                h.setEstado(rs.getBoolean("estado"));

                hab.add(h);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }

        return hab;
    }
    
    public ArrayList<Habitacion> listarHabitacion_X_categoria(String categoria) {
        // 

        ArrayList<Habitacion> hab = new ArrayList<>();
        TipoHabitacionData idata = new TipoHabitacionData();
        String sql = "SELECT habitacion.* "
                + "FROM habitacion,tipohabitacion "
                + "WHERE habitacion.idTipoHabitacion = tipohabitacion.idTipoHabitacion AND tipohabitacion.categoria = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idHabitacion"));
                TipoHabitacion tipo = idata.buscarTipoHabPorId(h.getIdTipoHabitacion().getIdTipoHabitacion());          
                h.setIdTipoHabitacion(tipo);  
                h.setNumHabitacion(rs.getInt("numHabitacion"));
                h.setPiso(rs.getInt("piso"));
                h.setEstado(rs.getBoolean("estado"));

                hab.add(h);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion " + ex.getMessage());
        }

        return hab;
    }
}//------------------fin-------------------
