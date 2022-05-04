package co.edu.javeriana.seshat.sofiplus.Modules.src.Famiempresa;

import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Famiempresa.Methods.RegisterFamiempresa;
import org.springframework.stereotype.Component;

@Component
public class ModuleFamiempresa extends BusinessModule {
    @Override
    public void init() {
        Kernel.registerModuleRunnable("module.famiempresa.registerFamiempresa", RegisterFamiempresa.class);
        this.populate();
    }
}
