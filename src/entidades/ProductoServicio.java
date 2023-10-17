
package entidades;

public class ProductoServicio {
    private int idProductoServicio;
    private String categoria;
    private String nombre;
    private String descripcion;
    private double precioVenta;
    private int stock; 

    public ProductoServicio() {
    }

    public ProductoServicio(String categoria, String nombre, String descripcion, double precioVenta, int stock) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public ProductoServicio(int idProductoServicio, String categoria, String nombre, String descripcion, double precioVenta, int stock) {
        this.idProductoServicio = idProductoServicio;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
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

    @Override
    public String toString() {
        return "ProductoServicio{" + "categoria=" + categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", stock=" + stock + '}';
    }
    
    
    
}
