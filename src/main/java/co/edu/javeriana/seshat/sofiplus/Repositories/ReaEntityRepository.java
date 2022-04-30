package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaEntityRepository extends JpaRepository<ReaEntity, ReaEntityPK> {
}