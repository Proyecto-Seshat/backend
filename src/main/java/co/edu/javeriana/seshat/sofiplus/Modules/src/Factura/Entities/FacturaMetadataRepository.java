package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface FacturaMetadataRepository extends MongoRepository<FacturaMetadata, String> {

    FacturaMetadata findById();
    FacturaMetadata findByFechaVencimiento(Date fechaVencimiento);
    FacturaMetadata findByFecha(Date fecha);
    //FacturaMetadata findByTotal(double total);
    FacturaMetadata findByTipoPago(boolean tipoPago);
    FacturaMetadata findByEstado(boolean Estado);

//aca falta algo averiguar q es



}
