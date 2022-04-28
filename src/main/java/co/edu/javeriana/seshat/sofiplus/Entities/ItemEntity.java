package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(ItemEntityPK.class)
public class ItemEntity {
    @Id
    private String nitFamiempresa;
    @Id
    private String codigo;
    private String descripcion;
    private double cantidad;
    private String dimension;
    private String unidadPreferida;
    private double impuesto;
    private double costeUnitario;
    private double costeTotal;
    private double precioVenta;
    private Date fechaIngreso;

    public String getNitFamiempresa() {
        return nitFamiempresa;
    }

    public void setNitFamiempresa(String nitFamiempresa) {
        this.nitFamiempresa = nitFamiempresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getUnidadPreferida() {
        return unidadPreferida;
    }

    public void setUnidadPreferida(String unidadPreferida) {
        this.unidadPreferida = unidadPreferida;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getCosteUnitario() {
        return costeUnitario;
    }

    public void setCosteUnitario(double costeUnitario) {
        this.costeUnitario = costeUnitario;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemEntity that = (ItemEntity) o;
        return Double.compare(that.cantidad, cantidad) == 0 && Double.compare(that.impuesto, impuesto) == 0 && Double.compare(that.costeUnitario, costeUnitario) == 0 && Double.compare(that.costeTotal, costeTotal) == 0 && Double.compare(that.precioVenta, precioVenta) == 0 && Objects.equals(nitFamiempresa, that.nitFamiempresa) && Objects.equals(codigo, that.codigo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(dimension, that.dimension) && Objects.equals(unidadPreferida, that.unidadPreferida) && Objects.equals(fechaIngreso, that.fechaIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nitFamiempresa, codigo, descripcion, cantidad, dimension, unidadPreferida, impuesto, costeUnitario, costeTotal, precioVenta, fechaIngreso);
    }
}
