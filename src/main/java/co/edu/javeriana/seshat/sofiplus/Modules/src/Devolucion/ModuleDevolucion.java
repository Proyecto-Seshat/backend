package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import org.springframework.stereotype.Component;

@Component
public class ModuleDevolucion extends BusinessModule {

    @Override
    public void init() {
        this.populate();
    }
}
