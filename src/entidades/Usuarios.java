/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Lenovo 320
 */
public class Usuarios {
    
    private int idUsuario;
    private String nombre;
    private String apellido;
    private int dni;
    private String sexo;
    private String direccion;
    private String cargo;
    private boolean estado;
    private String contraseña;
    private String email;

    public Usuarios(int idUsuario, String nombre, String apellido, int dni, String sexo, String direccion, String cargo, boolean estado, String contraseña, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.direccion = direccion;
        this.cargo = cargo;
        this.estado = estado;
        this.contraseña = contraseña;
        this.email = email;
    }

    public Usuarios(String nombre, String apellido, int dni, String sexo, String direccion, String cargo, boolean estado,String contraseña, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.direccion = direccion;
        this.cargo = cargo;
        this.estado = estado;
        this.contraseña = contraseña;
        this.email = email;
    }

    public Usuarios() {}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido 
                + ", dni=" + dni + ", sexo=" + sexo + ", direccion=" + direccion + ", cargo=" 
                + cargo + ", estado=" + estado + ", contraseña= "+contraseña+ '}';
    }
    
}
