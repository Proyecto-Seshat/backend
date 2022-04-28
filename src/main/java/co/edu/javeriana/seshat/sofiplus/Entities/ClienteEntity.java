package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ClienteEntityPK.class)
public class ClienteEntity {
    @Id
    private String nitFamiempresa;
    @Id
    private String idPersona;
    private double debito;
    private double credito;

    public String getNitFamiempresa() {
        return nitFamiempresa;
    }

    public void setNitFamiempresa(String nitFamiempresa) {
        this.nitFamiempresa = nitFamiempresa;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return Double.compare(that.debito, debito) == 0 && Double.compare(that.credito, credito) == 0 && Objects.equals(nitFamiempresa, that.nitFamiempresa) && Objects.equals(idPersona, that.idPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nitFamiempresa, idPersona, debito, credito);
    }
}
