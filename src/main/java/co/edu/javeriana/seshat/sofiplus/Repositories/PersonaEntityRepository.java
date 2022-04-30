package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, String> {
}