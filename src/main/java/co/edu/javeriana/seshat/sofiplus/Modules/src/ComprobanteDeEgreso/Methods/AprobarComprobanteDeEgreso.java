package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Entities.ComprobanteDeEgreso;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;

public class AprobarComprobanteDeEgreso implements ModuleRunnable {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Object run(HashMap<String, Object> params) {
        String faminit ;
        faminit = (String) params.get("nitFamiempresa");
        TypedQuery<ReaEntity> query = em.createQuery("select nitFamiempresa from EventoEntity  where nitFamiempresa =: faminit", ReaEntity.class);
        ReaEntity rea = query.getSingleResult();
        rea.setIdRecurso("egreso");
        rea.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));

        ComprobanteDeEgreso comprobanteDeEgreso = new ComprobanteDeEgreso();
        comprobanteDeEgreso.setAprovado(true);


        return 0;
    }
}
