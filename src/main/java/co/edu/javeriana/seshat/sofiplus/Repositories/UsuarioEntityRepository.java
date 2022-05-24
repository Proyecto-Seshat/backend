package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioEntityRepository extends JpaRepository<UsuarioEntity, String> {
    Optional<UsuarioEntity> findUsuarioEntityByEmail(String email);
}