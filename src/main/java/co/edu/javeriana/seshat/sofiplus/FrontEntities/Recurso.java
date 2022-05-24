package co.edu.javeriana.seshat.sofiplus.FrontEntities;

public class Recurso {
    String idRecurso;
    String cuenta;

    public Recurso() {
    }

    public Recurso(String idRecurso, String cuenta) {
        this.idRecurso = idRecurso;
        this.cuenta = cuenta;
    }

    public String getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(String idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
