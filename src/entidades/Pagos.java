
package entidades;

import java.sql.Date;
import java.time.LocalDate;


public class Pagos {
    
    private int idPagos;
    private Reserva idReserva;
    private double importeTotal;
    private String tipoComprobante;
    private LocalDate fechaEmision;
    private String medioPago;
    private String formaDePago;
    private boolean estado;

    public Pagos() {
    }

    public Pagos(Reserva idReserva, double importeTotal, String tipoComprobante, LocalDate fechaEmision, String medioPago, String formaDePago, boolean estado) {
        this.idReserva = idReserva;
        this.importeTotal = importeTotal;
        this.tipoComprobante = tipoComprobante;
        this.fechaEmision = fechaEmision;
        this.medioPago = medioPago;
        this.formaDePago = formaDePago;
        this.estado = estado;
    }

    public Pagos(int idPagos, Reserva idReserva, double importeTotal, String tipoComprobante, LocalDate fechaEmision, String medioPago, String formaDePago, boolean estado) {
        this.idPagos = idPagos;
        this.idReserva = idReserva;
        this.importeTotal = importeTotal;
        this.tipoComprobante = tipoComprobante;
        this.fechaEmision = fechaEmision;
        this.medioPago = medioPago;
        this.formaDePago = formaDePago;
        this.estado = estado;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pagos{" + "idPagos=" + idPagos + ", idReserva=" + idReserva + ", importeTotal=" + importeTotal + ", tipoComprobante=" + tipoComprobante + ", fechaEmision=" + fechaEmision + ", medioPago=" + medioPago + ", formaDePago=" + formaDePago + ", estado=" + estado + '}';
    }

    
    
}
