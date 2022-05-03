package co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import org.springframework.stereotype.Component;

@Component
public class ModuleInventario extends BusinessModule {

    @Override
    public void init() {
        this.populate();
    }
}
