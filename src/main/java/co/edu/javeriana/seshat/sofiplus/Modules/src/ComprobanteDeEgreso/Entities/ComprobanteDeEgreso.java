package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities;

public class ComprobanteDeEgreso {//aca viene lo privado

    private String cedulaAQuienPaga;
    private String nombreAQuienPaga;
    private String idElaborador;
    private String idAprovador;
    private double debitos;
    private double creditos;
    private boolean aprovado; //booleano aprovado si==true, no ==false


    public ComprobanteDeEgreso() {
    }

    public ComprobanteDeEgreso(String cedulaAQuienPaga, String nombreAQuienPaga, String idElaborador, String idAprovador,double debitos, double creditos) {
        this.cedulaAQuienPaga = cedulaAQuienPaga;
        this.nombreAQuienPaga = nombreAQuienPaga;
        this.idElaborador = idElaborador;
        this.idAprovador = idAprovador;
        this.debitos = debitos;
        this.creditos = creditos;
        this.aprovado = false;
    }

    public String getCedulaAQuienPaga() {
        return cedulaAQuienPaga;
    }

    public void setCedulaAQuienPaga(String cedulaAQuienPaga) {
        this.cedulaAQuienPaga = cedulaAQuienPaga;
    }

    public String getNombreAQuienPaga() {
        return nombreAQuienPaga;
    }

    public void setNombreAQuienPaga(String nombreAQuienPaga) {
        this.nombreAQuienPaga = nombreAQuienPaga;
    }

    public String getIdElaborador() {
        return idElaborador;
    }

    public void setIdElaborador(String idElaborador) {
        this.idElaborador = idElaborador;
    }

    public String getIdAprovador() {
        return idAprovador;
    }

    public void setIdAprovador(String idAprovador) {
        this.idAprovador = idAprovador;
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

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        return "ComprobanteDeEgreso{" +
                "cedulaAQuienPaga='" + cedulaAQuienPaga + '\'' +
                ", nombreAQuienPaga='" + nombreAQuienPaga + '\'' +
                ", idElaborador='" + idElaborador + '\'' +
                ", idAprovador='" + idAprovador + '\'' +
                ", debitos=" + debitos +
                ", creditos=" + creditos +
                '}';
    }
}
