package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.AnularFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.GetFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.RegisterFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods.TestFactura;
import org.springframework.stereotype.Component;

@Component
public class ModuleFactura extends BusinessModule {
    @Override
    public void init(){
        this.catalog.put("module.factura.getFactura", GetFactura.class);
        this.catalog.put("module.factura.registerFactura", RegisterFactura.class);
        this.catalog.put("module.factura.testFactura", TestFactura.class);
        this.catalog.put("module.factura.anularFactura", AnularFactura.class);
        this.populate();
    }
}
