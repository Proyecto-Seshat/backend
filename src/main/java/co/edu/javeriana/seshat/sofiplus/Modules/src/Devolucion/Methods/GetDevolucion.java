package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import java.util.HashMap;

public class GetDevolucion implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {
        return new FacturaEntity((String) params.get("clienteCedula"), (int) params.get("total"));// porque pasa esto ?  ojo no hay devolucion enttity, preguntar
    }
}
