/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UsuariosData {

    private Connection con = null;

    public UsuariosData() {
        con = Conexion.getConexion();
    }

    public Usuarios obtenerUsuario(int dni) {

        Usuarios usuario = null;
        PreparedStatement ps = null;
        String sql = "SELECT idUsuario, nombre, apellido, dni, sexo, direccion, cargo, estado FROM usuario WHERE dni=?";
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
            }

            ps.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla usuario");
        }
        return usuario;
    }
}
