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
public class Habitacion {
    
    private int idHabitacion;
    private TipoHabitacion idTipoHabitacion;
    private int numHabitacion;
    private int piso;
    private boolean estado;

    public Habitacion(int idHabitacion, TipoHabitacion idTipoHabitacion, int numHabitacion,int piso, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idTipoHabitacion = idTipoHabitacion;
        this.numHabitacion = numHabitacion;
        this.piso = piso;
        this.estado = estado;
    }
    
    public Habitacion(TipoHabitacion idTipoHabitacion, int numHabitacion, int piso, boolean estado) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.numHabitacion = numHabitacion;
        this.piso = piso;
        this.estado = estado;
    }

    public Habitacion() {}

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(TipoHabitacion idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", "
                + "idTipoHabitacion=" + idTipoHabitacion + ", numHabitacion=" + numHabitacion
                + ", piso=" + piso +", estado=" + estado + '}';
    }
    
    
    
    
    
}
