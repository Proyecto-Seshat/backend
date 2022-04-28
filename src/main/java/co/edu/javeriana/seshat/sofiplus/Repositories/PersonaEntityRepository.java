package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, String> {
}