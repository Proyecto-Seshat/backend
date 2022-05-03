package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

public class CarritoItem {
    public String nombre;
    public int cantidad;

    public int descuento;

    public int idItem;


    public CarritoItem() {
    }

    public CarritoItem(String nombre, int cantidad, int descuento, int idItem) {

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.idItem = idItem;
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    @Override
    public String toString() {
        return "CarritoItem{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
