package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface ComprobanteDeEgresoMetadataRepository extends MongoRepository<FacturaMetadata, String> {

    ComprobanteDeEgresoMetadata findById();
    ComprobanteDeEgresoMetadata findBymonto();
    ComprobanteDeEgresoMetadata findByFecha(Date fecha);
    ComprobanteDeEgresoMetadata findBySumaEnLetras(String sumaEnLetras);
    ComprobanteDeEgresoMetadata findByPorConceptoDe(boolean porConceptoDe);
    ComprobanteDeEgresoMetadata findByPagadoA(boolean pagadoA);
    ComprobanteDeEgresoMetadata findByTipoDePago(boolean tipoDePago);
    ComprobanteDeEgresoMetadata findByEstado(boolean Estado);

//aca falta algo averiguar q es



}
