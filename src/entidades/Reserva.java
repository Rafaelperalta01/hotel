/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Lenovo 320
 */
public class Reserva {
    
    private int idReserva;
    private Habitacion idHabitacion;
    private Huesped idHuesped;
    private Usuarios idUsuarios;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double importeTotal;
    private int cantPersonas;
    private boolean estado;

    public Reserva(int idReserva, Habitacion idHabitacion, Huesped idHuesped,Usuarios idUsuarios, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal, int cantPersonas, boolean estado) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
        this.idUsuarios= idUsuarios;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.importeTotal = importeTotal;
        this.cantPersonas = cantPersonas;
        this.estado = estado;
    }

    public Reserva(Habitacion idHabitacion, Huesped idHuesped,Usuarios idUsuarios, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal, int cantPersonas, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
         this.idUsuarios= idUsuarios;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importeTotal = importeTotal;
        this.cantPersonas = cantPersonas;
        this.estado = estado;
    }

    public Reserva() {}

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Usuarios getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Usuarios idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void realizarCheckIn() {
        this.checkIn = LocalDate.now();
    }

    public void realizarCheckOut() {
        this.checkOut = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHabitacion=" + idHabitacion + ", idHuesped=" + idHuesped + ", idUsuarios=" + idUsuarios + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", importeTotal=" + importeTotal + ", cantPersonas=" + cantPersonas + ", estado=" + estado + '}';
    }

   
    
    
    
    
}
