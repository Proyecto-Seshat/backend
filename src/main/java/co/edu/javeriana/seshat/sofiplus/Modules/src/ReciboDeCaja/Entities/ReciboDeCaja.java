package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.CarritoItem;

import java.util.List;

public class ReciboDeCaja {//aca viene lo privado

    private String cedulaDeQuienPaga;
    private String nombreDeQuienPaga;
    private double idFacturaAsociada;
    private double debitos;
    private double creditos;

    public ReciboDeCaja() {
    }

    public ReciboDeCaja(String cedulaDeQuienPaga, String nombreDeQuienPaga, double idFacturaAsociada, double debitos, double creditos) {
        this.cedulaDeQuienPaga = cedulaDeQuienPaga;
        this.nombreDeQuienPaga = nombreDeQuienPaga;
        this.idFacturaAsociada = idFacturaAsociada;
        this.debitos = debitos;
        this.creditos = creditos;
    }

    public String getCedulaDeQuienPaga() {
        return cedulaDeQuienPaga;
    }

    public void setCedulaDeQuienPaga(String cedulaDeQuienPaga) {
        this.cedulaDeQuienPaga = cedulaDeQuienPaga;
    }

    public double getIdFacturaAsociada() {
        return idFacturaAsociada;
    }

    public void setIdFacturaAsociada(double idFacturaAsociada) {
        this.idFacturaAsociada = idFacturaAsociada;
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
                ", idFactura=" + idFacturaAsociada +
                ", debitos=" + debitos +
                ", creditos=" + creditos +
                '}';
    }


}
