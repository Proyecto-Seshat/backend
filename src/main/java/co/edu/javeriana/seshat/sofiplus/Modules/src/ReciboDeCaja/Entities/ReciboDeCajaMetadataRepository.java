package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface ReciboDeCajaMetadataRepository extends MongoRepository<ReciboDeCajaMetadata, String> {
    ReciboDeCajaMetadata findByDescripcion(String descripcion);
}
