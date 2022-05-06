package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Methods.GetDevolucion;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Methods.RegisterDevolucion;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.GetFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.RegisterFactura;
import org.springframework.stereotype.Component;

@Component
public class ModuleDevolucion extends BusinessModule {

    @Override
    public void init() {

        this.catalog.put("module.devolucion.getDevolucion", GetDevolucion.class);
        this.catalog.put("module.devolucion.registerDevolucion", RegisterDevolucion.class);
        this.populate();
    }
}
