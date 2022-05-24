package co.edu.javeriana.seshat.sofiplus.Modules.src.Troll.Methods;

import co.edu.javeriana.seshat.sofiplus.Modules.src.Tercero.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;

public class TrollAgent implements ModuleRunnable {
    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        Cliente cliente = (Cliente) Kernel.processRequest("module.teceros.getCliente", message).run();
        cliente.setNombre("Marico Antonio");
        return cliente;
    }
}
