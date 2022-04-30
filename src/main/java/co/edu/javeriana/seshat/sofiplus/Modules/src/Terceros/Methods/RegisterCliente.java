package co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.PersonaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class RegisterCliente implements ModuleRunnable {
    @Autowired
    DataBroker broker;

    @Override
    public Object run(HashMap<String, Object> params) {
        PersonaEntity persona = new PersonaEntity();
        persona.setIdPersona((String) params.get("cedula"));
        persona.setNombres((String) params.get("nombres"));
        persona.setApellidos((String) params.get("apellidos"));
        this.broker.registerAgent(persona);
        return "OK";
    }
}
