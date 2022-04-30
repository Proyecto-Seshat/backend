package co.edu.javeriana.seshat.sofiplus.Modules.src.Troll.Methods;

import co.edu.javeriana.seshat.sofiplus.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import java.util.HashMap;

public class TrollAgent implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {
        Cliente cliente = (Cliente) Kernel.processRequest("module.teceros.getCliente", params).run();
        cliente.setNombres("Marico Antonio");
        return cliente;
    }
}
