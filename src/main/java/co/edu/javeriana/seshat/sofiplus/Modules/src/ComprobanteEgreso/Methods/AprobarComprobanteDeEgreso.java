package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ModuleMethod
public class AprobarComprobanteDeEgreso implements ModuleRunnable {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Object run(RequestMessage message) {
//        String faminit ;
//        faminit = (String) params.get("nitFamiempresa");
//        TypedQuery<ReaEntity> query = em.createQuery("select nitFamiempresa from EventoEntity  where nitFamiempresa =: faminit", ReaEntity.class);
//        ReaEntity rea = query.getSingleResult();
//        rea.setIdRecurso("egreso");
//        rea.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));
//
//        ComprobanteDeEgreso comprobanteDeEgreso = new ComprobanteDeEgreso();
//        comprobanteDeEgreso.setAprovado(true);
        return 0;
    }
}
