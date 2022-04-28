package co.edu.javeriana.seshat.sofiplus.Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@IdClass(EventoEntityPK.class)
public class EventoEntity {
    @Id
    private String idEvento;
    @Id
    private String nitFamiempresa;
    private Timestamp fecha;
    private String tipoEvento;
    private String agenteInterno;
    private String agenteExterno;

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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getAgenteInterno() {
        return agenteInterno;
    }

    public void setAgenteInterno(String agenteInterno) {
        this.agenteInterno = agenteInterno;
    }

    public String getAgenteExterno() {
        return agenteExterno;
    }

    public void setAgenteExterno(String agenteExterno) {
        this.agenteExterno = agenteExterno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventoEntity that = (EventoEntity) o;
        return Objects.equals(idEvento, that.idEvento) && Objects.equals(nitFamiempresa, that.nitFamiempresa) && Objects.equals(fecha, that.fecha) && Objects.equals(tipoEvento, that.tipoEvento) && Objects.equals(agenteInterno, that.agenteInterno) && Objects.equals(agenteExterno, that.agenteExterno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvento, nitFamiempresa, fecha, tipoEvento, agenteInterno, agenteExterno);
    }
}
