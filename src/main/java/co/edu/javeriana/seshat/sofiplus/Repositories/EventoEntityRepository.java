package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface EventoEntityRepository extends JpaRepository<EventoEntity, EventoEntityPK> {
    public List<EventoEntity> findAllByNitFamiempresaAndTipoEvento(String nitFamiempresa, String tipoEvento);

    public List<EventoEntity> findAllByNitFamiempresaAndTipoEventoAndFecha(String nitFamiempresa, String tipoEvento, Date fecha);
}