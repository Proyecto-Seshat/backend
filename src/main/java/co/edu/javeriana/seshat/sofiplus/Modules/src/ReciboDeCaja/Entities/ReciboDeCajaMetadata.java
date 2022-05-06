package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class ReciboDeCajaMetadata {//viene lo publico
    @Id
    public String id;
    public Date fecha;
    public double monto;
    public String sumaEnLetras;
    public String porConceptoDe;
    public String recibidoDe;
    public Boolean tipoPago;//efectivo==0 (false) ,  consignacion==1 (true)
    public boolean estado;//activa==0 (false) ,  anulada==1 (true)

    public ReciboDeCajaMetadata() {
    }

    public ReciboDeCajaMetadata(String id, Date fecha, double monto, String sumaEnLetras, String porConceptoDe, String recibidoDe, boolean tipoPago, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.sumaEnLetras = sumaEnLetras;
        this.porConceptoDe = porConceptoDe;
        this.recibidoDe = recibidoDe;
        this.tipoPago = false;
        this.estado = false;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSumaEnLetras() {
        return sumaEnLetras;
    }

    public void setSumaEnLetras(String sumaEnLetras) {
        this.sumaEnLetras = sumaEnLetras;
    }

    public String getPorConceptoDe() {
        return porConceptoDe;
    }

    public void setPorConceptoDe(String porConceptoDe) {
        this.porConceptoDe = porConceptoDe;
    }

    public String getRecibidoDe() {
        return recibidoDe;
    }

    public void setRecibidoDe(String recibidoDe) {
        this.recibidoDe = recibidoDe;
    }

    public Boolean getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(Boolean tipoPago) {
        this.tipoPago = tipoPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ReciboDeCajaMetadata{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", sumaEnLetras='" + sumaEnLetras + '\'' +
                ", porConceptoDe='" + porConceptoDe + '\'' +
                ", recibidoDe='" + recibidoDe + '\'' +
                ", tipoPago=" + tipoPago +
                ", estado=" + estado +
                '}';
    }
}
