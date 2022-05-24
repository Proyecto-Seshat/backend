package co.edu.javeriana.seshat.sofiplus.Modules.src.Activo;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import org.springframework.stereotype.Component;

@Component
public class ModuleActivo extends BusinessModule {
    public ModuleActivo() {
    }
    @Override
    public void init() {
        this.populate();
    }
}
