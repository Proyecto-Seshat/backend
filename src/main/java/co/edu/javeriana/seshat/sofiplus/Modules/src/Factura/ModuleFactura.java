package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.*;
import org.springframework.stereotype.Component;

@Component
public class ModuleFactura extends BusinessModule {
    @Override
    public void init() {
        this.catalog.put("factura/post", CrearFactura.class);
        this.catalog.put("factura.consolidarFactura", ConsolidarFactura.class);
        this.catalog.put("factura/get", BuscarFactura.class);
        this.catalog.put("factura/filtrar/get", BuscarFacturas.class);
        this.populate();
    }
}
