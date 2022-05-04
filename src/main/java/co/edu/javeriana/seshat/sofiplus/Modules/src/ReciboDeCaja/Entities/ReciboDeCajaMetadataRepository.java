package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface ReciboDeCajaMetadataRepository extends MongoRepository<FacturaMetadata, String> {

    ReciboDeCajaMetadata findById();
    ReciboDeCajaMetadata findBymonto();
    ReciboDeCajaMetadata findByFecha(Date fecha);
    ReciboDeCajaMetadata findBySumaEnLetras(String sumaEnLetras);
    ReciboDeCajaMetadata findByPorConceptoDe(boolean porConceptoDe);
    ReciboDeCajaMetadata findByRecibidoDe(boolean recibidoDe);
    ReciboDeCajaMetadata findByTipoDePago(boolean tipoDePago);
    ReciboDeCajaMetadata findByEstado(boolean Estado);

//aca falta algo averiguar q es



}
