package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface FacturaMetadataRepository extends MongoRepository<FacturaMetadata, String> {
}
