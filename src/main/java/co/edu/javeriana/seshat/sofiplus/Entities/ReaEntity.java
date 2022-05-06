package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ReaEntityPK.class)
public class ReaEntity {
    @Id
    private String idEvento;
    @Id
    private String nitFamiempresa;
    @Id
    private String idRecurso;
    private double afectacion;

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNitFamiempresa() {
        return nitFamiempresa;
    }

    public void setNitFamiempresa(String nitFamiempresa) {
        this.nitFamiempresa = nitFamiempresa;
    }

    public String getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(String idRecurso) {
        this.idRecurso = idRecurso;
    }

    public double getAfectacion() {
        return afectacion;
    }

    public void setAfectacion(double afectacion) {
        this.afectacion = afectacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReaEntity reaEntity = (ReaEntity) o;
        return idRecurso == reaEntity.idRecurso && Double.compare(reaEntity.afectacion, afectacion) == 0 && Objects.equals(idEvento, reaEntity.idEvento) && Objects.equals(nitFamiempresa, reaEntity.nitFamiempresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvento, nitFamiempresa, idRecurso, afectacion);
    }
}
