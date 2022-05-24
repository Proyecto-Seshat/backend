package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Entities;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface ComprobanteDeEgresoMetadataRepository extends MongoRepository<ComprobanteDeEgresoMetadata, String> {

    ComprobanteDeEgresoMetadata findById();
    ComprobanteDeEgresoMetadata findBymonto();
    ComprobanteDeEgresoMetadata findByFecha(Date fecha);
    ComprobanteDeEgresoMetadata findBySumaEnLetras(String sumaEnLetras);
    ComprobanteDeEgresoMetadata findByPorConceptoDe(boolean porConceptoDe);
    ComprobanteDeEgresoMetadata findByPagadoA(boolean pagadoA);
    ComprobanteDeEgresoMetadata findByTipoPago(boolean tipoDePago);
    ComprobanteDeEgresoMetadata findByEstado(boolean Estado);

//aca falta algo averiguar q es



}
