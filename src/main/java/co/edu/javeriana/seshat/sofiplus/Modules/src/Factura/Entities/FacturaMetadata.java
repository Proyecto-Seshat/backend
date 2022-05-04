package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;

public class FacturaMetadata {//viene lo publico
    @Id
    public String id;
    public double total;
    public Date fechaVencimiento;
    public List<CarritoItem>    carrito;
    public Date fecha;
    public Boolean tipoPago;//credito==1 contado==0

    public FacturaMetadata() {
    }

    public FacturaMetadata(String id, double total, Date fechaVencimiento, List<CarritoItem> carrito, Date fecha,  Boolean tipoPago) {
        this.id = id;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.carrito = carrito;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Boolean getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(Boolean tipoPago) {
        this.tipoPago = tipoPago;
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
