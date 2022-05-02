package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import java.util.List;

public class Factura {
    String clienteCedula;
    double total;
    List<CarritoItem> carrito;

    public Factura() {
    }

    public Factura(String clienteCedula, double total, List<CarritoItem> carrito) {
        this.clienteCedula = clienteCedula;
        this.total = total;
        this.carrito = carrito;
    }

    public String getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(String clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<CarritoItem> carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        String cedula = "clienteCedula: " + this.clienteCedula + "\n";
        String total = "total: " + this.total + "\n";
        String ret = "Carrito{\n";
        for (CarritoItem item :
                this.carrito) {
            ret = ret + item.toString() + "\n";
        }
        ret = ret + "}";
        return cedula + total + ret;
    }
}
