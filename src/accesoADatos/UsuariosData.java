/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Reserva;
import entidades.Usuarios;
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

public class UsuariosData {

    private Connection con = null;

    public UsuariosData() {
        con = Conexion.getConexion();
    }

    public Usuarios obtenerUsuarioPorDni(int dni) {

        Usuarios usuario = null;
        PreparedStatement ps = null;
        String sql = "SELECT idUsuario, nombre, apellido, dni, sexo, direccion, cargo, estado, contraseña FROM usuario WHERE dni=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setEstado(rs.getBoolean("estado"));
                usuario.setContraseña(rs.getString("contraseña"));
            }

            ps.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
        return usuario;
    }

    public Usuarios obtenerUsuarioId(int id) {

        Usuarios usuario = null;
        PreparedStatement ps = null;
        String sql = "SELECT idUsuario, nombre, apellido, dni, sexo, direccion, cargo, estado FROM usuario WHERE idUsuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(id);
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setEstado(rs.getBoolean("estado"));
            }

            ps.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
        return usuario;
    }

    public void crearUsuario(Usuarios usuario) {

        PreparedStatement ps = null;
        String sql = "INSERT INTO usuario(nombre, apellido, dni, sexo, direccion, cargo, estado, contraseña, email) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getDni());
            ps.setString(4, usuario.getSexo());
            ps.setString(5, usuario.getDireccion());
            ps.setString(6, usuario.getCargo());
            ps.setBoolean(7, usuario.isEstado());
            ps.setString(8, usuario.getContraseña());
            ps.setString(9, usuario.getEmail());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
    }

    public void modificarUsuario(Usuarios user) {
        String sql = " UPDATE usuario SET nombre = ?, apellido= ?, dni= ?, sexo = ?, direccion = ?, cargo = ?, estado = ?, contraseña = ?, email = ? WHERE dni = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setInt(3, user.getDni());
            ps.setString(4, user.getSexo());
            ps.setString(5, user.getDireccion());
            ps.setString(6, user.getCargo());
            ps.setBoolean(7, user.isEstado());
            ps.setString(8, user.getContraseña());
            ps.setString(9, user.getEmail());
            ps.setInt(10, user.getDni());

            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el usuario");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
    }

    public void eliminarUsuarioPorDni(int dni) {
        String sql = "UPDATE usuario SET estado = 0 WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el usuario");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
    }
    
    public void modificarEstadoUsuario(int dni){
        String sql = "UPDATE usuario SET estado = 1 WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"Se modifico el usuario.");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla usuario (m.eliminar)");
        }
    }

    public List<Usuarios> listarUsuarios() {
        String sql = "SELECT * FROM usuario WHERE estado = 1";

        ArrayList<Usuarios> users = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios user = new Usuarios();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setDni(rs.getInt("dni"));
                user.setSexo(rs.getString("Sexo"));
                user.setDireccion(rs.getString("direccion"));
                user.setCargo(rs.getString("cargo"));
                user.setEstado(rs.getBoolean("estado"));
                user.setContraseña(rs.getString("contraseña"));
                user.setEmail(rs.getString("email"));

                users.add(user);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }

        return users;
    }
    
    public List<Usuarios> ListarAdninistradores(){
        String sql = "SELECT * FROM usuario WHERE cargo = 'admin' and estado = 1";

        ArrayList<Usuarios> users = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios user = new Usuarios();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setDni(rs.getInt("dni"));
                user.setSexo(rs.getString("Sexo"));
                user.setDireccion(rs.getString("direccion"));
                user.setCargo(rs.getString("cargo"));
                user.setEstado(rs.getBoolean("estado"));
                user.setContraseña(rs.getString("contraseña"));
                
                users.add(user);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }

        return users;
    }
    
    public List<Usuarios> ListarRecepcionistas(){
        String sql = "SELECT * FROM usuario WHERE cargo = 'recepcionista' and estado = 1";

        ArrayList<Usuarios> users = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios user = new Usuarios();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setDni(rs.getInt("dni"));
                user.setSexo(rs.getString("Sexo"));
                user.setDireccion(rs.getString("direccion"));
                user.setCargo(rs.getString("cargo"));
                user.setEstado(rs.getBoolean("estado"));
                user.setContraseña(rs.getString("contraseña"));

                users.add(user);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }

        return users;
    }
    
    public Usuarios obtenerContra(String email) {

        Usuarios usuario = null;
        PreparedStatement ps = null;
        String sql = "SELECT idUsuario, nombre, apellido, dni, sexo, direccion, cargo, estado, contraseña, email FROM usuario WHERE email=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setEstado(rs.getBoolean("estado"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setEmail(rs.getString("email"));
            }

            ps.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario (metodo obtener usuario)");
        }
        return usuario;
    }
    
    public boolean RecuperarCuenta(String email){
        String sql = "SELECT email FROM usuario WHERE email = ? ";
        boolean msj = false;
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                msj = true; //si existe el email manda un true
            }else {
                msj = false; //si no existe el email manda un false
            }

            ps.close();
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario (recuperar cuenta)");
        }
        return msj;
    }
    
    public void ModificarContraseña(String contraseñaNueva, String email){
        String sql = "UPDATE usuario SET contraseña = ? WHERE email = ?";
        
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, contraseñaNueva);
            ps.setString(2, email);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null,"La contraseña se modifico exitosamente. Inicia sesión");                           
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla usuario (m.modContra)");
        }
    }

}
