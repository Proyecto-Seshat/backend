package co.edu.javeriana.seshat.sofiplus.Modules.Factura;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import java.util.HashMap;

public class getFactura implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {
        return new FacturaEntity((String)params.get("clienteCedula"), (int)params.get("total"));
    }
}
