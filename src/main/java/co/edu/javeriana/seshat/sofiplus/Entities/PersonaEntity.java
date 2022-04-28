package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PersonaEntity {
    @Id
    private String idPersona;
    private String nombres;
    private String apellidos;

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEntity that = (PersonaEntity) o;
        return Objects.equals(idPersona, that.idPersona) && Objects.equals(nombres, that.nombres) && Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombres, apellidos);
    }
}
