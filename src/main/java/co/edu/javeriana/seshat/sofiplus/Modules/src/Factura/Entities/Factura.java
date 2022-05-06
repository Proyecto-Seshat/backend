package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import java.util.List;

public class Factura {//aca viene lo privado
    private String clienteCedula;
    private double total;
    private List<CarritoItem> carrito;
    private  String nombreCliente;

    public Factura() {
    }

    public Factura(String clienteCedula, double total, List<CarritoItem> carrito, String nombreCliente) {
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

    public List<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<CarritoItem> carrito) {
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
