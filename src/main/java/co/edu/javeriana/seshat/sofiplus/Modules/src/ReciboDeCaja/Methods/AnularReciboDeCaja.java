package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;

import java.util.HashMap;

@ModuleMethod
public class AnularReciboDeCaja implements ModuleRunnable {
    @Override
    public Object run(RequestMessage message) {
        //TODO: Implementar la logica para anular un recibo de caja
        return "OK";
    }
}
