package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ConsolidadoEntityPK.class)
public class ConsolidadoEntity {
    @Id
    private int idRecurso;
    @Id
    private String nitFamiempresa;
    private double saldo;

    public int getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(int idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getNitFamiempresa() {
        return nitFamiempresa;
    }

    public void setNitFamiempresa(String nitFamiempresa) {
        this.nitFamiempresa = nitFamiempresa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsolidadoEntity that = (ConsolidadoEntity) o;
        return idRecurso == that.idRecurso && Double.compare(that.saldo, saldo) == 0 && Objects.equals(nitFamiempresa, that.nitFamiempresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, nitFamiempresa, saldo);
    }
}
