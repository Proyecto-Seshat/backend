package co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods.GetCliente;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods.RegisterCliente;
import org.springframework.stereotype.Component;

@Component
public class ModuleTerceros extends BusinessModule {
    public ModuleTerceros() {
    }

    @Override
    public void init() {
        this.catalog.put("module.terceros.registerCliente", RegisterCliente.class);
        this.catalog.put("module.teceros.getCliente", GetCliente.class);
        this.populate();
    }
}
