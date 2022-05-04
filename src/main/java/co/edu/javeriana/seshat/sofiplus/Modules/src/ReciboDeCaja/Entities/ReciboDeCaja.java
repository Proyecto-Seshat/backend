package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem;

import java.util.List;

public class ReciboDeCaja {//aca viene lo privado

    private String cedulaDeQuienPaga;
    private String nombreDeQuienPaga;
    private double idRecibo;
    private double debitos;
    private double creditos;

    public ReciboDeCaja() {
    }

    public ReciboDeCaja(String cedulaDeQuienPaga, String nombreDeQuienPaga, double idRecibo, double debitos, double creditos) {
        this.cedulaDeQuienPaga = cedulaDeQuienPaga;
        this.nombreDeQuienPaga = nombreDeQuienPaga;
        this.idRecibo = idRecibo;
        this.debitos = debitos;
        this.creditos = creditos;
    }

    public String getCedulaDeQuienPaga() {
        return cedulaDeQuienPaga;
    }

    public void setCedulaDeQuienPaga(String cedulaDeQuienPaga) {
        this.cedulaDeQuienPaga = cedulaDeQuienPaga;
    }

    public double getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(double idRecibo) {
        this.idRecibo = idRecibo;
    }

    public String getNombreDeQuienPaga() {
        return nombreDeQuienPaga;
    }

    public void setNombreDeQuienPaga(String nombreDeQuienPaga) {
        this.nombreDeQuienPaga = nombreDeQuienPaga;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "ReciboDeCaja{" +
                "cedulaDeQuienPaga='" + cedulaDeQuienPaga + '\'' +
                ", nombreDeQuienPaga='" + nombreDeQuienPaga + '\'' +
                ", idFactura=" + idRecibo +
                ", debitos=" + debitos +
                ", creditos=" + creditos +
                '}';
    }


}
