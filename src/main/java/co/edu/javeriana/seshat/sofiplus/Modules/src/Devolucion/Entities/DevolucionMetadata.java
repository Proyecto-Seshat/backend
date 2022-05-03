package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class DevolucionMetadata    {
    @Id
    public String id;
    public double total;
    public Date fechaVencimiento;
    public List<CarritoItem>    carrito;
    public Date fecha;
    public String nombreCliente;
    public Boolean tipoPago;
    public DevolucionMetadata() {
    }




    public DevolucionMetadata(String id, double total, Date fechaVencimiento, List<CarritoItem> carrito) {
        this.id = id;
        this.total = total;
        this.fechaVencimiento = fechaVencimiento;
        this.carrito = carrito;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
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

    public List<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<CarritoItem> carrito) {
        this.carrito = carrito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Boolean getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(Boolean tipoPago) {
        this.tipoPago = tipoPago;
    }


    @Override
    public String toString() {
        return "DevolucionMetadata{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", fechaVencimiento=" + fechaVencimiento +
                ", carrito=" + carrito +
                ", fecha=" + fecha +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", tipoPago=" + tipoPago +
                '}';
    }
}
