package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

public class CarritoItem {
    public String nombre;
    public int cantidad;

    public CarritoItem() {
    }

    public CarritoItem(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CarritoItem{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
