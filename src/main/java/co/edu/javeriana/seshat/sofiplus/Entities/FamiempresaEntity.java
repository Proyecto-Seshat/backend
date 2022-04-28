package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FamiempresaEntity {
    @Id
    private String nit;
    private String razonSocial;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamiempresaEntity that = (FamiempresaEntity) o;
        return Objects.equals(nit, that.nit) && Objects.equals(razonSocial, that.razonSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nit, razonSocial);
    }
}
