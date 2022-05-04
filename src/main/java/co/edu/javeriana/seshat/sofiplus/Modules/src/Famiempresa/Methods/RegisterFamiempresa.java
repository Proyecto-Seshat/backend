package co.edu.javeriana.seshat.sofiplus.Modules.src.Famiempresa.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.FamiempresaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class RegisterFamiempresa implements ModuleRunnable {

    @Autowired
    private DataBroker broker;

    @Override
    public Object run(HashMap<String, Object> params) {
        FamiempresaEntity famiempresa = new FamiempresaEntity();
        famiempresa.setNit((String) params.get("nit"));
        famiempresa.setRazonSocial((String) params.get("razonSocial"));
        return broker.registerFamiempresa(famiempresa);
    }
}
