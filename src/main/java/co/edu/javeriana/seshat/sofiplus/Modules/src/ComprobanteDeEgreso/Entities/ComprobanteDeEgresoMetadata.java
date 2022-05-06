package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ComprobanteDeEgresoMetadata {//viene lo publico
    @Id
    public String id;
    public Date fecha;
    public double monto;
    public String sumaEnLetras;
    public String porConceptoDe;
    public String pagadoA;
    public Boolean tipoPago;//efectivo==0 (false) ,  consignacion==1 (true)
    public boolean estado;//activa==0 (false) ,  anulada==1 (true)

    public ComprobanteDeEgresoMetadata() {
    }

    public ComprobanteDeEgresoMetadata(String id, Date fecha, double monto, String sumaEnLetras, String porConceptoDe, String pagadoA, boolean tipoPago, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.sumaEnLetras = sumaEnLetras;
        this.porConceptoDe = porConceptoDe;
        this.pagadoA = pagadoA;
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

    public String getPagadoA() {
        return pagadoA;
    }

    public void setPagadoA(String pagadoA) {
        this.pagadoA = pagadoA;
    }

    public Boolean getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(Boolean tipoPago) {
        this.tipoPago = tipoPago;
    }

    public boolean getEstado() {
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
                ", recibidoDe='" + pagadoA + '\'' +
                ", tipoPago=" + tipoPago +
                ", estado=" + estado +
                '}';
    }
}
