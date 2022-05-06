package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem;

import java.util.List;

public class Devolucion {
    //aca viene lo privado
    String clienteCedula;
    double total;
    List<co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem> carrito;
    public String nombreCliente;

    public Devolucion() {
    }

    public Devolucion(String clienteCedula, double total, List<co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem> carrito, String nombreCliente) {
        this.clienteCedula = clienteCedula;
        this.total = total;
        this.carrito = carrito;
        this.nombreCliente = nombreCliente;
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

    public List<co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem> carrito) {
        this.carrito = carrito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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
