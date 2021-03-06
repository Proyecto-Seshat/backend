package co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario.Entities.ServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicioEntityRepository extends JpaRepository<ServicioEntity, String> {
    public List<ServicioEntity> findAllByNitFamiempresa(String nitFamiempresa);
}