package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import org.springframework.stereotype.Component;

@Component
public class ModuleFactura extends BusinessModule {
    @Override
    public void init(){
        this.catalog.put("module.factura.getFactura", GetFactura.class);
        this.populate();
    }
}
