package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import java.util.HashMap;

public class GetComprobanteDeEgreso implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {
        return new FacturaEntity((String) params.get("clienteCedula"), (int) params.get("total"));// porque pasa esto ?
    }
}
