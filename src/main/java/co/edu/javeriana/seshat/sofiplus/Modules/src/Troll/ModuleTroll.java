package co.edu.javeriana.seshat.sofiplus.Modules.src.Troll;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Troll.Methods.TrollAgent;
import org.springframework.stereotype.Component;

@Component
public class ModuleTroll extends BusinessModule {
    @Override
    public void init() {
        this.catalog.put("module.troll.trollAgent", TrollAgent.class);
        this.populate();
    }
}
