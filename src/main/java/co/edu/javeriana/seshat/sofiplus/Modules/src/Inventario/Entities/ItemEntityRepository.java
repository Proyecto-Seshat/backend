package co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario.Entities.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemEntityRepository extends JpaRepository<ItemEntity, String> {
    List<ItemEntity> findAllByNitFamiempresa(String nitFamiempresa);
}