
package accesoADatos;

import entidades.Habitacion;
import entidades.ProductoServicio;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoServicioData {
      private Connection con= null;

    public ProductoServicioData() {
                con = Conexion.getConexion();
        
    }
      
    public void guardarProductoServicio(ProductoServicio prodServ) {

        String sql = "INSERT INTO productoservicio (categoria, nombre, descripcion, precioventa,stock,estado) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prodServ.getCategoria());
            ps.setString(2, prodServ.getNombre());
            ps.setString(3, prodServ.getDescripcion());
            ps.setDouble(4, prodServ.getPrecioVenta());
            ps.setInt(5, prodServ.getStock());
            ps.setBoolean(6, prodServ.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                prodServ.setIdProductoServicio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó el producto/servicio correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio " + ex.getMessage());
        }
    }

    public void modificarProductoServicio(ProductoServicio prodServ) {

        String sql = "UPDATE productoservicio SET categoria=?,nombre=?,descripcion=?,precioVenta=?,stock=?,estado=? WHERE idProductoServicio = ?";
        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, prodServ.getCategoria());
            ps.setString(2, prodServ.getNombre());
            ps.setString(3, prodServ.getDescripcion());
            ps.setDouble(4, prodServ.getPrecioVenta());
            ps.setInt(5, prodServ.getStock());
             ps.setBoolean(6, prodServ.isEstado());
            ps.setInt(7, prodServ.getIdProductoServicio());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El producto o servicio no encontrado ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio " + ex.getMessage());
        }
    }
    
    public void eliminarProductoServicio (int id){
  
        
           String sql = "UPDATE productoservicio SET estado = 0 WHERE idProductoServicio = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se eliminó el tipo el Producto/Servicio");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Producto/Servicio"+ex.getMessage());
        }
    }
        
        
  
    public ProductoServicio buscarProductoServicio(String nombre) {//BUSQUEDA POR NOMBRE

        ProductoServicio prodServ = null;

        String sql = "SELECT * FROM productoservicio WHERE nombre = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prodServ = new ProductoServicio();
                prodServ.setIdProductoServicio(rs.getInt("idProductoServicio"));
                prodServ.setCategoria(rs.getString("categoria"));
                prodServ.setNombre(rs.getString("nombre"));
                prodServ.setDescripcion(rs.getString("descripcion"));
                prodServ.setPrecioVenta(rs.getDouble("precioVenta"));
                prodServ.setStock(rs.getInt("stock"));
                prodServ.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El producto/servicio no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio" + ex.getMessage());
        }
        return prodServ;
    }
    
    public ProductoServicio buscarProductoServicioId(int id) {//BUSQUEDA POR ID

        ProductoServicio prodServ = null;

        String sql = "SELECT * FROM productoservicio WHERE idProductoServicio = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prodServ = new ProductoServicio();
                prodServ.setIdProductoServicio(rs.getInt("idProductoServicio"));
                prodServ.setCategoria(rs.getString("categoria"));
                prodServ.setNombre(rs.getString("nombre"));
                prodServ.setDescripcion(rs.getString("descripcion"));
                prodServ.setPrecioVenta(rs.getDouble("precioVenta"));
                prodServ.setStock(rs.getInt("stock"));
                prodServ.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El producto/servicio no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio" + ex.getMessage());
        }
        return prodServ;
    }

    public List<ProductoServicio> listarProductoServicio() {
       
        
        ArrayList<ProductoServicio> prodServ = new ArrayList<>();
      
        String sql = "SELECT * FROM productoservicio";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProductoServicio pserv = new ProductoServicio();
                pserv.setIdProductoServicio(rs.getInt("idProductoServicio"));
                pserv.setCategoria(rs.getString("categoria"));
                pserv.setNombre(rs.getString("nombre"));
                pserv.setDescripcion(rs.getString("descripcion"));
                pserv.setPrecioVenta(rs.getDouble("precioVenta"));
                pserv.setStock(rs.getInt("stock"));
                pserv.setEstado(rs.getBoolean("estado"));
               
                prodServ.add(pserv);
                
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio"  + ex.getMessage());
        }

        return prodServ;
    }
    
    public List<ProductoServicio> listarProductoServ_X_categoria(String categoria) {
        // 

        ArrayList<ProductoServicio> pserv = new ArrayList<>();
     
        String sql = "SELECT* "
                + "FROM productoservicio "
                + "WHERE categoria=?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            
            
               while (rs.next()) {
                ProductoServicio prodserv = new ProductoServicio();
                prodserv.setIdProductoServicio(rs.getInt("idProductoServicio"));
                prodserv.setCategoria(rs.getString("categoria"));
                prodserv.setNombre(rs.getString("nombre"));
                prodserv.setDescripcion(rs.getString("descripcion"));
                prodserv.setPrecioVenta(rs.getDouble("precioVenta"));
                prodserv.setStock(rs.getInt("stock"));
                prodserv.setEstado(rs.getBoolean("estado"));
               
                pserv.add(prodserv);
           
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto/Servicio"  + ex.getMessage());
        }

        return pserv;
    }
    
    public List<ProductoServicio> listarPorNombre(String nombre) {

        List<ProductoServicio> productoServicios= new ArrayList<ProductoServicio>();
        String sql = "SELECT * FROM productoservicio "
                + " WHERE nombre =? AND estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 ProductoServicio prodserv = new ProductoServicio();
                prodserv.setIdProductoServicio(rs.getInt("idProductoServicio"));
                prodserv.setCategoria(rs.getString("categoria"));
                prodserv.setNombre(rs.getString("nombre"));
                prodserv.setDescripcion(rs.getString("descripcion"));
                prodserv.setPrecioVenta(rs.getDouble("precioVenta"));
                prodserv.setStock(rs.getInt("stock"));
                prodserv.setEstado(rs.getBoolean("estado"));

               productoServicios.add(prodserv);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener incripciones" + ex.getMessage());
        }

        return productoServicios;

    }            
    
}//------------------fin-------------------
