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
    
    private int idCategoria;
    private int cantCamas;
    private int cantPersonas;
    private String tipoCama;
    private double precio;

    public TipoHabitacion(int idCategoria, int cantCamas, int cantPersonas, String tipoCama, double precio) {
        this.idCategoria = idCategoria;
        this.cantCamas = cantCamas;
        this.cantPersonas = cantPersonas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion(int cantCamas, int cantPersonas, String tipoCama, double precio) {
        this.cantCamas = cantCamas;
        this.cantPersonas = cantPersonas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion() {}

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idCategoria=" + idCategoria + ", cantCamas=" + cantCamas + 
                ", cantPersonas=" + cantPersonas + ", tipoCama=" + tipoCama + ", precio=" + precio + '}';
    }
    
    
    
}
