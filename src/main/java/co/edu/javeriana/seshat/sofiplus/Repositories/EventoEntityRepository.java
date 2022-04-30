package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoEntityRepository extends JpaRepository<EventoEntity, EventoEntityPK> {
}