package co.edu.javeriana.seshat.sofiplus.Repositories;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacturaMetadataRepository extends MongoRepository<FacturaMetadata, String> {

}
