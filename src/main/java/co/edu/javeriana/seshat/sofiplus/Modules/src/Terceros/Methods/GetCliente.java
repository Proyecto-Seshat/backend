package co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.PersonaEntity;
import co.edu.javeriana.seshat.sofiplus.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class GetCliente implements ModuleRunnable {

    @Autowired
    DataBroker broker;

    @Override
    public Object run(HashMap<String, Object> params) {
        String cedula = (String) params.get("cedula");
        Cliente res = new Cliente();
        PersonaEntity persona = broker.requestAgent(cedula);
        res.setCedula(persona.getIdPersona());
        res.setNombres(persona.getNombres());
        res.setApellidos(persona.getApellidos());
        return res;
    }
}
