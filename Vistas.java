package Vistas;

public class Vistas {

    private int codigo;
    private String nombre;
    private double precioT;
    private double precioU;
    private int cantidad;

    public Vistas() {
    }

    public Vistas(int codigo, String nombre, double precioUn, double precioT, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioT = precioT;
        this.precioU = precioUn;
        this.cantidad = cantidad;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioT() {
        return precioT;
    }

    public double getPrecioU() {
        return precioU;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioU;
    }

    public void setPrecioUnitario(double precio) {
        this.precioU = precio;
    }

    public double getPrecioTotal() {
        return precioT;
    }

    public void setPrecioTotal(double precio) {
        this.precioT = precioT;
    }

}
