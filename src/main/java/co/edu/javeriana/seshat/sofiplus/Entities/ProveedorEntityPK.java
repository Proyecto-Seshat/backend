package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProveedorEntityPK implements Serializable {
    @Id
    private String nitFamiempresa;
    @Id
    private String idPersona;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorEntityPK that = (ProveedorEntityPK) o;
        return Objects.equals(nitFamiempresa, that.nitFamiempresa) && Objects.equals(idPersona, that.idPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nitFamiempresa, idPersona);
    }
}
