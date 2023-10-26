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
public class TipoHabitacion {
    
    private int idTipoHabitacion;
    private String categoria;
    private int cantCamas;
    private int cantPersonas;
    private String tipoCama;
    private double precio;
    private boolean estado;

    public TipoHabitacion(int idTipoHabitacion,String categoria, int cantCamas, int cantPersonas, String tipoCama, double precio,boolean estado) {
        this.idTipoHabitacion= idTipoHabitacion;
        this.categoria=categoria;
        this.cantCamas = cantCamas;
        this.cantPersonas = cantPersonas;
        this.tipoCama = tipoCama;
        this.precio = precio;
        this.estado=estado;
    }

    public TipoHabitacion(String categoria,int cantCamas, int cantPersonas, String tipoCama, double precio,boolean estado) {
        this.categoria=categoria;
        this.cantCamas = cantCamas;
        this.cantPersonas = cantPersonas;
        this.tipoCama = tipoCama;
        this.precio = precio;
        this.estado=estado;
    }

    public TipoHabitacion() {}

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion= idTipoHabitacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idTipoHabitacion+" "+categoria ;
    }
    
   
    
    
    
}
