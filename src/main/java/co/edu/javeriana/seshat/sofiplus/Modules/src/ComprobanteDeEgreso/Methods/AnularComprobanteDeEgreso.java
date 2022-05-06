package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities.ComprobanteDeEgreso;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities.ComprobanteDeEgresoMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities.ComprobanteDeEgresoMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.DevolucionMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;


public class AnularComprobanteDeEgreso implements ModuleRunnable {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    ComprobanteDeEgresoMetadataRepository comprobanteDeEgresoMetadataRepository;
    @Override
    public Object run(HashMap<String, Object> params) {
        String faminit ;
        faminit = (String) params.get("nitFamiempresa");
        TypedQuery<ReaEntity> query = em.createQuery("select nitFamiempresa from EventoEntity  where nitFamiempresa =: faminit", ReaEntity.class);
        ReaEntity rea = query.getSingleResult();
        rea.setIdRecurso("egreso");
        rea.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));

        ComprobanteDeEgresoMetadata comprobanteDeEgresoMetadata = new ComprobanteDeEgresoMetadata();
        comprobanteDeEgresoMetadata.setEstado(true);
        comprobanteDeEgresoMetadataRepository.save(comprobanteDeEgresoMetadata);
        return "comprobante de egreso anulado";
    }
}
