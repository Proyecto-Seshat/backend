package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(RolFamiempresaEntityPK.class)
public class RolFamiempresaEntity {
    @Id
    private String idPersona;
    @Id
    private String nitFamiempresa;
    private String rol;

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNitFamiempresa() {
        return nitFamiempresa;
    }

    public void setNitFamiempresa(String nitFamiempresa) {
        this.nitFamiempresa = nitFamiempresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolFamiempresaEntity that = (RolFamiempresaEntity) o;
        return Objects.equals(idPersona, that.idPersona) && Objects.equals(nitFamiempresa, that.nitFamiempresa) && Objects.equals(rol, that.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nitFamiempresa, rol);
    }
}
