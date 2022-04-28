package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Entities.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemEntityRepository extends JpaRepository<ItemEntity, String> {
}