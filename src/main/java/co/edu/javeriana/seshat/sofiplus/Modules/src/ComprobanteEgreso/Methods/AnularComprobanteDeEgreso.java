package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Entities.ComprobanteDeEgresoMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class AnularComprobanteDeEgreso implements ModuleRunnable {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    ComprobanteDeEgresoMetadataRepository comprobanteDeEgresoMetadataRepository;
    @Override
    public Object run(RequestMessage message) {
//        String faminit ;
//        faminit = (String) params.get("nitFamiempresa");
//        TypedQuery<ReaEntity> query = em.createQuery("select nitFamiempresa from EventoEntity  where nitFamiempresa =: faminit", ReaEntity.class);
//        ReaEntity rea = query.getSingleResult();
//        rea.setIdRecurso("egreso");
//        rea.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));
//
//        ComprobanteDeEgresoMetadata comprobanteDeEgresoMetadata = new ComprobanteDeEgresoMetadata();
//        comprobanteDeEgresoMetadata.setEstado(true);
//        comprobanteDeEgresoMetadataRepository.save(comprobanteDeEgresoMetadata);
        return "comprobante de egreso anulado";
    }
}
