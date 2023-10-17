
package entidades;


public class Consumo {
    private int idConsumo;
    private Reserva idReseva;
    private ProductoServicio idProductoServicio;
    private int unidades;
    private double costoTotal;
    private boolean estado;

    public Consumo() {
    }

    public Consumo(Reserva idReseva, ProductoServicio idProductoServicio, int unidades, double costoTotal, boolean estado) {
        this.idReseva = idReseva;
        this.idProductoServicio = idProductoServicio;
        this.unidades = unidades;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public Consumo(int idConsumo, Reserva idReseva, ProductoServicio idProductoServicio, int unidades, double costoTotal, boolean estado) {
        this.idConsumo = idConsumo;
        this.idReseva = idReseva;
        this.idProductoServicio = idProductoServicio;
        this.unidades = unidades;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdCosumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Reserva getIdReseva() {
        return idReseva;
    }

    public void setIdReseva(Reserva idReseva) {
        this.idReseva = idReseva;
    }

    public ProductoServicio getIdProductoServicio() {
        return idProductoServicio;
    }

    public void setIdProductoServicio(ProductoServicio idProductoServicio) {
        this.idProductoServicio = idProductoServicio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Consumo{" + "idProductoServicio=" + idProductoServicio + ", unidades=" + unidades + ", costoTotal=" + costoTotal + '}';
    }
    
    
    
    
}
