package co.edu.javeriana.seshat.sofiplus.Modules.src.Recurso.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.FamiempresaEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.RecursoEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class RegisterRecurso implements ModuleRunnable {

    @Autowired
    private DataBroker broker;

    @Override
    public Object run(HashMap<String, Object> params) {
        RecursoEntity recurso = new RecursoEntity();
        recurso.setIdRecurso((int) params.get("idRecurso"));
        recurso.setCuenta((String) params.get("cuenta"));
        return broker.registerRecurso(recurso);
    }
}
