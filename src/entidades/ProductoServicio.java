
package entidades;

public class ProductoServicio {
    private int idProductoServicio;
    private String categoria;
    private String nombre;
    private String descripcion;
    private double precioVenta;
    private int stock; 
    private boolean estado;

    public ProductoServicio() {
    }

    public ProductoServicio(String categoria, String nombre, String descripcion, double precioVenta, int stock, boolean estado) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.estado=estado;
    }

    public ProductoServicio(int idProductoServicio, String categoria, String nombre, String descripcion, double precioVenta, int stock, boolean estado) {
        this.idProductoServicio = idProductoServicio;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.estado=estado;
    }

    public int getIdProductoServicio() {
        return idProductoServicio;
    }

    public void setIdProductoServicio(int idProductoServicio) {
        this.idProductoServicio = idProductoServicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ProductoServicio{" + "idProductoServicio=" + idProductoServicio + ", categoria=" + categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", stock=" + stock + ", estado=" + estado + '}';
    }
    

   
    
    
    
}
