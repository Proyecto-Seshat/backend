package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class FacturaMetadata {
    @Id
    public String id;
    public double total;
    public Date fechaVencimiento;

    public List<CarritoItem> carrito;

    public FacturaMetadata() {
    }

    public FacturaMetadata(String id, double total, Date fechaVencimiento, List<CarritoItem> carrito) {
        this.id = id;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.carrito = carrito;
    }

    public List<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<CarritoItem> carrito) {
        this.carrito = carrito;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "FacturaMetadata{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
