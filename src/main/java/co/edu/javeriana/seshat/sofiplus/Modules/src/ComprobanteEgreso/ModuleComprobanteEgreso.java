package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Methods.GetReciboDeCaja;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Methods.RegisterReciboDeCaja;
import org.springframework.stereotype.Component;

@Component
public class ModuleComprobanteEgreso extends BusinessModule {
    @Override
    public void init(){
        this.catalog.put("module.ReciboDeCaja.getReciboDeCaja", GetReciboDeCaja.class);
        this.catalog.put("module.ReciboDeCaja.registerReciboDeCaja", RegisterReciboDeCaja.class);
        this.populate();
    }
}
