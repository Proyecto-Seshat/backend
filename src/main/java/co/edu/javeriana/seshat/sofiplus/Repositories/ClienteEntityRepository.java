package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteEntityRepository extends JpaRepository<ClienteEntity, String> {
}