package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ConsolidadoEntityPK implements Serializable {
    @Id
    private int idRecurso;
    @Id
    private String nitFamiempresa;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsolidadoEntityPK that = (ConsolidadoEntityPK) o;
        return idRecurso == that.idRecurso && Objects.equals(nitFamiempresa, that.nitFamiempresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecurso, nitFamiempresa);
    }
}
